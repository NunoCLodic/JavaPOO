
package pipgproject;

public class PIPGproject {


    public static void main(String[] args) {
        
       Condutor c[] = new Condutor[2];
       Viatura v[] = new Viatura[2];
        //Estacionamento e [] = new Estacionamento[2];
        
        c[0] = new Condutor("Nuno","1990-03-01",'M',284260888,925860123, v[0]);
        c[1] = new Condutor("Cleisy","1980-06-02",'F',284560888,925780123, v[1]);
        
        v[0] = new Viatura("AA-BB-12","Renaul","Megane",2009,"Azul",2,1,1.5,c[0]);
        v[1] = new Viatura("BB-BB-12","Renaul","Zoe",2019,"Branca",2.5,1,1.75,c[1]);
        
        //e[0] = new Estacionamento(23,"Norte","Aluno",23455777);
        //e[1] = new Estacionamento(21,"Sul","Professores",94855777);        

//MANIPULACAO VIATURA    
        System.out.println(v[0].detalhesViatura()); 
        System.out.println(v[1].detalhesViatura()); 
        
//MANIPULACAO CONDUTOR
        System.out.println(c[0].DetalhesCondutor());
        System.out.println(c[1].DetalhesCondutor());
//        System.out.println(c[1].getIdDaViatura());


    }
    
}
