package classes;

import interfaces.InterfaceEstacionamento;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Estacionamento implements InterfaceEstacionamento {

    //atributos da classe estacionamento
    private int id;
    private static int contadorId = 1;//se nao for estatico, cada instancia da classe terá sua propria copia do contador.
    private String zona;
    private String categoria;
    private Localizacao localizacao;
    private boolean coberto;
    private double comprimentoMaximo;
    private double larguraMaxima;
    private double alturaMaxima;
    private Boolean ativo;
    private Boolean livre;
    private Viatura viatura;
    private MensagemChat mensagem;
    protected List<Viatura> viaturas;

    //Construtor
    public Estacionamento(String zona, String categoria, double latitude, double longitude, boolean coberto,
            double comprimentoMaximo, double larguraMaxima, double alturaMaxima) {

        this.zona = zona;
        this.categoria = categoria;
        this.localizacao = new Localizacao(latitude, longitude);
        this.comprimentoMaximo = comprimentoMaximo;
        this.larguraMaxima = larguraMaxima;
        this.alturaMaxima = alturaMaxima;

        this.ativo = true;
        this.livre = true;
        this.coberto = coberto;

        this.id = contadorId;
        contadorId++;
    }

    //get e sett, nao tem set estacionamento
    public int getIDestacionamento() {
        return id;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public boolean getcoberto() {
        return coberto;
    }

    public void setcoberto(boolean area) {
        this.coberto = area;
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

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Boolean getLivre() {
        return livre;
    }

    public void setLivre(Boolean livre) {
        this.livre = livre;
    }

    public Viatura getViatura() {
        return viatura;
    }

    public void setViatura(Viatura viatura) {
        this.viatura = viatura;
    }

    //Ativar e desativar estacionamento
    public Boolean ativar() {
        return ativo = true;
    }

    public Boolean Desativar() {
        return ativo = false;

    }

    //Metodo que verifica o estado do estacionamento
    public String estadoEstacionamento1() {
        String estado1;
        if (getAtivo() == true) {
            return estado1 = "Ativo";
        } else {
            return estado1 = "Desativo";
        }
    }

    public String estadoEstacionamento2() {
        String estado2;
        if ((getAtivo() == true) && ((getLivre() == true))) {
            return estado2 = "Livre";
        } else if ((getAtivo() == false) && ((getLivre() == true))) {
            return estado2 = "Null";
        } else {
            return estado2 = "Ocupado";
        }
    }

    // Detalhes do estacionamento
    public String detalhesEstacionamento() {

        StringBuilder detalhes = new StringBuilder();

        detalhes.append("********DETALHES DO ESTACIONAMENTO COM ID: ").append(String.format("%03d", id)).append("********\n");
        detalhes.append("Zona: ").append(categoria).append("\n");
        detalhes.append("Categoria: ").append(categoria).append("\n");
        detalhes.append("Localizacao: ").append(localizacao.toString()).append("\n");
        detalhes.append("Coberto?: ").append(coberto ? "sim" : "não").append("\n");
        detalhes.append("Comprimento Maximo: ").append(comprimentoMaximo).append(" metros\n");
        detalhes.append("Largura Maxima: ").append(larguraMaxima).append(" metros\n");
        if (coberto == true) {
            detalhes.append("Altura Maxima: ").append(alturaMaxima).append(" metros\n");
        }
        detalhes.append("Estado: ").append(estadoEstacionamento1()).append(" e ").append(estadoEstacionamento2()).append("\n");
        if (getLivre() == false) {
            detalhes.append("Matricula da viatura: ").append(viatura.getMatricula()).append("\n");
        }
        detalhes.append("**********************************************");
        return detalhes.toString();

//        return "*********** DETALHES DO ESTACIONAMENTO COM ID: " + String.format("%03d", id) + " **************"//adiciona 3 casas deciamais
//                + "\n zona:" + zona
//                + ";\n categoria:" + categoria
//                + ";\n localizacao:" + localizacao.toString()
//                + ";\n comprimento Maximo:" + comprimentoMaximo + " metros"
//                + ";\n largura Maxima:" + larguraMaxima + " metros"
//                + ";\n altura Maxima:" + alturaMaxima + " metros"
//                + ";\n estado:" + estadoEstacionamento1() + " e " + estadoEstacionamento2()
//                + ";\n id da viatura:" + ((getAtivo() != false) || (viatura != null) ? viatura.getIDviatura() : "null")//se estacionamento estiver desativo, nao pode mostrar dados da viatura
//                + ";\n matricula:" + ((getAtivo() != false) || (viatura != null) ? viatura.getMatricula() : "null")//n funciona
//                + ";\n******************************************************\n";
    }

//compara objetos 
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Estacionamento estacionamento = (Estacionamento) o;
        return Objects.equals(localizacao.toString(), estacionamento.localizacao.toString());
    }

    @Override
    public int hashCode() {
        return Objects.hash(localizacao.toString());
    }

//metodos da classe
    @Override
    public void enviarNotificacaoSuporte() {
        //em construcao
    }

    @Override
    public void enviarNotificacaoMotorista() {
        //em construcao
    }

    @Override
    public void reservarEstacionamento(Transporte t, Estacionamento e) {
        if ((e.getAtivo() == true) && (e.getLivre() == true)) {
            System.out.println("10 Minutos até o transporte " + t.getMatricula() + " estacionar");
        } else {
            System.out.println("impossivel reservar estacionamento");
        }
    }

    @Override
    public void desocuparEstacionamento(Transporte t, Estacionamento e) {
        //eem construcao
    }

    @Override
    public void estacionar(Transporte t, Estacionamento e) {
        //em construcao
    }

}
