package pipg;

import java.util.UUID;

public class Estacionamento implements InterfaceEstacionamento {

    //atributos da classe estacionamento
    private String id;
    private String zona;
    private String categoria;
    private Localizacao localizacao;
    private double comprimentoMaximo;
    private double larguraMaxima;
    private double alturaMaxima;
    private Boolean ativo;
    private Boolean livre;
    private Viatura viatura;
    private MensagemChat mensagem;

    //Construtor
    public Estacionamento(String zona, String categoria, double latitude, double longitude,
            double comprimentoMaximo, double larguraMaxima, double alturaMaxima) {

        this.id = UUID.randomUUID().toString().replace("-", "").substring(0, 4);
        this.zona = zona;
        this.categoria = categoria;
        this.localizacao = new Localizacao(latitude, longitude);
        this.comprimentoMaximo = comprimentoMaximo;
        this.larguraMaxima = larguraMaxima;
        this.alturaMaxima = alturaMaxima;

        this.ativo = true;
        this.livre = true;
    }

    //get e sett, nao tem set estacionamento
    public String getIDestacionamento() {
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
        if ((getLivre() == true)&&((getAtivo()==true))) {
            return estado2 = "Livre";
        } else {
            return estado2 = "Ocupado";
        }
    }

    // Detalhes do estacionamento
    public String detalhesEstacionamento() {

        return "*********** DETALHES DO ESTACIONAMENTO COM ID " + id + " **************"
                + "\n zona:" + zona
                + ";\n categoria:" + categoria
                + ";\n localizacao:" + getLocalizacao().getLatitude() + " , " + getLocalizacao().getLongitude()
                + ";\n comprimento Maximo:" + comprimentoMaximo + " metros"
                + ";\n largura Maxima:" + larguraMaxima + " metros"
                + ";\n altura Maxima:" + alturaMaxima + " metros"
                + ";\n estado:" + estadoEstacionamento1() + " e " + estadoEstacionamento2()
                + ";\n id da viatura:" + (viatura != null ? viatura.getIDviatura() : "Nenhum4")//nao funciona
                + ";\n matricula:" + (viatura != null ? viatura.getMatricula() : "Nenhum5")//nao funciona
                + ";\n******************************************************\n";

    }

    @Override
    public void enviarMensagemSuporte() {
        //em construcao
    }

    @Override
    public void enviarMensagemMotorista() {
        //em construcao
    }

}
