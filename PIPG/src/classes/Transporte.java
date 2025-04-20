package classes;

import classes.Estacionamento;
import classes.Condutor;
import java.time.LocalDate;
import java.util.Objects;

public abstract class Transporte {

    private Categoria categoria;
    private String matricula;
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private double comprimento;
    private double largura;
    private double altura;
    private Estado estado;
    private Estacionamento estacionamento;
    private LocalDate dataEstacionamento;
    private Condutor condutor;

    public enum Categoria {
        VIATURA, MOTOCICLO
    }

    public enum Estado {
        ATIVO, BLOQUEADO, ESTACIONADO
    }

    //construtor----------------------------------------------------------------
    public Transporte(Categoria categoria, String matricula, String marca, String modelo, int ano, String cor, double comprimento,
            double largura, double altura, Condutor condutor) {
        this.categoria = categoria;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
        this.condutor = condutor;
        this.estado = Estado.ATIVO;
    }

    //g_s-----------------------------------------------------------------------
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Estacionamento getEstacionamento() {
        return estacionamento;
    }

    public void setEstacionamento(Estacionamento estacionamento) {
        this.estacionamento = estacionamento;
    }

    public LocalDate getDataEstacionamento() {
        return dataEstacionamento;
    }
    
    public Condutor getCondutor() {
        return condutor;
    }

    public void setCondutor(Condutor condutor) {
        this.condutor = condutor;
    }

    // Métodos para alterar estado transporte---------------------------------------------------------
    public void ativar() {
        this.estado = Estado.ATIVO;
    }

    public void bloquaer() {
        this.estado = Estado.BLOQUEADO;
    }

    public void estacionado() {
        this.estado = Estado.ESTACIONADO;
    }

    //Detalhes Transporte-------------------------------------------------------
    public String detalhesTransporte() {

        StringBuilder detalhes = new StringBuilder();

        detalhes.append("********DETALHES DO TRANSPORTE COM MATRICULA: ").append(matricula).append("********\n");
        detalhes.append("Categoria: ").append(categoria).append("\n");
        detalhes.append("Marca: ").append(marca).append("\n");
        detalhes.append("Modelo: ").append(modelo).append("\n");
        detalhes.append("Ano: ").append(ano).append(" anos\n");
        detalhes.append("Cor: ").append(cor).append("\n");
        detalhes.append("Comprimento: ").append(comprimento).append(" metros\n");
        detalhes.append("Largura: ").append(largura).append(" metros\n");
        detalhes.append("Altura: ").append(altura).append(" metros\n");
        detalhes.append("Estado: ").append(estado).append("\n");
        if (estado == Estado.ESTACIONADO) {
            detalhes.append("Id do estacionamento: ").append(String.format("%03d", estacionamento.getIDestacionamento())).append("\n");
            detalhes.append("Data estacionamento: ").append(getDataEstacionamento()).append("\n");
        }
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
