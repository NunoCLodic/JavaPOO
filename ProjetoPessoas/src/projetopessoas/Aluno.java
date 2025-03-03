/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopessoas;

/**
 *
 * @author Administrador
 */
public class Aluno extends Pessoa{
    //atributos do aluno
    private int matricula;
    private String curso;
    
    //metodos cancelar matricula e pagar matricula
    public void cancelarMatricula(){
        
    }
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do(a)Aluno(a)" + this.nome+"!");
    }
    
    //metodos especiais
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
