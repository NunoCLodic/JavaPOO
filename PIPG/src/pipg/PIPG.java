package pipg;

import classes.Viatura;
import classes.Professor;
import classes.Funcionario;
import classes.Estudante;
import classes.Estacionamento;
import static classes.Estacionamento.Categoria.DEFICIENTE;
import static classes.Estacionamento.Categoria.ESTUDANTE;
import static classes.Estacionamento.Categoria.MOTOCICLO;
import static classes.Estacionamento.Categoria.PROFESSOR;
import static classes.Estacionamento.Categoria.VISITANTE;
import static classes.Estacionamento.Zona.BIBLIOTECA;
import static classes.Estacionamento.Zona.ESECD;
import static classes.Estacionamento.Zona.ESS;
import static classes.Estacionamento.Zona.ESTH;
import static classes.Estacionamento.Zona.S_CENTRAIS;
import classes.Motociclo;
import static classes.Transporte.Categoria.VIATURA;
import java.time.LocalDate;
import java.util.HashSet;

public class PIPG {

    public static void main(String[] args) {

        //Criando Arraylist para armazenar os objectos
        HashSet<Estudante> estudantes = new HashSet<>();
        HashSet<Professor> professores = new HashSet<>();
        HashSet<Funcionario> funcionarios = new HashSet<>();
        HashSet<Viatura> viaturas = new HashSet<>();
        HashSet<Motociclo> motociclos = new HashSet<>();
        HashSet<Estacionamento> estacionamentos = new HashSet<>();

        //Inicializando os objectos e os adicionando no arraylist
        Estudante estudante1 = new Estudante("Estudante", "Bruno", "1990-03-01", 'M', 284260885, "925860123", "bruno@hotmail.com", "12345671", null, 1111111);
        Estudante estudante2 = new Estudante("Estudante", "Francisca", "1980-06-02", 'F', 284260886, "925780123", "francisca@hotmail.com", "12345672", null, 2222222);
        Estudante estudante3 = new Estudante("Estudante", "Miguel", "1990-03-01", 'M', 284260887, "925860123", "bruno@hotmail.com", "12345671", null, 3333333);
        Estudante estudante4 = new Estudante("Estudante", "Tiago", "1980-06-02", 'F', 284260887, "925780123", "francisca@hotmail.com", "12345672", null, 4444444);

        Professor professor1 = new Professor("Professor", "Pedro", "1990-03-01", 'M', 284260888, "925860123", "bruno@hotmail.com", "12345673", null, 1111, "Java");
        Professor professor2 = new Professor("Professor", "Fernanda", "1980-06-02", 'F', 284560888, "925860163", "fernanda@hotmail.com", "12345674", null, 2222, "c#");

        Funcionario funcionario1 = new Funcionario("Funcionario", "Fabio", "1980-06-02", 'M', 284560888, "925780123", "fabio@hotmail.com", "12345675", null, 3333, "secretaria");
        Funcionario funcionario2 = new Funcionario("Funcionario", "Tiana", "1980-06-02", 'F', 284560888, "925780123", "tiana@hotmail.com", "12345676", null, 4444, "finança");

        estudantes.add(estudante1);
        estudantes.add(estudante2);
        estudantes.add(estudante3);
        estudantes.add(estudante4);

        professores.add(professor1);
        professores.add(professor2);

        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);

