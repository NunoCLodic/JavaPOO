/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LutadorGit;
import LutadorGit.Lutador;

public class LutadorGit {
    public static void main(String[] args) {
     
             Lutador l[] = new Lutador[6];
             
             l[0]=   new Lutador("Nuno","STP",31,1.75f,68.9f,10,2,2);
             l[1]=   new Lutador("Valter","Principe",27,1.65f,69.9f,12,4,2);
             l[2]=   new Lutador("Vanderley","Portugal",45,1.95f,55.9f,11,2,1);
             l[3]=   new Lutador("Abanildo","França",34,1.85f,79.9f,13,2,1);
             l[4]=   new Lutador("Jose","Angola",32,1.60f,80.9f,9,2,1);
             l[5]=   new Lutador("JAckson","Guine",33,1.45f,75.9f,11,5,4);
                
             l[0].apresentar();
             l[0].status();
             
             l[3].apresentar();
             l[3].status();
    }
    
}
