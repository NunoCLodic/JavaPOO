/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipg;

public class Estacionamento implements InterfaceEstacionamento{

    //atributos da classe estacionamento
    private int IDestacionamento;
    private String zona;
    private String categoria;
    private int localizacao;
    private Boolean livre;
    private Boolean manuntencao;
    private Viatura viatura;

    //Construtor

    public Estacionamento(int id_estacionamento, String zona, String categoria, int localizacao) {
        this.IDestacionamento = id_estacionamento;
        this.zona = zona;
        this.categoria = categoria;
        this.localizacao = localizacao;
        this.livre = true;
        this.manuntencao = false;
    }
    
    //get e sett

    public int getId_estacionamento() {
        return IDestacionamento;
    }

    public void setId_estacionamento(int id_estacionamento) {
        this.IDestacionamento = id_estacionamento;
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

    public Boolean getManuntencao() {
        return manuntencao;
    }

    public void setManuntencao(Boolean manuntencao) {
        this.manuntencao = manuntencao;
    }
    
    
  // Detalhes do estacionamento

    public String DetalhesEstacionamento() {
        return "Estacionamento{" + "id_estacionamento=" + IDestacionamento + ";\n zona=" 
                + zona + ";\n categoria=" + categoria + ";\n localizacao=" + localizacao + ";\n livre=" 
                + livre + ";\n viatura=" + viatura.getMatricula() + '}';
    }
    //metodo reservar estacionamento
    @Override
    public void reservarEstacionamento(Viatura x) {
        if ((getLivre() == true)&&(getManuntencao() == false)){
            System.out.println("10 Minutos até a Viatura "+x.getMatricula()+"estacionar");
        }else{
            System.out.println("impossivel reservar estacionamento");
        }
        
    }

    @Override
    public void manuntencaoEstacionamento() {
        this.manuntencao = true;
    }
    
}