        Viatura viatura1 = new Viatura(VIATURA,"AA-BB-12", "Renaul", "Megane", 2009, "Azul", 2.0, 1.0, 1.5, null);
        Viatura viatura2 = new Viatura(VIATURA,"AA-BB-12", "Bmw", "z4", 2019, "Branco", 2.5, 1.0, 1.75, null);//hashset ignorando, matricula duplicada
        Viatura viatura3 = new Viatura(VIATURA,"CC-BB-14", "Ferrari", "Roma", 2009, "Vermelho", 2.0, 1.0, 1.5, null);
        Viatura viatura4 = new Viatura(VIATURA,"DD-BB-15", "Porshe", "taycan", 2019, "Preto", 2.5, 1.0, 1.75, null);
        Viatura viatura5 = new Viatura(VIATURA,"EE-BB-16", "Nissan", "leaf", 2009, "Azul", 2.0, 1.0, 1.5, null);
        Viatura viatura6 = new Viatura(VIATURA,"FF-BB-17", "Renaul", "Zoe", 2019, "Sizento", 2.5, 1.0, 1.75, null);

//        Motociclo motociclo1 = new Motociclo(MOTOCICLO,"EE-BB-16", "Honda", "Cb1000 hornet Sp", 2009, "Azul", 2.0, 1.0, 1.5, null);
//        Motociclo motociclo2 = new Motociclo(MOTOCICLO,"FF-BB-17", "Yamaha", "Tracer 9 Gt+", 2019, "Sizento", 2.5, 1.0, 1.75, null);

        viaturas.add(viatura1);
        viaturas.add(viatura2);
        viaturas.add(viatura3);
        viaturas.add(viatura4);
        viaturas.add(viatura5);
        viaturas.add(viatura6);

//        motociclos.add(motociclo1);
//        motociclos.add(motociclo2);

        //Atualizando as viaturas a seus respectivos condutores
        viatura1.setCondutor(estudante1);
        viatura2.setCondutor(estudante2);
        viatura3.setCondutor(professor1);
        viatura4.setCondutor(professor2);
        viatura5.setCondutor(funcionario1);
        viatura6.setCondutor(funcionario2);

//        viaturas.add(viatura6)
//        estudante2.adicionarViatura(viatura2);
//        estudante3.adicionarMotociclo(viatura6);
//        estudante4.adicionarViatura(viatura2);
//        
//        professor1.adicionarViatura(viatura3);
//        professor2.adicionarViatura(viatura4);
//        funcionario1.adicionarViatura(viatura5);
//        funcionario2.adicionarViatura(viatura6);
        Estacionamento estacionamento1 = new Estacionamento(ESECD, ESTUDANTE, 40.234567, -8.345689, true, 2.0, 1.5, 3.0);
        Estacionamento estacionamento2 = new Estacionamento(S_CENTRAIS, PROFESSOR, 40.234567, -8.345689, true, 2.0, 1.5, 3.0);//hashset ignorando
        Estacionamento estacionamento3 = new Estacionamento(BIBLIOTECA, VISITANTE, 41.234567, -8.345689, false, 2.0, 1.5, 3.0);
        Estacionamento estacionamento4 = new Estacionamento(ESS, DEFICIENTE, 42.234567, -7.345689, false, 2.0, 1.5, 3.0);
        Estacionamento estacionamento5 = new Estacionamento(ESTH, MOTOCICLO, 43.234567, -8.345689, true, 2.0, 1.5, 3.0);
        Estacionamento estacionamento6 = new Estacionamento(ESECD, ESTUDANTE, 43.234567, -8.345688, false, 2.0, 1.5, 3.0);

        estacionamentos.add(estacionamento1);
        estacionamentos.add(estacionamento2);
        estacionamentos.add(estacionamento3);
        estacionamentos.add(estacionamento4);
        estacionamentos.add(estacionamento5);
        estacionamentos.add(estacionamento6);

        //atualizando os estacionamento com as suas viaturas
        estacionamento1.setViatura(viatura1);
        estacionamento2.setViatura(viatura2);
        estacionamento3.setViatura(viatura3);
        estacionamento4.setViatura(viatura4);
        estacionamento5.setViatura(viatura5);
        estacionamento6.setViatura(viatura6);

        viatura1.setEstacionamento(estacionamento1);
        viatura2.setEstacionamento(estacionamento2);
        viatura3.setEstacionamento(estacionamento3);
        viatura4.setEstacionamento(estacionamento4);
        viatura5.setEstacionamento(estacionamento5);
        viatura6.setEstacionamento(estacionamento6);

