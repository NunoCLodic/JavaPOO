package classes;

import java.time.LocalDate;
import java.util.HashSet;

public class GerenciadorCondutor {

    private HashSet<Condutor> condutores;

    public GerenciadorCondutor() {
        this.condutores = new HashSet<>();
    }

    public void adicionarCondutor(Condutor condutor) {
        if (condutores.contains(condutor)) {
            System.out.println("O condutor " + condutor.nome + "com o ID: " + condutor.idCondutor + " já está na lista.");
        } else {
            condutores.add(condutor);
            System.out.println("O condutor  " + condutor.nome + " adicionado");
        }

    }

    public void removerCondutor(Condutor condutor) {
        if (condutores.remove(condutor)) {
            System.out.println("O condutor " + condutor.nome + " com o ID: " + condutor.idCondutor + " removido com sucesso!");
        } else {
            System.out.println("O condutor " + condutor.nome + " com o ID: " + condutor.idCondutor + " não foi encontrado.");
        }
    }

    public void listarCondutor() {
        if (condutores.isEmpty()) {
            System.out.println("Nenhum condutor registrado");
        } else {
            System.out.println("Lista de condutores:");
            for (Condutor condutor : condutores) {
                System.out.println(condutor.detalhesCondutor());
            }
        }

    }

    public void atribuirViaturaAoCondutor(Condutor condutor, Transporte transporte) {
        if (condutores.contains(condutor)) {
            if (!condutor.getTransportes().contains(transporte)) {
                condutor.getTransportes().add(transporte);
                System.out.println("O transporte com matrícula " + transporte.getMatricula() + " foi atribuída ao condutor " + condutor.getNome());
            } else {
                System.out.println("O transporte com matrícula " + transporte.getMatricula() + " já está associada ao condutor " + condutor.getNome());
            }
        } else {
            System.out.println("O condutor " + condutor.getNome() + " não está registrado no sistema.");
        }
    }

    public void registrarPagamento(LocalDate mes) {

    }

    public boolean verificarPagamento(LocalDate mes) {
        return true; //teste
    }

    public void mostrarHistoricoPagamento() {

    }

    public void enviarMensagemSuporte(Suporte s) {

    }

}
