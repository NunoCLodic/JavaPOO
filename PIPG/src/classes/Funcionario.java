package classes;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Funcionario extends Condutor {

    private int id;
    private String seccao;

    public Funcionario(String categoria, String nome, String dataNascimento,
            char sexo, int contribuinte, String contato, String email, String nCartaConducao, List<Viatura> viatura, int id, String seccao) {

        super(categoria, nome, dataNascimento, sexo, contribuinte, contato, email, nCartaConducao, viatura);
        this.id = id;
        this.seccao = seccao;
    }

    //Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSeccao() {
        return seccao;
    }

    public void setSeccao(String seccao) {
        this.seccao = seccao;
    }

    //compara dois objetos pela numero de estudante
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Funcionario funcionario = (Funcionario) o;
        return Objects.equals(id, funcionario.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

//METODOS HERDADOS DA CLASSE CONDUTOR
    @Override
    public String detalhesCondutor() {

        StringBuilder detalhes = new StringBuilder();

        detalhes.append("********DETALHES DO CONDUTOR COM ID: ").append(idCondutor).append("********\n");
        detalhes.append("Catedoria: ").append(categoria).append("\n");
        detalhes.append("Id do funcionario: ").append(id).append("\n");
        detalhes.append("nome: ").append(nome).append("\n");
        detalhes.append("secção: ").append(seccao).append("\n");
        detalhes.append("idade: ").append(calcularIdade()).append(" anos\n");
        detalhes.append("sexo: ").append(sexo).append("\n");
        detalhes.append("contribuinte: ").append(contribuinte).append("\n");
        detalhes.append("contato: ").append(contato).append("\n");
        detalhes.append("Nº carta Condução: ").append(nCartaConducao).append("\n");
        for (Viatura viatura : viaturas) {
            detalhes.append("Matricula da viatura: ").append(viatura.getMatricula()).append("\n");
        }
        detalhes.append("Valor da mensalidade: ").append(vMensalidade).append("€\n");
        detalhes.append("Email: ").append(email).append("\n");
        detalhes.append("**********************************************");
        return detalhes.toString();
    }

    @Override
    public void registrarPagamento(LocalDate mes) {
        pagamentos.put(mes.withDayOfMonth(1), true);// Marca o mês como pago
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
