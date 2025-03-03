package pipg;

public class PIPG {

    public static void main(String[] args) {

        Estacionamento et[] = new Estacionamento[2];
        Viatura v[] = new Viatura[6];
        Estudante es[] = new Estudante[2];
        Professor p[] = new Professor[2];
        Funcionario f[] = new Funcionario[2];

        es[0] = new Estudante("Estudante", "Bruno", "1990-03-01", 'M', 284260888,
                925860123, v[0], 1344, "Engenharia Informatica", 3);
        es[1] = new Estudante("Estudante", "Francisca", "1980-06-02", 'F', 284560888,
                925780123, v[1], 4344, "Enfermagem", 2);
        p[0] = new Professor("Professor", "Pedro", "1980-06-02", 'M', 284560888,
                925780123, v[2], 4567, "Java");
        p[1] = new Professor("Professor", "Fernanda", "1980-06-02", 'F', 284560888,
                925780123, v[3], 3454, "C#");
        f[0] = new Funcionario("Funcionario", "Fabio", "1980-06-02", 'M', 284560888,
                925780123, v[4], 2456, "secretaria");
        f[1] = new Funcionario("Funcionario", "Tiana", "1980-06-02", 'F', 284560888,
                925780123, v[5], 8765, "Biblioteca");

        v[0] = new Viatura("AA-BB-12", "Renaul", "Megane", 2009, "Azul", 2.0, 1.0, 1.5, es[0]);
        v[1] = new Viatura("BB-BB-13", "Bmw", "z4", 2019, "Branco", 2.5, 1.0, 1.75, es[1]);
        v[2] = new Viatura("CC-BB-14", "Ferrari", "Roma", 2009, "Vermelho", 2.0, 1.0, 1.5, es[0]);
        v[3] = new Viatura("DD-BB-15", "Porshe", "taycan", 2019, "Preto", 2.5, 1.0, 1.75, es[1]);
        v[4] = new Viatura("EE-BB-16", "Nissan", "leaf", 2009, "Azul", 2.0, 1.0, 1.5, es[0]);
        v[5] = new Viatura("FF-BB-17", "Renaul", "Zoe", 2019, "Sizento", 2.5, 1.0, 1.75, es[1]);

        //atualizando as viaturas dos estudantes
        es[0].setViatura(v[0]);
//        es[0].adicionarViatura(v[0]);
        es[1].setViatura(v[1]);
        p[0].setViatura(v[2]);
        p[1].setViatura(v[3]);
        f[0].setViatura(v[4]);
        f[1].setViatura(v[5]);
        

        et[0] = new Estacionamento("Norte", "Estudante", 40.234567, -8.345689, 2.0, 1.5, 3.0);
        et[1] = new Estacionamento("Sul", "Professor", 41.234567, -7.345689, 2.0, 1.5, 3.0);

        //atualizando o veiculos dos estacionamentos
        et[0].setViatura(v[0]);
        et[1].setViatura(v[1]);

//MANIPULACAO CONDUTOR
        System.out.println("1");

        System.out.println(es[0].detalhesCondutor());
        System.out.println(es[1].detalhesCondutor());
        System.out.println(p[0].detalhesCondutor());
        System.out.println(p[1].detalhesCondutor());
        System.out.println(f[0].detalhesCondutor());
        System.out.println(f[1].detalhesCondutor());

        System.out.println("2\n");

//MANIPULACAO VIATURA    
        System.out.println(v[0].detalhesViatura());
        System.out.println(v[1].detalhesViatura());
        System.out.println(v[2].detalhesViatura());
        System.out.println(v[3].detalhesViatura());
        System.out.println(v[4].detalhesViatura());
        System.out.println(v[5].detalhesViatura());

        System.out.println("3\n");

//MANIPULACAO ESTACIONAMENTO 
        System.out.println(et[0].detalhesEstacionamento());
        System.out.println(et[1].detalhesEstacionamento());
    }
}