        estacionamento6.desativar();
        estacionamento6.liberar();//ignorado porque esta desativo
        estacionamento4.ocupar();
//        estacionamento6.ativar();

        //EXEMPLOS PAGAMENTOS MENSALIDADE
        //registrar pagamento
        System.out.println("\n");
        estudante1.registrarPagamento(LocalDate.of(2025, 1, 1));
        estudante1.registrarPagamento(LocalDate.of(2025, 2, 1));
        estudante1.registrarPagamento(LocalDate.of(2025, 3, 1));
        estudante1.registrarPagamento(LocalDate.of(2025, 4, 1));
        System.out.println("\n");
        estudante2.registrarPagamento(LocalDate.of(2025, 1, 1));
        estudante2.registrarPagamento(LocalDate.of(2025, 2, 1));
        estudante2.registrarPagamento(LocalDate.of(2025, 4, 1));
        System.out.println("\n");

        // Verificar se o motorista pagou a mensalidade de março
        boolean pagoMarco1 = estudante1.verificarPagamento(LocalDate.of(2025, 3, 1));
        System.out.println("Mensalidade de março do motorista " + estudante1.getNome() + " foi paga? " + (pagoMarco1 ? "Sim" : "Não"));

        boolean pagoMarco2 = estudante2.verificarPagamento(LocalDate.of(2025, 3, 1));
        System.out.println("Mensalidade de março do motorista " + estudante2.getNome() + " foi paga? " + (pagoMarco2 ? "Sim" : "Não"));

        System.out.println("\n");
        // Exibir histórico de pagamentos
        estudante1.mostrarHistoricoPagamento();
        estudante2.mostrarHistoricoPagamento();
        System.out.println("\n");

        //Exibindo os dados das listas
        //total de viaturas
        System.out.println("\n**********INFORMAÇÕES GERAIS**********\n ");
        for (Viatura viatura : viaturas) {
            System.out.println("Viatura: " + viatura.getMatricula());
        }
        System.out.println("\n Total de viaturas na lista: " + viaturas.size() + "\n");

        //total de estacionamento
        for (Estacionamento estacionamento : estacionamentos) {
            System.out.println("Estacionamento: " + String.format("%03d", estacionamento.getIDestacionamento()));
        }
        System.out.println("\n Total de estacionamento na lista: " + estacionamentos.size() + "\n");

        //total de estudante
        for (Estudante estudante : estudantes) {
            System.out.println("Estudante " + estudante.getnEstudante());
        }
        System.out.println("\n Total de estudante na lista: " + estudantes.size() + "\n");

        //total de funcionario
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Funcionario: " + funcionario.getId());
        }
        System.out.println("\n Total de funcionarios na lista: " + funcionarios.size() + "\n");

        //total de professor
        for (Professor professor : professores) {
            System.out.println("Professor: " + professor.getId());
        }
        System.out.println("\n Total de professor na lista: " + professores.size() + "\n");

        //*******************************************************************************************************************************************
        System.out.println("\n**********INFORMAÇÕES DETALHADAS**********\n ");
        estudantes.forEach((estudante) -> {
            System.out.println(estudante.detalhesCondutor());
        });
        professores.forEach((professor) -> {
            System.out.println(professor.detalhesCondutor());
        });
        funcionarios.forEach((funcionario) -> {
            System.out.println(funcionario.detalhesCondutor());
        });
        viaturas.forEach((viatura) -> {
            System.out.println(viatura.detalhesTransporte());
        });
        estacionamentos.forEach((estacionamento) -> {
            System.out.println(estacionamento.detalhesEstacionamento());
        });
//
//        LocalDate dataDesejada = LocalDate.of(2025, 4, 20);
//        estacionamento1.mostrarViaturasPorDia(dataDesejada);

    }

}
