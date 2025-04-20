package pipg;

import classes.Condutor;
import static classes.Condutor.Categoria.ESTUDANTE;
import static classes.Condutor.Categoria.FUNCIONARIO;
import static classes.Condutor.Categoria.PROFESSOR;
import classes.Viatura;
import classes.Professor;
import classes.Funcionario;
import classes.Estudante;
import classes.Estacionamento;
import static classes.Estacionamento.Categoria.E_DEFICIENTE;
import static classes.Estacionamento.Categoria.E_ESTUDANTE;
import static classes.Estacionamento.Categoria.E_MOTOCICLO;
import static classes.Estacionamento.Categoria.E_PROFESSOR;
import static classes.Estacionamento.Categoria.E_VISITANTE;
import static classes.Estacionamento.Zona.BIBLIOTECA;
import static classes.Estacionamento.Zona.ESECD;
import static classes.Estacionamento.Zona.ESS;
import static classes.Estacionamento.Zona.ESTH;
import static classes.Estacionamento.Zona.S_CENTRAIS;
import static classes.Funcionario.Seccao.S_FINANCA;
import static classes.Funcionario.Seccao.S_SECRETARIA;
import classes.GerenciadorCondutor;
import classes.GerenciadorEstacionamento;
import classes.GerenciadorTransporte;
import classes.Motociclo;
import static classes.Professor.Cadeiras.C_ENGSOFTWARE;
import static classes.Professor.Cadeiras.C_PROGRAMACAO;
import classes.Transporte;
import static classes.Transporte.Categoria.MOTOCICLO;
import static classes.Transporte.Categoria.VIATURA;
import java.time.LocalDate;
import java.util.HashSet;

public class PIPG {

