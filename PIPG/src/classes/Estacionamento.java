package classes;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;

public class Estacionamento {

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
    private Transporte transporte;
    private MensagemChat mensagem;
    protected HashSet<Transporte> transportes;
    private HashSet<Estacionamento> estacionamentos;
    private String dataHoraEstacionamento;
    private GerenciadorEstacionamento gerenciadorE;

    public enum Zona {
        S_CENTRAIS, BIBLIOTECA, ESECD, ESS, ESTG, ESTH
    }

    public enum Categoria {
        E_PROFESSOR, E_ESTUDANTE, E_FUNCIONARIO, E_VISITANTE, E_DEFICIENTE, E_MOTOCICLO
    }

    public enum Estado1 {
        ATIVO, INATIVO
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

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public String getDataHoraEstacionamento() {
        return dataHoraEstacionamento;
    }

    public void setDataHoraEstacionamento(String dataHoraEstacionamento) {
        this.dataHoraEstacionamento = dataHoraEstacionamento;
    }

    public HashSet<Transporte> getTransportes() {
        return transportes;
    }

    public void setTransportes(HashSet<Transporte> transportes) {
        this.transportes = transportes;
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
            alterarEstado(Estado1.INATIVO, Estado2.INDISPONIVEL);
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

    public String calcularTempoRestante(LocalDateTime horarioFinal) {
        if (dataHoraEstacionamento == null) {
            return "Reserva sem data definida.";
        }

        LocalDateTime agora = LocalDateTime.now();
        Duration restante = Duration.between(agora, horarioFinal);

        if (restante.isNegative() || restante.isZero()) {
            liberar(); // Método que muda o estado para LIVRE
            return "Tempo expirado!";
        } else {
            long minutos = restante.toMinutes();
            long segundos = restante.minusMinutes(minutos).getSeconds();
            return minutos + " minutos e " + segundos + " segundos restantes.";
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
                .append("Estado: ").append(estado1).append(" e ").append((estado1 == Estado1.INATIVO) ? estado2.INDISPONIVEL : estado2)
                .append("\n")
                .append((estado2 == Estado2.OCUPADO && transporte != null && dataHoraEstacionamento != null)
                        ? "Transporte Estacionado: " + transporte.getMatricula() + "\n Data estacionamento: " + dataHoraEstacionamento + "\n"
                        : "")
                .append((estado2 == Estado2.RESERVADO && transporte != null)
                        ? "Transporte da reserva: " + transporte.getMatricula() + "\n Reserva criada em: " + dataHoraEstacionamento
                        + "\n Tempo restante: " + "\n"
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

    public boolean isMatriculaEstacionada(String matricula) {
        // Verifica se há um transporte estacionado e se a matrícula é a mesma
        return this.transporte != null && this.transporte.getMatricula().equals(matricula);
    }

}
