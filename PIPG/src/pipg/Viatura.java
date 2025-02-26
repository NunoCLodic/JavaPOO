
package pipg;

public class Viatura implements InterfaceViatura{
    //atributos da viatura
    private int id_viatura;
    private String matricula;
    public String marca;
    public String modelo;
    public int ano;
    public String cor;
    public Boolean estacionado;
    private Condutor condutor;
    
    //construtor

    public Viatura(int id_viatura, String matricula, String marca, String modelo, int ano, String cor, Condutor condutor) {
        this.id_viatura = id_viatura;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.condutor = condutor;
        this.estacionado = false;
    }
    
    //get e set, 

    public int getId_viatura() {
        return id_viatura;
    }

    public void setId_viatura(int id_viatura) {
        this.id_viatura = id_viatura;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Boolean getEstacionado() {
        return estacionado;
    }

    public void setEstacionado(Boolean estacionado) {
        this.estacionado = estacionado;
    }

    public Condutor getCondutor() {
        return condutor;
    }

    public void setCondutor(Condutor condutor) {
        this.condutor = condutor;
    }
    
    //Metodos de viatura
   
    @Override
    public void estacionarViatura() {
        this.estacionado = true;
    }

    @Override
    public void desocuparEstacionamento() {
        this.estacionado = false;
    }
    
}

    