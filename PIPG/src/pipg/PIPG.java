
package pipg;

public class PIPG {

    public static void main(String[] args) {
        
        Condutor c[] = new Condutor[2];
        Viatura v[] = new Viatura[2];
        Estacionamento e [] = new Estacionamento[2];
        
        c[0] = new Condutor(1234,"Nuno",'M',284260888,925860123);
        c[1] = new Condutor(1323,"Cleisy",'F',284560888,925780123);
        
        v[0] = new Viatura(123,"AA-BB-12","Renaul","Megane",2009,"Azul",c[0]);
        v[1] = new Viatura(342,"BB-BB-12","Renaul","Zoe",2019,"Branca",c[1]);
        
        e[0] = new Estacionamento(23,"Norte","Aluno",23455777);
        e[1] = new Estacionamento(21,"Sul","Professores",94855777);
        
        
        System.out.println(c[0].DetalhesCondutor());
        System.out.println("***********************************");
        System.out.println(c[1].DetalhesCondutor());
        System.out.println("***********************************");
        System.out.println(e[0].getLivre());
    }
    
}
