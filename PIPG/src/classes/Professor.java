package classes;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Professor extends Condutor {

    private int id;
    private Cadeiras cadeira;
    
    public enum Cadeiras{
    C_PROGRAMACAO, C_REDES, C_ENGSOFTWARE, C_ROBOTICA, C_BASEDADOS, C_CONTROLEINDUSTRIAL,C_SISTEMASDIGITAIS, C_SISTEMASDISTRIBUIDOS, C_INGLES, C_MATEMATICA, C_FISICA
    }

    public Professor(Categoria categoria, String nome, String dataNascimento,
            char sexo, int contribuinte, String contato, String email, String nCartaConducao, List<Transporte> transporte, int id, Cadeiras cadeira) {

        super(categoria, nome, dataNascimento, sexo, contribuinte, contato, email, nCartaConducao, transporte);
        this.id = id;
        this.cadeira = cadeira;
    }

    //Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cadeiras getCadeiras() {
        return cadeira;
    }

    public void setDisciplinas(Cadeiras cadeira) {
        this.cadeira = cadeira;
    }
    
//METODOS

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Professor professor = (Professor) o;
        return Objects.equals(id, professor.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

//METODOS HERDADOS DA CLASSE CONDUTOR
    @Override
    public String detalhesCondutor() {
        StringBuilder detalhes = new StringBuilder();

        detalhes.append("********DETALHES DO CONDUTOR(A) COM ID: ").append(idCondutor).append("********\n");
        detalhes.append("Catedoria: ").append(categoria).append("\n");
        detalhes.append("Id do professor: ").append(id).append("\n");
        detalhes.append("Nome: ").append(nome).append("\n");
        detalhes.append("Idade: ").append(calcularIdade()).append(" anos\n");
        detalhes.append("Discilplina: ").append(cadeira).append("\n");
        detalhes.append("Sexo: ").append(sexo).append("\n");
        detalhes.append("Contribuinte: ").append(contribuinte).append("\n");
        detalhes.append("Contato: ").append(contato).append("\n");
        detalhes.append("Nº carta Condução: ").append(numeroCartaConducao).append("\n");
        for (Transporte transporte : transportes) {
            detalhes.append("Matricula da viatura: ").append(transporte.getMatricula()).append("\n");
        }
        detalhes.append("Valor da mensalidade: ").append(vMensalidade).append("€\n");
        detalhes.append("Email: ").append(email).append("\n");
        detalhes.append("**********************************************");
        return detalhes.toString();

    }

    @Override
    public void registrarPagamento(LocalDate mes) {
        pagamentos.put(mes.withDayOfMonth(1), true);
        System.out.println("Pagamento de " + mes.getMonth() + " do motorista " + nome + " registrado com sucesso!");
    }

    @Override
    public boolean verificarPagamento(LocalDate mes) {
        return pagamentos.getOrDefault(mes.withDayOfMonth(1), false);
    }

    @Override
    public void mostrarHistoricoPagamento() {
        System.out.println("Histórico de pagamentos para " + nome + ":");
        LocalDate hoje = LocalDate.now();
        for (int i = 0; i < 12; i++) {
            LocalDate mes = hoje.minusMonths(i).withDayOfMonth(1); // Obter o início de cada mês
            boolean pago = pagamentos.getOrDefault(mes, false); // Verificar se o mês foi pago

            // Exibir o status do mês
            System.out.println("Mês: " + mes.getMonth() + " " + mes.getYear()
                    + " - Estado: " + (pago ? "Pago" : "Pendente"));
        }
        System.out.println("\n");
    }

    @Override
    public void enviarMensagemSuporte(Suporte s) {
    }
}
