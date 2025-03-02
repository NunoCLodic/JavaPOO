package pipg;

import java.util.UUID;

public class Estacionamento implements InterfaceEstacionamento {

    //atributos da classe estacionamento
    private String IDestacionamento;
    private String zona;
    private String categoria;
    private Localizacao localizacao;
    private double comprimentoMaximo;
    private double larguraMaxima;
    private double alturaMaxima;
    private Boolean ativo;
    private Boolean livre;
    private String estado1;
    private String estado2;
    private Viatura viatura;
    private MensagemChat mensagem;

    //Construtor
    public Estacionamento(String zona, String categoria, double latitude, double longitude,
            double comprimentoMaximo, double larguraMaxima, double alturaMaxima) {

        this.IDestacionamento = UUID.randomUUID().toString().replace("-", "").substring(0, 4);
        this.zona = zona;
        this.categoria = categoria;
        this.localizacao = new Localizacao(latitude, longitude);
        this.comprimentoMaximo = comprimentoMaximo;
        this.larguraMaxima = larguraMaxima;
        this.alturaMaxima = alturaMaxima;

        this.ativo = false;
        this.livre = false;
    }

    //get e sett, nao tem set estacionamento
    public String getIDestacionamento() {
        return IDestacionamento;
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
    public String livreOcupado(){
        if(getLivre()==true){
            return estado1 = "Livre";
        }else{
            return estado1 = "Ocupado";
        }
    }
    
    public String ativoDesativo(){
        if(getAtivo()==true){
            return estado2 = "Ativo";
        }else{
            return estado2 = "Desativo";
        }
    }

    // Detalhes do estacionamento
    public String detalhesEstacionamento() {

        if (livre == false) {
            return "*********** DETALHES DO ESTACIONAMENTO COM ID " + IDestacionamento + " **************"
                    + ";\n zona:" + zona
                    + ";\n categoria:" + categoria
                    + ";\n localizacao(lat,long):" + getLocalizacao().getLatitude() + " , " + getLocalizacao().getLongitude()
                    + ";\n comprimento Maximo:" + comprimentoMaximo + " metros"
                    + ";\n largura Maxima:" + larguraMaxima + " metros"
                    + ";\n altura Maxima:" + alturaMaxima + " metros"
                    + ";\n estado:" + ativoDesativo()+ " e " + livreOcupado()
                    + ";\n viatura:" + viatura + " (em construcao)"
                    + ";\n******************************************************\n";
        } else {
            return "*********** DETALHES DO ESTACIONAMENTO COM ID " + IDestacionamento + " **************"
                    + ";\n zona:" + zona
                    + ";\n categoria:" + categoria
                    + ";\n localizacao(lat,long):" + getLocalizacao().getLatitude() + " , " + getLocalizacao().getLongitude()
                    + ";\n comprimento Maximo:" + comprimentoMaximo + " metros"
                    + ";\n largura Maxima:" + larguraMaxima + " metros"
                    + ";\n altura Maxima:" + alturaMaxima + " metros"
                    + ";\n estado:" + ativoDesativo()+ " e " + livreOcupado()
                    + ";\n******************************************************\n";
        }
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
