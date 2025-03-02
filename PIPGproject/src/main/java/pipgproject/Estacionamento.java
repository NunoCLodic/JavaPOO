package pipgproject;

public class Estacionamento implements InterfaceEstacionamento{

    //atributos da classe estacionamento
    private int IDestacionamento;
    private String zona;
    private String categoria;
    private int localizacao;
    private int comprimentoMaximo;
    private int larguraMaxima;
    private int alturaMaxima;
    private Boolean ativo;
    private Boolean livre;
    private Viatura viatura;

    //Construtor

    public Estacionamento(int IDestacionamento, String zona, String categoria, int localizacao, int comprimentoMaximo, int larguraMaxima, int alturaMaxima) {
        this.IDestacionamento = IDestacionamento;
        this.zona = zona;
        this.categoria = categoria;
        this.localizacao = localizacao;
        this.comprimentoMaximo = comprimentoMaximo;
        this.larguraMaxima = larguraMaxima;
        this.alturaMaxima = alturaMaxima;
        
        this.ativo = true;
        this.livre = true;
    }
    
  //get e sett

    public int getIDestacionamento() {
        return IDestacionamento;
    }

    public void setIDestacionamento(int IDestacionamento) {
        this.IDestacionamento = IDestacionamento;
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

    public int getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(int localizacao) {
        this.localizacao = localizacao;
    }

    public int getComprimentoMaximo() {
        return comprimentoMaximo;
    }

    public void setComprimentoMaximo(int comprimentoMaximo) {
        this.comprimentoMaximo = comprimentoMaximo;
    }

    public int getLarguraMaxima() {
        return larguraMaxima;
    }

    public void setLarguraMaxima(int larguraMaxima) {
        this.larguraMaxima = larguraMaxima;
    }

    public int getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(int alturaMaxima) {
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
 
  // Detalhes do estacionamento

    public String detalheEstacionamento() {
        return "DETALHES DO ESTACIONEMANETO:" 
                + "\n IDestacionamento:" + IDestacionamento 
                + "\n zona:" + zona 
                + "\n categoria:" + categoria 
                + "\n localizacao:" + localizacao 
                + "\n comprimentoMaximo:" + comprimentoMaximo 
                + "\n larguraMaxima:" + larguraMaxima 
                + "\n alturaMaxima:" + alturaMaxima 
                + "\n ativo:" + ativo 
                + "\n livre:" + livre 
                + "\n viatura:" + viatura 
                ;
    }

    //metodo reservar estacionamento
    @Override
    public void reservarEstacionamento(Viatura x) {
        if ((getAtivo()== true)&&(getLivre() == true)){
            System.out.println("10 Minutos até a Viatura "+x.getMatricula()+" estacionar");
        }else{
            System.out.println("impossivel reservar estacionamento");
        }     
    }

    @Override
    public void ativarEstacionamento(Estacionamento E){
        this.ativo = true;
    }

    @Override
    public void desativarEstacionamento(Estacionamento E) {
        this.ativo = false;
    }
    
}
