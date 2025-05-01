 package classes;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Estudante extends Condutor {

    private int nEstudante;

    public Estudante(Categoria categoria, String nome, String dataNascimento,
            char sexo, int contribuinte, String contato, String email, String numeroCartaConducao, List<Transporte> transporte, int nEstudante) {

        super(categoria, nome, dataNascimento, sexo, contribuinte, contato, email, numeroCartaConducao, transporte);
        this.nEstudante = nEstudante;
    }

    //Getters e Setters
    public int getnEstudante() {
        return nEstudante;
    }

    public void setnEstudante(int nEstudante) {
        this.nEstudante = nEstudante;
    }

    // METODOS
    //compara dois objetos pela numero de estudante
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || !(o instanceof Estudante)) { // Permite comparações entre Estudante e Estudante_bolseiro
            return false;
        }
        Estudante estudante = (Estudante) o;
        return Objects.equals(getnEstudante(), estudante.getnEstudante()); // Compara pelo número de estudante
    }

    @Override
    public int hashCode() {
        return Objects.hash(getnEstudante()); // Mantém consistência no hash
    }

//METODOS HERDADOS DA CLASSE CONDUTOR
    //Detalhes do Condutor Estudante
    @Override
    public String detalhesCondutor() {
        StringBuilder detalhes = new StringBuilder();

        detalhes.append("********DETALHES DO CONDUTOR(A) COM ID: ").append(idCondutor).append("********\n");
        detalhes.append("Catedoria: ").append(categoria).append("\n");
        detalhes.append("Numero do Estudante: ").append(nEstudante).append("\n");
        detalhes.append("Nome: ").append(nome).append("\n");
        detalhes.append("Idade: ").append(calcularIdade()).append(" anos\n");
        detalhes.append("Sexo: ").append(sexo).append("\n");
        detalhes.append("Contribuinte: ").append(contribuinte).append("\n");
        detalhes.append("Contato: ").append(contato).append("\n");
        detalhes.append("Nº carta Condução: ").append(numeroCartaConducao).append("\n");
        for (Transporte transporte : transportes) {
            detalhes.append("Matricula da viatura: ").append(transporte.getMatricula()).append("\n");
        }
        detalhes.append("Mensalidade: ").append(vMensalidade).append(" €\n");
        detalhes.append("Email: ").append(email).append("\n");
        detalhes.append("**********************************************");
        return detalhes.toString();
    }

    //Registrar pagamento
    @Override
    public void registrarPagamento(LocalDate mes) {
        pagamentos.put(mes.withDayOfMonth(1), true);// Marca o mês como pago
        System.out.println("Pagamento de (" + mes.getMonth() + ") do motorista (" + nome + ") registrado com sucesso!");
    }

    //Envia mensagem para o suporte  
    @Override
    public void enviarMensagemSuporte(Suporte s) {
    }

}
