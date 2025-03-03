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
public class Professor extends Pessoa{
    private String especialidade;
    private float salario;
    
    public void receberAumento(float aumento){
        this.salario += aumento;
    }
    public String getEspecialidade(){
        return especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
    
}
