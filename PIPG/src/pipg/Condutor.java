/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pipg;

import java.util.UUID;

public class Condutor {
    
    //Atributs da classe condutor
    private String IDcondutor;
    private String nome;
    private char sexo;
    private int contribuinte;
    private int contato;
    private Viatura viatura;
    

    //construtor

    public Condutor(String nome, char sexo, int contribuinte, int contato, Viatura viatura) {
        this.IDcondutor = UUID.randomUUID().toString().replace("-", "").substring(0, 8);
        this.nome = nome;
        this.sexo = sexo;
        this.contribuinte = contribuinte;
        this.contato = contato;
        this.viatura = viatura;
    }
    //get e sett

    public String getIDcondutor() {
        return IDcondutor;
    }

    public void setIDcondutor(String IDcondutor) {
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
    
    //get do ID da viatura
    
    public String getIdDaViatura(){
        return viatura.getIDviatura();
    }
    
    //Detalhes do motorista

    public String DetalhesCondutor() {
        return "*********** DETALHES DO CONDUTOR COM ID: "+IDcondutor +" **************"  
                + ";\n nome: "  + nome 
                + ";\n sexo: " + sexo 
                + ";\n contribuinte: " + contribuinte 
                + ";\n contato: " + contato 
                + ";\n ID da viatura: " /*+ getIdDaViatura()*/
                +"\n******************************************************";
    }
    
}
