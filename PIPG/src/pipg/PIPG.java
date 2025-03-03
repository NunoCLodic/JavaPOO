package pipg;

import java.util.ArrayList;

public class PIPG {

    public static void main(String[] args) {

        //Criando Arraylist para armazenar os objectos
        ArrayList<Estudante> estudantes = new ArrayList<>();
        ArrayList<Professor> professores = new ArrayList<>();
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        ArrayList<Viatura> viaturas = new ArrayList<>();
        ArrayList<Estacionamento> estacionamentos = new ArrayList<>();

        //Inicializando os objectos e os adicionando no arraylist
        Estudante estudante1 = new Estudante("Estudante", "Bruno", "1990-03-01", 'M', 284260888, 925860123, null, 1344, "Engenharia Informatica", 3);
        Estudante estudante2 = new Estudante("Estudante", "Francisca", "1980-06-02", 'F', 284560888, 925780123, null, 4344, "Enfermagem", 2);

        Professor professor1 = new Professor("Professor", "Pedro", "1980-06-02", 'M', 284560888, 925780123, null, 4567, "Java");
        Professor professor2 = new Professor("Professor", "Fernanda", "1980-06-02", 'F', 284560888, 925780123, null, 3454, "C#");

        Funcionario funcionario1 = new Funcionario("Funcionario", "Fabio", "1980-06-02", 'M', 284560888, 925780123, null, 2456, "secretaria");
        Funcionario funcionario2 = new Funcionario("Funcionario", "Tiana", "1980-06-02", 'F', 284560888, 925780123, null, 8765, "Biblioteca");

        estudantes.add(estudante1);
        estudantes.add(estudante2);

        professores.add(professor1);
        professores.add(professor2);

        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);

        Viatura viatura1 = new Viatura("AA-BB-12", "Renaul", "Megane", 2009, "Azul", 2.0, 1.0, 1.5, null);
        Viatura viatura2 = new Viatura("BB-BB-13", "Bmw", "z4", 2019, "Branco", 2.5, 1.0, 1.75, null);
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

        //Exibindo os dados das listas
        System.out.println("Estudantes: ");
        for (Estudante estudante : estudantes) {
            System.out.println(estudante.detalhesCondutor());
        }
        System.out.println("Professores: ");
        for (Professor professor : professores) {
            System.out.println(professor.detalhesCondutor());
        }
        System.out.println("Funcionarios: ");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.detalhesCondutor());
        }
        System.out.println("Viaturas: ");
        for (Viatura viatura : viaturas) {
            System.out.println(viatura.detalhesViatura());
        }
        System.out.println("Estacionamentos: ");
        for (Estacionamento estacionamento : estacionamentos) {
            System.out.println(estacionamento.detalhesEstacionamento());
        }
    }
}
