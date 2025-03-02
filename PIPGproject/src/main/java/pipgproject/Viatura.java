package pipgproject;
import java.util.UUID;//Gera um ID unico

public class Viatura implements InterfaceViatura{
    //atributos da viatura
    private String IDviatura;
    private String matricula;
    public String marca;
    public String modelo;
    public int ano;
    public String cor;
    public double comprimento;
    public double largura;
    public double altura;
    public Boolean estacionado;
    public Boolean ativo;
    private Condutor condutor;
    
    //construtor

    public Viatura(String matricula, String marca, String modelo, int ano, String cor,double comprimento,
            double largura, double altura,Condutor condutor) {
        this.IDviatura = UUID.randomUUID().toString().replace("-", "").substring(0, 8);//Gera um ID unico com 8 carateres maximo
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
        this.condutor = condutor;
        this.estacionado = false;
        this.ativo = false; 
    }
    
    //get e set, 

    public String getIDviatura() {
        return IDviatura;
    }

    public void setIDviatura(String IDviatura) {
        this.IDviatura = IDviatura;
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

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Boolean getEstacionado() {
        return estacionado;
    }

    public void setEstacionado(Boolean estacionado) {
        this.estacionado = estacionado;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Condutor getCondutor() {
        return condutor;
    }

    public void setCondutor(Condutor condutor) {
        this.condutor = condutor;
    }
    
    //metodo detalhes Viatura

    public String detalhesViatura() {
        return "***********DETALHES DA VIATURA COM ID: "+IDviatura +"**************"  
                + "\n matricula: " + matricula 
                + "\n marca: " + marca 
                + "\n modelo: " + modelo 
                + "\n ano: " + ano 
                + "\n cor: " + cor 
                + "\n comprimento: " + comprimento +" metros"
                + "\n largura: " + largura +" metros"
                + "\n altura: " + altura +" metros"
                + "\n estacionado: " + estacionado 
                + "\n ativo: " + ativo 
                + "\n condutor: " + condutor.getNome()
                +"\n******************************************************";
    }
    
    
    
    //Metodos da viatura
   
    @Override
    public void ativarViatura(Viatura v) {
        this.ativo = true;
    }
    @Override
    public void desativarViatura(Viatura v) {
        this.ativo = false;  
        this.estacionado = false;
    }

    @Override
    public void estacionarViatura(Viatura v) {
        this.estacionado = true;
    }

    @Override
    public void desocuparEstacionamento(Viatura v) {
        this.estacionado = false;
    }

    @Override
    public void editarViatura(Viatura v) {
    //em construcão
    }


    
}

    