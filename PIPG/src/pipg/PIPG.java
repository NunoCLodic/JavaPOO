package pipg;

public class PIPG {

    public static void main(String[] args) {

        Estacionamento e[] = new Estacionamento[2];
        Viatura v[] = new Viatura[2];
        Estudante es[] = new Estudante[2];

        es[0] = new Estudante("Professor", "Bruno", "1990-03-01", 'M', 284260888, 925860123, v[0], 1344, "Engenharia Informatica", 3);
        es[1] = new Estudante("Estudante", "Francisca", "1980-06-02", 'F', 284560888, 925780123, v[1], 4344, "Enfermagem", 2);

        v[0] = new Viatura("AA-BB-12", "Renaul", "Megane", 2009, "Azul", 2.0, 1.0, 1.5, es[0]);
        v[1] = new Viatura("BB-BB-12", "Renaul", "Zoe", 2019, "Branca", 2.5, 1.0, 1.75, es[1]);
        
        //atualizando as viaturas dos estudantes
        es[0].setViatura(v[0]);
//        es[0].adicionarViatura(v[0]);
        es[1].setViatura(v[1]);

        e[0] = new Estacionamento("Norte", "Estudante", 40.234567, -8.345689, 2.0, 1.5, 3.0);
        e[1] = new Estacionamento("Sul", "Professor", 41.234567, -7.345689, 2.0, 1.5, 3.0);
        
        //atualizando o veiculos dos estacionamentos
        e[0].setViatura(v[0]);
        e[1].setViatura(v[1]);

//MANIPULACAO CONDUTOR
        System.out.println("1");

        System.out.println(es[0].detalhesCondutor());
        System.out.println(es[1].detalhesCondutor());

        System.out.println("2\n");

//MANIPULACAO VIATURA    
        System.out.println(v[0].detalhesViatura());
        System.out.println(v[1].detalhesViatura());

        System.out.println("3\n");

//MANIPULACAO ESTACIONAMENTO 
        System.out.println(e[0].detalhesEstacionamento());
        System.out.println(e[1].detalhesEstacionamento());
    }
}
