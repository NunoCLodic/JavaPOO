package pipg;

import java.util.UUID;//Gera um ID unico

public class Viatura implements InterfaceViatura {

    //atributos da viatura
    private String IDviatura;
    private String matricula;
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private double comprimento;
    private double largura;
    private double altura;
    private Boolean estacionado;
    private Boolean ativo;
    private String estado1;
    private String estado2;
    private Estacionamento estacionamento;
    private Condutor condutor;

    //construtor
    public Viatura(String matricula, String marca, String modelo, int ano, String cor, double comprimento,
            double largura, double altura, Condutor condutor) {
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
        this.ativo = true;
        this.estado1 = "Ativo";
        this.estacionado = true;
        this.estado2 = "Estacionado";
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

    public String getEstado() {
        return estado1;
    }

    public void setEstado(String estado) {
        this.estado1 = estado;
    }

    public String getEstado2() {
        return estado2;
    }

    public void setEstado2(String estado2) {
        this.estado2 = estado2;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Estacionamento getEstacionamento() {
        return estacionamento;
    }

    public Condutor getCondutor() {
        return condutor;
    }

    public void setCondutor(Condutor condutor) {
        this.condutor = condutor;
    }

    //Metodos estados da viatura
    public String estadoViatura1() {
        if (ativo == false) {
            estado2 = "Não estacionado";
            return estado1 = "Não ativo";
        } else {
            return estado1 = "Ativo";
        }
    }

    public String estadoViatura2() {
        if (estacionado == true) {
            return estado2 = "Estacionado";
        } else {
            return estado2 = "Não estacionado";
        }
    }

    //metodo detalhes Viatura
    public String detalhesViatura() {
        return "***********DETALHES DA VIATURA COM ID: " + IDviatura + " **************"
                + "\n matricula: " + matricula
                + ";\n marca: " + marca
                + ";\n modelo: " + modelo
                + ";\n ano: " + ano
                + ";\n cor: " + cor
                + ";\n comprimento: " + comprimento + " metros"
                + ";\n largura: " + largura + " metros"
                + ";\n altura: " + altura + " metros"
                + ";\n estado: " + estadoViatura1() + " e " + estadoViatura2()
                + ";\n id do estacionamento: " + (estacionamento != null ? estacionamento.getIDestacionamento() : "Nenhum1")//nao funciona
                + ";\n nome do condutor: " + (condutor != null ? condutor.getNome() : "Nenhum2")//nao funciona
                + ";\n id do condutor: " + (condutor != null ? condutor.getIDcondutor() : "Nenhum3")//nao funciona
                + ";\n******************************************************\n";
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
    public void estacionarViatura(Viatura v, Estacionamento e) {
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
