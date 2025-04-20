package classes;

import interfaces.InterfaceEstacionamento;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Estacionamento implements InterfaceEstacionamento {

    //atributos da classe estacionamento
    private int id;
    private static int contadorId = 1;//se nao for estatico, cada instancia da classe terá sua propria copia do contador.
    private Zona zona;
    private Categoria categoria;
    private Localizacao localizacao;
    private boolean coberto;
    private double comprimentoMaximo;
    private double larguraMaxima;
    private double alturaMaxima;
    public Estado1 estado1;
    public Estado2 estado2;
    private Viatura viatura;
    private MensagemChat mensagem;
    protected HashSet<Transporte> transportes;
    private HashSet<Estacionamento> estacionamentos;
    private LocalDateTime horarioReserva;

    public enum Zona {
        S_CENTRAIS, BIBLIOTECA, ESECD, ESS, ESTG, ESTH
    }

    public enum Categoria {
        E_PROFESSOR, E_ESTUDANTE, E_FUNCIONARIO, E_VISITANTE, E_DEFICIENTE, E_MOTOCICLO
    }

    public enum Estado1 {
        ATIVO, DESATIVO
    }

    public enum Estado2 {
        LIVRE, RESERVADO, OCUPADO, INDISPONIVEL
    }

    //Construtor
    public Estacionamento(Zona zona, Categoria categoria, double latitude, double longitude, boolean coberto,
            double comprimentoMaximo, double larguraMaxima, double alturaMaxima) {

        if (comprimentoMaximo < 0 || larguraMaxima < 0 || alturaMaxima < 0) {
            throw new IllegalArgumentException("Dimensões não podem ser negativas");
        }
        if (latitude < -90 || latitude > 90) {
            throw new IllegalArgumentException("Latitude inválida. Deve estar entre -90 e 90.");
        }
        if (longitude < -180 || longitude > 180) {
            throw new IllegalArgumentException("Longitude inválida. Deve estar entre -180 e 180.");
        }

        this.id = contadorId;
        contadorId++;
        this.zona = zona;
        this.categoria = categoria;
        this.localizacao = new Localizacao(latitude, longitude);
        this.comprimentoMaximo = comprimentoMaximo;
        this.larguraMaxima = larguraMaxima;
        this.alturaMaxima = alturaMaxima;
        this.coberto = coberto;
        this.estado1 = Estado1.ATIVO;
        this.estado2 = Estado2.LIVRE;
        this.transportes = new HashSet<>();
        this.estacionamentos = new HashSet<>();
        this.horarioReserva = null;
    }

    //get e sett, nao tem set estacionamento
    public int getIDestacionamento() {
        return id;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public boolean getcoberto() {
        return coberto;
    }

    public void setcoberto(boolean coberto) {
        this.coberto = coberto;
    }

    public double getComprimentoMaximo() {
        return comprimentoMaximo;
    }

    public void setComprimentoMaximo(double comprimentoMaximo) {
        this.comprimentoMaximo = comprimentoMaximo;
    }

    public double getLarguraMaxima() {
        return larguraMaxima;
    }

    public void setLarguraMaxima(double larguraMaxima) {
        this.larguraMaxima = larguraMaxima;
    }

    public double getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(double alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public Estado1 getEstado1() {
        return estado1;
    }

    public void setEstado1(Estado1 estado1) {
        this.estado1 = estado1;
    }

    public Estado2 getEstado2() {
        return estado2;
    }

    public void setEstado2(Estado2 estado) {
        this.estado2 = estado2;
    }

    public Viatura getViatura() {
        return viatura;
    }

    public void setViatura(Viatura viatura) {
        this.viatura = viatura;
    }

    // Métodos para alterar estado estacionamento
    private void alterarEstado(Estado1 novoEstado1, Estado2 novoEstado2) {
        this.estado1 = novoEstado1;
        this.estado2 = novoEstado2;
    }

    public void ativar() {
        alterarEstado(Estado1.ATIVO, Estado2.LIVRE);
    }

    public void desativar() {
        if (estado2 == Estado2.LIVRE) {
            alterarEstado(Estado1.DESATIVO, Estado2.INDISPONIVEL);
        }
    }

    public void liberar() {
        if (estado1 == Estado1.ATIVO) {
            alterarEstado(Estado1.ATIVO, Estado2.LIVRE);
        }
    }

    public void ocupar() {
        if (estado1 == Estado1.ATIVO) {
            alterarEstado(Estado1.ATIVO, Estado2.OCUPADO);
        }
    }

    // Detalhes do estacionamento
    public String detalhesEstacionamento() {
        return new StringBuilder()
                .append("********DETALHES DO ESTACIONAMENTO COM ID: ").append(String.format("%03d", id)).append("********\n")
                .append("Zona: ").append(zona).append("\n")
                .append("Categoria: ").append(categoria).append("\n")
                .append("Localização: ").append(localizacao).append("\n")
                .append("Coberto?: ").append(coberto ? "Sim" : "Não").append("\n")
                .append("Dimensões Máximas: \n")
                .append("  Comprimento: ").append(comprimentoMaximo).append(" metros\n")
                .append("  Largura: ").append(larguraMaxima).append(" metros\n")
                .append(coberto ? "  Altura: " + alturaMaxima + " metros\n" : "")
                .append("Estado: ").append(estado1).append(" e ").append(estado2).append("\n")
                .append((estado2 == Estado2.OCUPADO && viatura != null)
                        ? "Viatura Estacionada: " + viatura.getMatricula() + "\nData estacionamento: " + viatura.getDataEstacionamento() + "\n"
                        : "")
                .append("**********************************************")
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Estacionamento estacionamento = (Estacionamento) o;
        return Objects.equals(localizacao.getLatitude(), estacionamento.localizacao.getLatitude())
                && Objects.equals(localizacao.getLongitude(), estacionamento.localizacao.getLongitude());
    }

    @Override
    public int hashCode() {
        return Objects.hash(localizacao.toString());
    }

    //metodos da classe
    @Override
    public void enviarNotificacaoSuporte() {
        System.out.println("Notificação enviada ao suporte.");

    }

    @Override
    public void enviarNotificacaoMotorista() {
        System.out.println("Notificação enviada ao motorista.");
    }

    @Override
    public void reservarEstacionamento(Transporte t) {
        verificarReservaExpirada(); // Verifica antes de tentar reservar
        if (estado2 == Estado2.LIVRE) {
            if (t.getComprimento() <= getComprimentoMaximo()
                    && t.getLargura() <= getLarguraMaxima()
                    && (!coberto || t.getAltura() <= getAlturaMaxima())) {

                viatura = (t instanceof Viatura) ? (Viatura) t : null; // Vincular transporte
                estado2 = Estado2.RESERVADO;
                horarioReserva = LocalDateTime.now(); // Registra o horário atual
                System.out.println("Estacionamento reservado para o transporte " + t.getMatricula());
            } else {
                System.out.println("Transporte não atende os requisitos do estacionamento.");
            }
        } else {
            System.out.println("Não é possível reservar: estacionamento não está livre.");
        }
    }

    @Override
    public void verificarReservaExpirada() {
        if (horarioReserva != null && estado2 == Estado2.RESERVADO) {
            LocalDateTime agora = LocalDateTime.now();
            Duration duracao = Duration.between(horarioReserva, agora);

            if (duracao.toMinutes() > 20) {
                liberar(); // Método que muda o estado para LIVRE
                horarioReserva = null; // Remove o horário da reserva
                System.out.println("A reserva expirou. O estacionamento foi liberado.");
            }
        }
    }

    @Override
    public void desocuparEstacionamento(Transporte t) {
        if (estado2 == Estado2.OCUPADO && viatura != null && viatura.getMatricula().equals(t.getMatricula())) {
            estado2 = Estado2.LIVRE;
            viatura = null; // Remove a viatura associada
            System.out.println("Estacionamento desocupado.");
        } else {
            System.out.println("Não é possível desocupar: estacionamento não ocupado por esta viatura.");
        }
    }

    @Override
    public void estacionar(Transporte t, Estacionamento e) {
        System.out.println("Transporte " + t.getMatricula() + " estacionada no lugar" + e.id);
    }

    //metodo para listar viaturas estacionadas no dia
    @Override
    public List<Transporte> listarTransportesPorDia(LocalDate data) {
        return transportes.stream()
                .filter(transporte -> transporte.getDataEstacionamento() != null
                && viatura.getDataEstacionamento().isEqual(data))
                .collect(Collectors.toList());
    }

    //metodo para mostrar viaturas estacionadas no dia
    @Override
    public void mostrarViaturasPorDia(LocalDate data) {
        List<Transporte> transportesNoDia = listarTransportesPorDia(data);

        if (transportesNoDia.isEmpty()) {
            System.out.println("**********************MOSTRAR TRANSPORTE POR DIA*************************");
            System.out.println("Nenhuma viatura estacionada na data " + data);
        } else {
            System.out.println("**********************MOSTRAR TRANSPORTE POR DIA*************************");
            System.out.println("Viaturas estacionadas em " + data + ":");
            for (Transporte transporte : transportesNoDia) {
                System.out.println("- " + transporte.getMatricula());
            }
        }
    }

}
