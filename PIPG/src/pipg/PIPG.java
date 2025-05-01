package pipg;

import classes.Condutor;
import classes.Viatura;
import classes.Professor;
import classes.Funcionario;
import classes.Estudante;
import classes.Estacionamento;
import classes.GerenciadorCondutor;
import classes.GerenciadorEstacionamento;
import classes.GerenciadorTransporte;
import classes.Motociclo;
import classes.Transporte;
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
import static classes.Condutor.Categoria.ESTUDANTE;
import static classes.Condutor.Categoria.ESTUDANTE_BOLSEIRO;
import static classes.Condutor.Categoria.FUNCIONARIO;
import static classes.Condutor.Categoria.PROFESSOR;
import classes.Estudante_bolseiro;
import static classes.Professor.Cadeiras.C_ENGSOFTWARE;
import static classes.Professor.Cadeiras.C_PROGRAMACAO;
import static classes.Transporte.Categoria.MOTOCICLO;
import static classes.Transporte.Categoria.VIATURA;
import java.time.LocalDate;
import java.util.Scanner;

public class PIPG {

    public static void main(String[] args) {

            GerenciadorTransporte gerenciadorT = new GerenciadorTransporte();
            GerenciadorCondutor gerenciadorC = new GerenciadorCondutor();
            GerenciadorEstacionamento gerenciadorE = new GerenciadorEstacionamento();

            //preencher condutor
            Condutor estudante1 = new Estudante(ESTUDANTE, "Bruno", "01-03-1990", 'M', 284260885, "925860123", "bruno@hotmail.com", "12345671", null, 1111111);
            Condutor estudante2 = new Estudante(ESTUDANTE, "Francisca", "02-03-1990", 'F', 284260886, "925780123", "francisca@hotmail.com", "12345672", null, 2222222);
            Condutor estudante3 = new Estudante(ESTUDANTE, "Miguel", "03-03-1990", 'M', 284260887, "925860123", "miguel@hotmail.com", "12345671", null, 3333333);
            Condutor estudante4 = new Estudante(ESTUDANTE, "Tiago", "04-03-1990", 'F', 284260887, "925780123", "tiago@hotmail.com", "12345672", null, 4444444);
            Condutor estudante5 = new Estudante_bolseiro(ESTUDANTE_BOLSEIRO, "Maria", "05-03-1990", 'F', 284260888, "925780127", "maria@hotmail.com", "12345683", null, 5555555,20.0);
            Condutor professor1 = new Professor(PROFESSOR, "Pedro", "05-03-1990", 'M', 284260888, "925860123", "pedro@hotmail.com", "12345673", null, 1111, C_PROGRAMACAO);
            Condutor professor2 = new Professor(PROFESSOR, "Fernanda", "06-03-1990", 'F', 284560888, "925860163", "fernanda@hotmail.com", "12345674", null, 2222, C_ENGSOFTWARE);
            Condutor professor3 = new Professor(PROFESSOR, "Ana", "06-03-1991", 'F', 284560889, "925860165", "ana@hotmail.com", "12345675", null, 3333, C_ENGSOFTWARE);
            Condutor funcionario1 = new Funcionario(FUNCIONARIO, "Fabio", "07-03-1990", 'M', 284560888, "925780123", "fabio@hotmail.com", "12345675", null, 1111, S_SECRETARIA);
            Condutor funcionario2 = new Funcionario(FUNCIONARIO, "Tiana", "08-03-1990", 'F', 284560888, "925780123", "tiana@hotmail.com", "12345676", null, 2222, S_FINANCA);
            Condutor funcionario3 = new Funcionario(FUNCIONARIO, "Fabia", "03-03-1990", 'F', 284560878, "925780623", "fabia@hotmail.com", "12365676", null, 3333, S_FINANCA);

            //adicionar condutor
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("-----------------------------ADIÇÃO DE CONDUTOR-----------------------------");
            System.out.println("----------------------------------------------------------------------------");
            gerenciadorC.adicionarCondutor(estudante1);
            gerenciadorC.adicionarCondutor(estudante2);
            gerenciadorC.adicionarCondutor(estudante3);
            gerenciadorC.adicionarCondutor(estudante4);
            gerenciadorC.adicionarCondutor(estudante5);
            gerenciadorC.adicionarCondutor(professor1);
            gerenciadorC.adicionarCondutor(professor2);
            gerenciadorC.adicionarCondutor(professor3);
            gerenciadorC.adicionarCondutor(funcionario1);
            gerenciadorC.adicionarCondutor(funcionario2);
            gerenciadorC.adicionarCondutor(funcionario3);
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("----------------------------TOTAL DE CONDUTORES-----------------------------");
            System.out.println("----------------------------------------------------------------------------");
            gerenciadorC.totalCondutor();

            //tentar adicionar condutor em duplicado
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("----------------------------ADIÇÃO EM DUPLICADO-----------------------------");
            System.out.println("----------------------------------------------------------------------------");
            gerenciadorC.adicionarCondutor(professor3);

            //listar condutores
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("----------------------LISTA DE CONDUTORES ADICIONADOS-----------------------");
            System.out.println("----------------------------------------------------------------------------");
            gerenciadorC.listarCondutor();

            //remover um condutor
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("---------------------------REMOÇÃO DE UM CONDUTOR---------------------------");
            System.out.println("----------------------------------------------------------------------------");
            gerenciadorC.removerCondutor(professor3);

            //listar depois da remoção
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("-------------------NOVA LISTA DE CONDUTORES APÓS A REMOÇÃO------------------");
            System.out.println("----------------------------------------------------------------------------");
            gerenciadorC.listarCondutor();

            //preencher transporte
            Transporte viatura1 = new Viatura(VIATURA, "AA-AA-11", "Renaul", "Megane", 2009, "Azul", 1.9, 1.0, 1.5, null);
            Transporte viatura2 = new Viatura(VIATURA, "BB-BB-22", "Bmw", "z4", 2019, "Branco", 2.0, 1.0, 1.5, null);//hashset ignorando, matricula duplicada
            Transporte viatura3 = new Viatura(VIATURA, "CC-CC-33", "Ferrari", "Roma", 2009, "Vermelho", 2.0, 1.0, 1.5, null);
            Transporte viatura4 = new Viatura(VIATURA, "DD-DD-44", "Porshe", "taycan", 2019, "Preto", 1.5, 1.0, 1.75, null);
            Transporte viatura5 = new Viatura(VIATURA, "EE-EE-55", "Nissan", "leaf", 2009, "Azul", 2.0, 1.0, 1.5, null);
            Transporte viatura6 = new Viatura(VIATURA, "FF-FF-66", "Renaul", "Zoe", 2019, "Sizento", 1.7, 1.0, 1.75, null);
            Transporte viatura7 = new Viatura(VIATURA, "GG-GG-77", "Renaul", "Zoe", 2025, "Sizento", 1.8, 1.0, 1.75, null);
            Transporte motociclo1 = new Motociclo(MOTOCICLO, "HH-HH-88", "Honda", "Cb1000 hornet Sp", 2009, "Azul", 3.0, 1.0, 1.5, null);
            Transporte motociclo2 = new Motociclo(MOTOCICLO, "II-II-99", "Yamaha", "Tracer 9 Gt+", 2019, "Sizento", 3.0, 1.0, 1.75, null);
            Transporte motociclo3 = new Motociclo(MOTOCICLO, "JJ-JJ-00", "Suzuki", "tinger", 2020, "preta", 3.0, 1.0, 1.75, null);

            //adicionar transporte
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("----------------------------ADIÇÃO DE TRANSPORTE----------------------------");
            System.out.println("----------------------------------------------------------------------------");
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

            System.out.println("----------------------------------------------------------------------------");
            System.out.println("----------------------------TOTAL DE TRANSPORTE-----------------------------");
            System.out.println("----------------------------------------------------------------------------");
            gerenciadorT.totalTransporte();

            //tentar adicionar em duplicado
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("----------------------------ADIÇÃO EM DUPLICADO-----------------------------");
            System.out.println("----------------------------------------------------------------------------");
            gerenciadorT.adicionarTransporte(viatura1);

            //listar os transporte
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("----------------------LISTA DE TRANSPORTES ADICIONADOS----------------------");
            System.out.println("----------------------------------------------------------------------------");
            gerenciadorT.listarTransportes();

            //remover um transporte
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("--------------------------REMOÇÃO DE UM TRANSPORTE--------------------------");
            System.out.println("----------------------------------------------------------------------------");
            gerenciadorT.removerTransporte(viatura7);

            //listar transportes depois de remoção
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("------------------------NOVA LISTA DEPOIS DA REMOÇÃO------------------------");
            System.out.println("----------------------------------------------------------------------------");
            gerenciadorT.listarTransportes();

            //Atribuiar as viaturas aos motoristas
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("-------------------ATRIBUIÇÃO DAS VIATURAS AOS CONDUTORES-------------------");
            System.out.println("----------------------------------------------------------------------------");
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
            Estacionamento estacionamento2 = new Estacionamento(S_CENTRAIS, E_PROFESSOR, 40.234567, -7.345689, true, 2.0, 1.5, 3.0);//hashset ignorando
            Estacionamento estacionamento3 = new Estacionamento(BIBLIOTECA, E_VISITANTE, 41.234567, -8.345689, false, 2.0, 1.5, 3.0);
            Estacionamento estacionamento4 = new Estacionamento(ESS, E_DEFICIENTE, 42.234567, -7.345689, false, 2.0, 1.5, 3.0);
            Estacionamento estacionamento5 = new Estacionamento(ESTH, E_MOTOCICLO, 43.234567, -8.345689, true, 2.0, 1.5, 3.0);
            Estacionamento estacionamento6 = new Estacionamento(ESECD, E_ESTUDANTE, 44.234567, -8.345688, false, 2.0, 1.5, 3.0);
            Estacionamento estacionamento7 = new Estacionamento(ESECD, E_ESTUDANTE, 45.234567, -8.345688, false, 2.0, 1.5, 3.0);
            Estacionamento estacionamento8 = new Estacionamento(ESECD, E_ESTUDANTE, 46.234567, -8.345688, false, 2.0, 1.5, 3.0);
            Estacionamento estacionamento9 = new Estacionamento(ESECD, E_ESTUDANTE, 47.234567, -8.345688, false, 2.0, 1.5, 3.0);
            Estacionamento estacionamento10 = new Estacionamento(ESS, E_DEFICIENTE, 48.234567, -8.335688, false, 2.0, 1.5, 3.0);

            //adicionar estacionamento
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("-------------------------ADIÇÃO DE ESTACIONAMENTOS--------------------------");
            System.out.println("----------------------------------------------------------------------------");
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

            System.out.println("----------------------------------------------------------------------------");
            System.out.println("--------------------------TOTAL DE ESTACIONAMENTO---------------------------");
            System.out.println("----------------------------------------------------------------------------");
            gerenciadorE.totalEstacionamento();

            //listar todos estacionamentos
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("---------------------------LISTAR ESTACIONAMENTOS---------------------------");
            System.out.println("----------------------------------------------------------------------------");
            gerenciadorE.listarEstacionamentos();

            //Inativar estacionamento 010
            gerenciadorE.inativarEstacionamento(estacionamento10);

            //Estacionar
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("---------------------------ESTACIONAR TRANSPORTE----------------------------");
            System.out.println("----------------------------------------------------------------------------");

            gerenciadorE.estacionarTransporte(viatura1, estacionamento1);
            gerenciadorE.estacionarTransporte(viatura2, estacionamento2);
            gerenciadorE.estacionarTransporte(viatura3, estacionamento3);
            gerenciadorE.estacionarTransporte(viatura4, estacionamento4);
            gerenciadorE.estacionarTransporte(viatura5, estacionamento5);
            gerenciadorE.estacionarTransporte(viatura6, estacionamento6);
            gerenciadorE.estacionarTransporte(viatura7, estacionamento7);
            gerenciadorE.estacionarTransporte(motociclo1, estacionamento8);
            gerenciadorE.estacionarTransporte(motociclo2, estacionamento9);
            gerenciadorE.estacionarTransporte(motociclo3, estacionamento10);

            System.out.println("----------------------------------------------------------------------------");
            System.out.println("----------------------ENVIAR NOTIFICAÇÃO AO MOTORISTA-----------------------");
            System.out.println("----------------------------------------------------------------------------");
            gerenciadorE.enviarNotificacaoMotorista();

            System.out.println("----------------------------------------------------------------------------");
            System.out.println("----------------------ENVIAR NOTIFICAÇÃO AO SUPORTE-------------------------");
            System.out.println("----------------------------------------------------------------------------");
            gerenciadorE.enviarNotificacaoSuporte();

            System.out.println("----------------------------------------------------------------------------");
            System.out.println("--------------------------RESERVAR ESTACIONAMENTO---------------------------");
            System.out.println("----------------------------------------------------------------------------");
            gerenciadorE.reservarEstacionamento(viatura7, estacionamento9);

            System.out.println("----------------------------------------------------------------------------");
            System.out.println("--------------------------ESTACIONAMENTOS ATIVOS----------------------------");
            System.out.println("----------------------------------------------------------------------------");
            gerenciadorE.estacionamentosAtivo();

            System.out.println("----------------------------------------------------------------------------");
            System.out.println("--------------------------ESTACIONAMENTOS INATIVOS--------------------------");
            System.out.println("----------------------------------------------------------------------------");
            gerenciadorE.estacionamentosInativo();

            System.out.println("----------------------------------------------------------------------------");
            System.out.println("-------------------------ESTACIONAMENTOS OCUPADOS---------------------------");
            System.out.println("----------------------------------------------------------------------------");
            gerenciadorE.estacionamentosOcupado();

            System.out.println("----------------------------------------------------------------------------");
            System.out.println("-------------------------DESOCUPAR ESTACIONAMENTO---------------------------");
            System.out.println("----------------------------------------------------------------------------");
            gerenciadorE.desocuparEstacionamento(estacionamento6);
            gerenciadorE.desocuparEstacionamento(estacionamento9);

            System.out.println("----------------------------------------------------------------------------");
            System.out.println("-------------------ESTACIONAMENTOS OCUPADOS ATUALIZADO----------------------");
            System.out.println("----------------------------------------------------------------------------");
            gerenciadorE.estacionamentosOcupado();

            System.out.println("----------------------------------------------------------------------------");
            System.out.println("---------------------ESTACIONAMENTOS ATIVOS ATUALIZADOS---------------------");
            System.out.println("----------------------------------------------------------------------------");
            gerenciadorE.estacionamentosAtivo();

            System.out.println("----------------------------------------------------------------------------");
            System.out.println("--------------------------ESTACIONAMENTOS LIVRES----------------------------");
            System.out.println("----------------------------------------------------------------------------");
            gerenciadorE.estacionamentosLivre();

            System.out.println("----------------------------------------------------------------------------");
            System.out.println("-------------------------ESTACIONAMENTOS RESERVADOS--------------------------");
            System.out.println("----------------------------------------------------------------------------");
            gerenciadorE.estacionamentosReservados();

            System.out.println("----------------------------------------------------------------------------");
            System.out.println("-----------------ESTACIONAMENTOS, TRANSPORTES E MOTORISTAS------------------");
            System.out.println("----------------------------------------------------------------------------");
            gerenciadorE.listarEstacionamentos_Transportes();

            System.out.println("----------------------------------------------------------------------------");
            System.out.println("-----------------------------TRANSPORTE POR DIA-----------------------------");
            System.out.println("----------------------------------------------------------------------------");
//        gerenciadorE.listarTransportesPorDiaEstacionamento(LocalDate.of(2025, 4, 27), estacionamento3);

//Exemplo pagamento mensalidade
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("---------------------------REGISTRO DE PAGAMENTO----------------------------");
            System.out.println("----------------------------------------------------------------------------");

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
            professor1.registrarPagamento(LocalDate.of(2025, 4, 1));
            professor2.registrarPagamento(LocalDate.of(2025, 4, 1));
            professor3.registrarPagamento(LocalDate.of(2025, 4, 1));
            System.out.println("\n");
            funcionario1.registrarPagamento(LocalDate.of(2025, 4, 1));
            funcionario2.registrarPagamento(LocalDate.of(2025, 4, 1));
            funcionario3.registrarPagamento(LocalDate.of(2025, 4, 1));
            System.out.println("\n");

            System.out.println("----------------------------------------------------------------------------");
            System.out.println("--------------------------VERIFICAÇÃO DE PAGAMENTO--------------------------");
            System.out.println("----------------------------------------------------------------------------");

            //Verificar se o motorista pagou a mensalidade de março
            boolean pagoMarco1 = estudante1.verificarPagamento(LocalDate.of(2025, 3, 1));
            System.out.println("Mensalidade de março do motorista " + estudante1.getNome() + " foi paga? " + (pagoMarco1 ? "Sim" : "Não"));

            boolean pagoMarco2 = estudante2.verificarPagamento(LocalDate.of(2025, 3, 1));
            System.out.println("Mensalidade de março do motorista " + estudante2.getNome() + " foi paga? " + (pagoMarco2 ? "Sim" : "Não"));

            boolean pagoMarco3 = professor1.verificarPagamento(LocalDate.of(2025, 4, 1));
            System.out.println("Mensalidade de abril do motorista " + professor1.getNome() + " foi paga? " + (pagoMarco3 ? "Sim" : "Não"));

            boolean pagoMarco4 = professor2.verificarPagamento(LocalDate.of(2025, 4, 1));
            System.out.println("Mensalidade de abril do motorista " + professor2.getNome() + " foi paga? " + (pagoMarco4 ? "Sim" : "Não"));

            boolean pagoMarco5 = funcionario1.verificarPagamento(LocalDate.of(2025, 4, 1));
            System.out.println("Mensalidade de abril do motorista " + funcionario1.getNome() + " foi paga? " + (pagoMarco5 ? "Sim" : "Não"));

            boolean pagoMarco6 = funcionario2.verificarPagamento(LocalDate.of(2025, 4, 1));
            System.out.println("Mensalidade de abril do motorista " + funcionario2.getNome() + " foi paga? " + (pagoMarco6 ? "Sim" : "Não"));
            System.out.println("\n");

            System.out.println("----------------------------------------------------------------------------");
            System.out.println("---------------------------HISTÓRICO DE PAGAMENTO---------------------------");
            System.out.println("----------------------------------------------------------------------------");

            estudante1.mostrarHistoricoPagamento();
            estudante2.mostrarHistoricoPagamento();
            professor1.mostrarHistoricoPagamento();
            professor2.mostrarHistoricoPagamento();
            funcionario1.mostrarHistoricoPagamento();
            funcionario2.mostrarHistoricoPagamento();
            System.out.println("\n");

//        LocalDate dataDesejada = LocalDate.of(2025, 4, 20);
//        estacionamento1.mostrarViaturasPorDia(dataDesejada);
        }

    }
