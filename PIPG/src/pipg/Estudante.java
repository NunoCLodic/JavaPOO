package pipg;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Estudante extends Condutor implements InterfaceCondutor {

    private int nEstudante;

    public Estudante(String categoria, String nome, String dataNascimento,
            char sexo, int contribuinte, String contato, String email, String nCartaConducao, List<Viatura> viatura, int nEstudante) {

        super(categoria, nome, dataNascimento, sexo, contribuinte, contato, email, nCartaConducao, viatura);
        this.nEstudante = nEstudante;
    }

    //Getters e Setters
    public int getnEstudante() {
        return nEstudante;
    }

    public void setnEstudante(int nEstudante) {
        this.nEstudante = nEstudante;
    }

    //Detalhes do Condutor Estudante
    @Override
    public String detalhesCondutor() {
        StringBuilder detalhes = new StringBuilder();

        detalhes.append("********DETALHES DO CONDUTOR COM ID: ").append(idCondutor).append("********\n");
        detalhes.append("Catedoria: ").append(categoria).append("\n");
        detalhes.append("Numero do Estudante: ").append(nEstudante).append("\n");
        detalhes.append("Nome: ").append(nome).append("\n");

        detalhes.append("Idade: ").append(calcularIdade()).append(" anos\n");
        detalhes.append("Sexo: ").append(sexo).append("\n");
        detalhes.append("Contribuinte: ").append(contribuinte).append("\n");
        detalhes.append("Contato: ").append(contato).append("\n");
        detalhes.append("Nº carta Condução: ").append(nCartaConducao).append("\n");
        for (Viatura viatura : viaturas) {
            detalhes.append("Matricula da viatura: ").append(viatura.getMatricula()).append("\n");
        }
        detalhes.append("Mensalidade: ").append(mensalidade).append("€\n");
        detalhes.append("Email: ").append(email).append("\n");
        detalhes.append("**********************************************");
        return detalhes.toString();

//        return super.detalhesCondutor() 
//                + "\n numero estudante: " + nEstudante
//                + "\n******************************************************\n";
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
        Estudante estudante = (Estudante) o;
        return Objects.equals(nEstudante, estudante.nEstudante);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nEstudante);
    }

    //metodos do condutor
    @Override
    public void adicionarViatura(Viatura v) {
//        setViatura(viatura);
    }

    @Override
    public void editarViatura(Viatura v) {
//        getViatura();
    }

    @Override
    public void eliminarViatura(Viatura v) {
        //em construcao
    }

    @Override
    public void reservarEstacionamento(Viatura v, Estacionamento e) {
        if ((e.getAtivo() == true) && (e.getLivre() == true)) {
            System.out.println("10 Minutos até a Viatura " + v.getMatricula() + " estacionar");
        } else {
            System.out.println("impossivel reservar estacionamento");
        }
    }

    @Override
    public void estacionarViatura(Viatura v, Estacionamento e) {
        if ((e.getAtivo() == true) && (e.getLivre() == true)) {

        }
    }

    @Override
    public void desocuparEstacionamento(Viatura v, Estacionamento e) {
    }

    @Override
    public void enviarMensagemSuporte(Suporte s) {
    }

    @Override
    public void registrarPagamento(LocalDate mes) {
        pagamentos.put(mes.withDayOfMonth(1), true);// Marca o mês como pago
        System.out.println("Pagamento de " + mes.getMonth() + " do motorista " + nome + " registrado com sucesso!");
    }

    @Override
    public boolean verificarPagamento(LocalDate mes) {
        return pagamentos.getOrDefault(mes.withDayOfMonth(1), false); // Retorna false se não houver registro
    }

     // Exibir histórico completo de pagamentos (meses pagos e pendentes)
    @Override
    public void mostrarHistoricoPagamento() {
        System.out.println("Histórico de pagamentos para " + nome + ":");
        LocalDate hoje = LocalDate.now();
        for (int i = 0; i < 12; i++) {
            LocalDate mes = hoje.minusMonths(i).withDayOfMonth(1); // Obter o início de cada mês
            boolean pago = pagamentos.getOrDefault(mes, false); // Verificar se o mês foi pago

            // Exibir o status do mês
            System.out.println("Mês: " + mes.getMonth() + " " + mes.getYear() +
                               " - Estado: " + (pago ? "Pago" : "Pendente"));
        }
        System.out.println("\n");
    }
}