    public static void main(String[] args) {

        GerenciadorTransporte gerenciadorT = new GerenciadorTransporte();
        GerenciadorCondutor gerenciadorC = new GerenciadorCondutor();
        GerenciadorEstacionamento gerenciadorE = new GerenciadorEstacionamento();

        //preencher condutor
        Condutor estudante1 = new Estudante(ESTUDANTE, "Bruno", "01-03-1990", 'M', 284260885, "925860123", "bruno@hotmail.com", "12345671", null, 1111111);
        Condutor estudante2 = new Estudante(ESTUDANTE, "Francisca", "02-03-1990", 'F', 284260886, "925780123", "francisca@hotmail.com", "12345672", null, 2222222);
        Condutor estudante3 = new Estudante(ESTUDANTE, "Miguel", "03-03-1990", 'M', 284260887, "925860123", "bruno@hotmail.com", "12345671", null, 3333333);
        Condutor estudante4 = new Estudante(ESTUDANTE, "Tiago", "04-03-1990", 'F', 284260887, "925780123", "francisca@hotmail.com", "12345672", null, 4444444);
        Condutor professor1 = new Professor(PROFESSOR, "Pedro", "05-03-1990", 'M', 284260888, "925860123", "bruno@hotmail.com", "12345673", null, 1111, C_PROGRAMACAO);
        Condutor professor2 = new Professor(PROFESSOR, "Fernanda", "06-03-1990", 'F', 284560888, "925860163", "fernanda@hotmail.com", "12345674", null, 2222, C_ENGSOFTWARE);
        Condutor professor3 = new Professor(PROFESSOR, "Ana", "06-03-1991", 'F', 284560889, "925860165", "ana@hotmail.com", "12345675", null, 3333, C_ENGSOFTWARE);
        Condutor funcionario1 = new Funcionario(FUNCIONARIO, "Fabio", "07-03-1990", 'M', 284560888, "925780123", "fabio@hotmail.com", "12345675", null, 1111, S_SECRETARIA);
        Condutor funcionario2 = new Funcionario(FUNCIONARIO, "Tiana", "08-03-1990", 'F', 284560888, "925780123", "tiana@hotmail.com", "12345676", null, 2222, S_FINANCA);
        Condutor funcionario3 = new Funcionario(FUNCIONARIO, "Fabia", "03-03-1990", 'F', 284560878, "925780623", "fabia@hotmail.com", "12365676", null, 3333, S_FINANCA);

        //adicionar condutor
        gerenciadorC.adicionarCondutor(estudante1);
        gerenciadorC.adicionarCondutor(estudante2);
        gerenciadorC.adicionarCondutor(estudante3);
        gerenciadorC.adicionarCondutor(estudante4);
        gerenciadorC.adicionarCondutor(professor1);
        gerenciadorC.adicionarCondutor(professor2);
        gerenciadorC.adicionarCondutor(professor3);
        gerenciadorC.adicionarCondutor(funcionario1);
        gerenciadorC.adicionarCondutor(funcionario2);
        gerenciadorC.adicionarCondutor(funcionario3);

        //tentar adicionar condutor em duplicado
        gerenciadorC.adicionarCondutor(professor3);

        //listar condutores
        gerenciadorC.listarCondutor();

        //remover um condutor
        gerenciadorC.removerCondutor(professor3);

        //listar depois da remoção
        gerenciadorC.listarCondutor();

        //preencher transporte
        Transporte viatura1 = new Viatura(VIATURA, "AA-BB-12", "Renaul", "Megane", 2009, "Azul", 2.0, 1.0, 1.5, null);
        Transporte viatura2 = new Viatura(VIATURA, "AA-BB-12", "Bmw", "z4", 2019, "Branco", 2.5, 1.0, 1.75, null);//hashset ignorando, matricula duplicada
        Transporte viatura3 = new Viatura(VIATURA, "CC-BB-14", "Ferrari", "Roma", 2009, "Vermelho", 2.0, 1.0, 1.5, null);
        Transporte viatura4 = new Viatura(VIATURA, "DD-BB-15", "Porshe", "taycan", 2019, "Preto", 2.5, 1.0, 1.75, null);
        Transporte viatura5 = new Viatura(VIATURA, "EE-BB-16", "Nissan", "leaf", 2009, "Azul", 2.0, 1.0, 1.5, null);
        Transporte viatura6 = new Viatura(VIATURA, "FF-BB-17", "Renaul", "Zoe", 2019, "Sizento", 2.5, 1.0, 1.75, null);
        Transporte viatura7 = new Viatura(VIATURA, "FF-BB-18", "Renaul", "Zoe", 2025, "Sizento", 2.5, 1.0, 1.75, null);
        Transporte motociclo1 = new Motociclo(MOTOCICLO, "EE-BB-16", "Honda", "Cb1000 hornet Sp", 2009, "Azul", 2.0, 1.0, 1.5, null);
        Transporte motociclo2 = new Motociclo(MOTOCICLO, "FF-BB-17", "Yamaha", "Tracer 9 Gt+", 2019, "Sizento", 2.5, 1.0, 1.75, null);
        Transporte motociclo3 = new Motociclo(MOTOCICLO, "FF-BB-18", "Suzuki", "tinger", 2020, "preta", 2.5, 1.0, 1.75, null);

        //adicionar transporte
        gerenciadorT.adicionarTransporte(viatura1);
        gerenciadorT.adicionarTransporte(viatura2);
        gerenciadorT.adicionarTransporte(viatura3);
        gerenciadorT.adicionarTransporte(viatura4);
        gerenciadorT.adicionarTransporte(viatura5);
        gerenciadorT.adicionarTransporte(viatura6);
        gerenciadorT.adicionarTransporte(viatura7);
        gerenciadorT.adicionarTransporte(motociclo1);
        gerenciadorT.adicionarTransporte(motociclo2);
        gerenciadorT.adicionarTransporte(motociclo3);

        //tentar adicionar em duplicado
        gerenciadorT.adicionarTransporte(viatura1);

        //listar os transporte
        gerenciadorT.listarTransportes();

        //remover um transporte
        gerenciadorT.removerTransporte(viatura7);

        //listar transportes depois de remoção
        gerenciadorT.listarTransportes();
        
        //Atribuiar as viaturas aos motoristas
        gerenciadorC.atribuirViaturaAoCondutor(estudante1, viatura1);
        gerenciadorC.atribuirViaturaAoCondutor(estudante2, viatura2);
        gerenciadorC.atribuirViaturaAoCondutor(estudante3, viatura3);
        gerenciadorC.atribuirViaturaAoCondutor(estudante4, viatura4);
        gerenciadorC.atribuirViaturaAoCondutor(professor1, viatura5);
        gerenciadorC.atribuirViaturaAoCondutor(professor2, viatura6);
        gerenciadorC.atribuirViaturaAoCondutor(professor3, viatura7);
        gerenciadorC.atribuirViaturaAoCondutor(funcionario1, motociclo1);
        gerenciadorC.atribuirViaturaAoCondutor(funcionario2, motociclo2);
        gerenciadorC.atribuirViaturaAoCondutor(funcionario3, motociclo3);
       
        //preencher lista estacionamento
        Estacionamento estacionamento1 = new Estacionamento(ESECD, E_ESTUDANTE, 40.234567, -8.345689, true, 2.0, 1.5, 3.0);
        Estacionamento estacionamento2 = new Estacionamento(S_CENTRAIS, E_PROFESSOR, 40.234567, -8.345689, true, 2.0, 1.5, 3.0);//hashset ignorando
        Estacionamento estacionamento3 = new Estacionamento(BIBLIOTECA, E_VISITANTE, 41.234567, -8.345689, false, 2.0, 1.5, 3.0);
        Estacionamento estacionamento4 = new Estacionamento(ESS, E_DEFICIENTE, 42.234567, -7.345689, false, 2.0, 1.5, 3.0);
        Estacionamento estacionamento5 = new Estacionamento(ESTH, E_MOTOCICLO, 43.234567, -8.345689, true, 2.0, 1.5, 3.0);
        Estacionamento estacionamento6 = new Estacionamento(ESECD, E_ESTUDANTE, 44.234567, -8.345688, false, 2.0, 1.5, 3.0);
        Estacionamento estacionamento7 = new Estacionamento(ESECD, E_ESTUDANTE, 45.234567, -8.345688, false, 2.0, 1.5, 3.0);
        Estacionamento estacionamento8 = new Estacionamento(ESECD, E_ESTUDANTE, 46.234567, -8.345688, false, 2.0, 1.5, 3.0);
        Estacionamento estacionamento9 = new Estacionamento(ESECD, E_ESTUDANTE, 47.234567, -8.345688, false, 2.0, 1.5, 3.0);
        Estacionamento estacionamento10 = new Estacionamento(ESS, E_DEFICIENTE, 48.234567, -8.335688, false, 2.0, 1.5, 3.0);
        
        //adicionar estacionamento
        gerenciadorE.adicionarEstacionamento(estacionamento1);
        gerenciadorE.adicionarEstacionamento(estacionamento2);
        gerenciadorE.adicionarEstacionamento(estacionamento3);
        gerenciadorE.adicionarEstacionamento(estacionamento4);
        gerenciadorE.adicionarEstacionamento(estacionamento5);
        gerenciadorE.adicionarEstacionamento(estacionamento6);
        gerenciadorE.adicionarEstacionamento(estacionamento7);
        gerenciadorE.adicionarEstacionamento(estacionamento8);
        gerenciadorE.adicionarEstacionamento(estacionamento9);
        gerenciadorE.adicionarEstacionamento(estacionamento10);
 
        //listar todos estacionamentos
        gerenciadorE.listarEstacionamentos();
        
        
        //estacionar viaturas aqui...
  

        //Exemplo pagamento mensalidade
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

//        //Exibindo os dados das listas
//        //total de viaturas
//        System.out.println("\n**********INFORMAÇÕES GERAIS**********\n ");
//        for (Viatura viatura : viaturas) {
//            System.out.println("Viatura: " + viatura.getMatricula());
//        }
//        System.out.println("\n Total de viaturas na lista: " + viaturas.size() + "\n");
//
//        //total de estacionamento
//        for (Estacionamento estacionamento : estacionamentos) {
//            System.out.println("Estacionamento: " + String.format("%03d", estacionamento.getIDestacionamento()));
//        }
//        System.out.println("\n Total de estacionamento na lista: " + estacionamentos.size() + "\n");
//
//        //total de estudante
//        for (Estudante estudante : estudantes) {
//            System.out.println("Estudante " + estudante.getnEstudante());
//        }
//        System.out.println("\n Total de estudante na lista: " + estudantes.size() + "\n");
//
//        //total de funcionario
//        for (Funcionario funcionario : funcionarios) {
//            System.out.println("Funcionario: " + funcionario.getId());
//        }
//        System.out.println("\n Total de funcionarios na lista: " + funcionarios.size() + "\n");
//
//        //total de professor
//        for (Professor professor : professores) {
//            System.out.println("Professor: " + professor.getId());
//        }
//        System.out.println("\n Total de professor na lista: " + professores.size() + "\n");
//
////*******************************************************************************************************************************************
//        System.out.println("\n**********INFORMAÇÕES DETALHADAS**********\n ");
//        estudantes.forEach((estudante) -> {
//            System.out.println(estudante.detalhesCondutor());
//        });
//        professores.forEach((professor) -> {
//            System.out.println(professor.detalhesCondutor());
//        });
//        funcionarios.forEach((funcionario) -> {
//            System.out.println(funcionario.detalhesCondutor());
//        });
//        transportes.forEach((transporte) -> {
//            System.out.println(transporte.detalhesTransporte());
//        });
//        estacionamentos.forEach((estacionamento) -> {
//            System.out.println(estacionamento.detalhesEstacionamento());
//        });
//*******************************************************************************************************************************************
        LocalDate dataDesejada = LocalDate.of(2025, 4, 20);
        estacionamento1.mostrarViaturasPorDia(dataDesejada);

    }

}
