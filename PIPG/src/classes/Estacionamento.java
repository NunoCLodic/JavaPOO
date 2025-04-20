package classes;

import interfaces.InterfaceEstacionamento;
import java.time.LocalDate;
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
    private Estado1 estado1;
    private Estado2 estado2;
    private Viatura viatura;
    private MensagemChat mensagem;
    protected List<Viatura> viaturas;

    public enum Zona {
        S_CENTRAIS, BIBLIOTECA, ESECD, ESS, ESTG, ESTH
    }

    public enum Categoria {
        PROFESSOR, ESTUDANTE, FUNCIONARIO, VISITANTE, DEFICIENTE, MOTOCICLO
    }

    public enum Estado1 {
        ATIVO, DESATIVO
    }

    public enum Estado2 {
        LIVRE, OCUPADO, INDISPONIVEL
    }

    //Construtor
    public Estacionamento(Zona zona, Categoria categoria, double latitude, double longitude, boolean coberto,
            double comprimentoMaximo, double larguraMaxima, double alturaMaxima) {
        this.id = contadorId;
        contadorId++;
        this.zona = zona;
        this.categoria = categoria;
        this.localizacao = new Localizacao(latitude, longitude);
        if (comprimentoMaximo < 0 || larguraMaxima < 0 || alturaMaxima < 0) {
            throw new IllegalArgumentException("Dimensões não podem ser negativas");
        }
        this.comprimentoMaximo = comprimentoMaximo;
        this.larguraMaxima = larguraMaxima;
        this.alturaMaxima = alturaMaxima;
        this.coberto = coberto;
        this.estado1 = Estado1.ATIVO;
        this.estado2 = Estado2.LIVRE;
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
    public void ativar() {
        this.estado1 = Estado1.ATIVO;
        this.estado2 = Estado2.LIVRE;
    }

    public void desativar() {
        if (estado2 == estado2.LIVRE) {
            this.estado1 = Estado1.DESATIVO;
            this.estado2 = Estado2.INDISPONIVEL;
        }
    }

    public void liberar() {
        if (estado1 == Estado1.ATIVO) {
            this.estado2 = Estado2.LIVRE;
        }
    }

    public void ocupar() {
        if (estado1 == Estado1.ATIVO) {
            this.estado2 = Estado2.OCUPADO;
        }
    }

    // Detalhes do estacionamento
    public String detalhesEstacionamento() {

        StringBuilder detalhes = new StringBuilder();

        detalhes.append("********DETALHES DO ESTACIONAMENTO COM ID: ").append(String.format("%03d", id)).append("********\n");
        detalhes.append("Zona: ").append(zona).append("\n");
        detalhes.append("Categoria: ").append(categoria).append("\n");
        detalhes.append("Localizacao: ").append(localizacao.toString()).append("\n");
        detalhes.append("Coberto?: ").append(coberto ? "sim" : "não").append("\n");
        detalhes.append("Dimensões Máximas... \n");
        detalhes.append("Comprimento: ").append(comprimentoMaximo).append(" metros\n");
        detalhes.append("Largura: ").append(larguraMaxima).append(" metros\n");
        if (coberto) {
            detalhes.append("Altura: ").append(alturaMaxima).append(" metros\n");
        }
        detalhes.append("Estado: ").append(estado1).append(" e ").append(estado2).append("\n");
        if (estado2 == Estado2.OCUPADO && viatura != null) {
            detalhes.append("Viatura Estacionada: ").append(viatura.getMatricula()).append("\n");
            detalhes.append("Data estacionamento: ").append(viatura.getDataEstacionamento()).append("\n");
        }
        detalhes.append("**********************************************");
        return detalhes.toString();
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
////        throw new UnsupportedOperationException("Método não implementado");
        System.out.println("Notificação enviada ao suporte.");

    }

    @Override
    public void enviarNotificacaoMotorista() {
////        throw new UnsupportedOperationException("Método não implementado");
        System.out.println("Notificação enviada ao motorista.");
    }

    @Override
    public void reservarEstacionamento(Transporte t, Estacionamento e) {
        if (e.estado2 == Estado2.LIVRE) {
            e.estado2 = Estado2.OCUPADO;
            e.viatura = (Viatura) t; // Casting para vincular transporte à viatura
            System.out.println("Estacionamento reservado para a viatura " + t.getMatricula());
        } else {
            System.out.println("Não é possível reservar: estacionamento não está livre.");
        }
    }

    @Override
    public void desocuparEstacionamento(Transporte t, Estacionamento e) {
        if (e.estado2 == Estado2.OCUPADO && e.viatura != null && e.viatura.getMatricula().equals(t.getMatricula())) {
            e.estado2 = Estado2.LIVRE;
            e.viatura = null; // Remove a viatura associada
            System.out.println("Estacionamento desocupado.");
        } else {
            System.out.println("Não é possível desocupar: estacionamento não ocupado por esta viatura.");
        }
    }

    @Override
    public void estacionar(Transporte t, Estacionamento e) {
//        throw new UnsupportedOperationException("Método não implementado");
        System.out.println("Viatura " + t.getMatricula() + " estacionada no lugar" + e.id);
    }

    //metodo para listar viaturas estacionadas no dia
    @Override
    public List<Viatura> listarViaturasPorDia(LocalDate data) {
        return viaturas.stream()
                .filter(viatura -> viatura.getDataEstacionamento() != null
                && viatura.getDataEstacionamento().isEqual(data))
                .collect(Collectors.toList());
    }

    //metodo para mostrar viaturas estacionadas no dia
    @Override
    public void mostrarViaturasPorDia(LocalDate data) {
        List<Viatura> viaturasNoDia = listarViaturasPorDia(data);

        if (viaturasNoDia.isEmpty()) {
            System.out.println("Nenhuma viatura estacionada na data " + data);
        } else {
            System.out.println("Viaturas estacionadas em " + data + ":");
            for (Viatura viatura : viaturasNoDia) {
                System.out.println("- " + viatura.getMatricula());
            }
        }
    }

}
