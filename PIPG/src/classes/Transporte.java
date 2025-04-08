
package classes;

import classes.Estacionamento;
import classes.Condutor;
import java.util.Objects;


public abstract class Transporte {
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

    //construtor----------------------------------------------------------------
    public Transporte(String matricula, String marca, String modelo, int ano, String cor, double comprimento,
            double largura, double altura, Condutor condutor) {
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
    //g_s-----------------------------------------------------------------------
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

    public void setEstacionamento(Estacionamento estacionamento) {
        this.estacionamento = estacionamento;
    }

    public Condutor getCondutor() {
        return condutor;
    }

    public void setCondutor(Condutor condutor) {
        this.condutor = condutor;
    }

    //Estado Transporte---------------------------------------------------------
    public String estadoTransporte1() {
        if (ativo == false) {
            estado2 = "Não estacionado";
            return estado1 = "Não ativo";
        } else {
            return estado1 = "Ativo";
        }
    }

    public String estadoTransporte2() {
        if (estacionado == true) {
            return estado2 = "Estacionado";
        } else {
            return estado2 = "Não estacionado";
        }
    }
    //Detalhes Transporte-------------------------------------------------------
    public String detalhesTransporte() {

        StringBuilder detalhes = new StringBuilder();

        detalhes.append("********DETALHES DA VIATURA COM MATRICULA: ").append(matricula).append("********\n");
        detalhes.append("Marca: ").append(marca).append("\n");
        detalhes.append("Modelo: ").append(modelo).append("\n");
        detalhes.append("Ano: ").append(ano).append(" anos\n");
        detalhes.append("Cor: ").append(cor).append("\n");
        detalhes.append("Comprimento: ").append(comprimento).append(" metros\n");
        detalhes.append("Largura: ").append(largura).append(" metros\n");
        detalhes.append("Altura: ").append(altura).append(" metros\n");
        detalhes.append("Estado: ").append(estadoTransporte1()).append(" e ").append(estadoTransporte2()).append("\n");
        detalhes.append("Id do estacionamento: ").append(String.format("%03d", estacionamento.getIDestacionamento())).append("\n");
        detalhes.append("Nome do condutor: ").append(condutor.getNome()).append("\n");
        detalhes.append("Id do condutor: ").append(condutor.getIDcondutor()).append("\n");
        detalhes.append("**********************************************");
        return detalhes.toString();
    }
    //Comparador de dois objetos pela matricula---------------------------------
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;// Verifica se os dois objetos são a mesma instância
        }
        if (o == null || getClass() != o.getClass()) {
            return false;// Verifica se o objeto é nulo ou de classes diferentes
        }
        Transporte transporte = (Transporte) o;
        return Objects.equals(matricula, transporte.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

}
