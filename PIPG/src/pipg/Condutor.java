/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipg;

public class Condutor {
    
    //Atributs da classe condutor
    private int IDcondutor;
    private String nome;
    private char sexo;
    private int contribuinte;
    private int contato;
    private int IDviatura;

    //construtor

    public Condutor(int IDcondutor, String nome, char sexo, int contribuinte, int contato) {
        this.IDcondutor = IDcondutor;
        this.nome = nome;
        this.sexo = sexo;
        this.contribuinte = contribuinte;
        this.contato = contato;
    }
    //get e sett

    public int getIDcondutor() {
        return IDcondutor;
    }

    public void setIDcondutor(int IDcondutor) {
        this.IDcondutor = IDcondutor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getContribuinte() {
        return contribuinte;
    }

    public void setContribuinte(int contribuinte) {
        this.contribuinte = contribuinte;
    }

    public int getContato() {
        return contato;
    }

    public void setContato(int contato) {
        this.contato = contato;
    }

    public int getIDviatura() {
        return IDviatura;
    }

    public void setIDviatura(int IDviatura) {
        this.IDviatura = IDviatura;
    }
    //Detalhes do motorista

    public String DetalhesCondutor() {
        return "Condutor{" + "IDcondutor=" + IDcondutor + ";\n nome=" 
                + nome + ";\n sexo=" + sexo + ";\n contribuinte=" 
                + contribuinte + ";\n contato=" + contato + ";\n IDviatura=" 
                + IDviatura + '}';
    }
    
}
