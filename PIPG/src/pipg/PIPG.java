package pipg;

import static java.lang.reflect.Array.set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PIPG {

    public static void main(String[] args) {

        //Criando Arraylist para armazenar os objectos
        HashSet<Estudante> estudantes = new HashSet<>();
        HashSet<Professor> professores = new HashSet<>();
        HashSet<Funcionario> funcionarios = new HashSet<>();
        HashSet<Viatura> viaturas = new HashSet<>();
        HashSet<Estacionamento> estacionamentos = new HashSet<>();

        //Inicializando os objectos e os adicionando no arraylist
        Estudante estudante1 = new Estudante("Estudante", "Bruno", "1990-03-01", 'M', 284260888, "925860123", "bruno@hotmail.com", "12345671", null, 1111111);
        Estudante estudante2 = new Estudante("Estudante", "Francisca", "1980-06-02", 'F', 284560888, "925780123", "francisca@hotmail.com", "12345672", null, 2222222);

        Professor professor1 = new Professor("Professor", "Pedro", "1990-03-01", 'M', 284260888, "925860123", "bruno@hotmail.com", "12345673", null, 1111, "Java");
        Professor professor2 = new Professor("Professor", "Fernanda", "1980-06-02", 'F', 284560888, "925860163", "fernanda@hotmail.com", "12345674", null, 2222, "c#");

        Funcionario funcionario1 = new Funcionario("Funcionario", "Fabio", "1980-06-02", 'M', 284560888, "925780123", "fabio@hotmail.com", "12345675", null, 3333, "secretaria");
        Funcionario funcionario2 = new Funcionario("Funcionario", "Tiana", "1980-06-02", 'F', 284560888, "925780123", "tiana@hotmail.com", "12345676", null, 4444, "finança");

        estudantes.add(estudante1);
        estudantes.add(estudante2);

        professores.add(professor1);
        professores.add(professor2);

        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);

        Viatura viatura1 = new Viatura("AA-BB-12", "Renaul", "Megane", 2009, "Azul", 2.0, 1.0, 1.5, null);
        Viatura viatura2 = new Viatura("AA-BB-12", "Bmw", "z4", 2019, "Branco", 2.5, 1.0, 1.75, null);
        Viatura viatura3 = new Viatura("CC-BB-14", "Ferrari", "Roma", 2009, "Vermelho", 2.0, 1.0, 1.5, null);
        Viatura viatura4 = new Viatura("DD-BB-15", "Porshe", "taycan", 2019, "Preto", 2.5, 1.0, 1.75, null);
        Viatura viatura5 = new Viatura("EE-BB-16", "Nissan", "leaf", 2009, "Azul", 2.0, 1.0, 1.5, null);
        Viatura viatura6 = new Viatura("FF-BB-17", "Renaul", "Zoe", 2019, "Sizento", 2.5, 1.0, 1.75, null);

        viaturas.add(viatura1);
        viaturas.add(viatura2);
        viaturas.add(viatura3);
        viaturas.add(viatura4);
        viaturas.add(viatura5);
        viaturas.add(viatura6);

        //Atualizando as viaturas a seus respectivos condutores
        viatura1.setCondutor(estudante1);
        viatura2.setCondutor(estudante2);
        viatura3.setCondutor(professor1);
        viatura4.setCondutor(professor2);
        viatura5.setCondutor(funcionario1);
        viatura6.setCondutor(funcionario2);

        estudante1.adicionarViatura(viatura6);
        estudante2.adicionarViatura(viatura2);
        professor1.adicionarViatura(viatura3);
        professor2.adicionarViatura(viatura4);
        funcionario1.adicionarViatura(viatura5);
        funcionario2.adicionarViatura(viatura6);

        Estacionamento estacionamento1 = new Estacionamento("Norte", "Estudante", 40.234567, -8.345689, 2.0, 1.5, 3.0);
        Estacionamento estacionamento2 = new Estacionamento("Sul", "Professor", 41.234567, -7.345689, 2.0, 1.5, 3.0);
        Estacionamento estacionamento3 = new Estacionamento("Este", "Funcionario", 40.234567, -8.345689, 2.0, 1.5, 3.0);
        Estacionamento estacionamento4 = new Estacionamento("Centro", "Funcionario", 41.234567, -7.345689, 2.0, 1.5, 3.0);
        Estacionamento estacionamento5 = new Estacionamento("Norte", "Estudante", 40.234567, -8.345689, 2.0, 1.5, 3.0);
        Estacionamento estacionamento6 = new Estacionamento("Sul", "Professor", 41.234567, -7.345689, 2.0, 1.5, 3.0);

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

        estacionamento6.setLivre(false);
        estacionamento4.Desativar();
        estacionamento3.Desativar();

        //Exibindo os dados das listas
        for (Viatura viatura : viaturas) {
            System.out.println("Matricula da viatura: " + viatura.getMatricula());
        }
        System.out.println("\n Total de viaturas na lista: " + viaturas.size());

        System.out.println("\n**********TODOS OS DETALHES**********\n ");
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
            System.out.println(viatura.detalhesViatura());
        });
        estacionamentos.forEach((estacionamento) -> {
            System.out.println(estacionamento.detalhesEstacionamento());
        });
    }

}
