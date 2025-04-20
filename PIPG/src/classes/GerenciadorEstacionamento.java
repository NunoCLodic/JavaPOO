
package classes;

import java.util.HashSet;

public class GerenciadorEstacionamento {

    private HashSet<Estacionamento> estacionamentos;

    public GerenciadorEstacionamento() {
        this.estacionamentos = new HashSet<>();
    }

    // Método para adicionar estacionamentos
    public void adicionarEstacionamento(Estacionamento estacionamento) {
        if (estacionamentos.contains(estacionamento)) {
            System.out.println("O estacionamento com ID " + estacionamento.getIDestacionamento() + " já está na lista.");
        } else {
            estacionamentos.add(estacionamento);
            System.out.println("Estacionamento com ID " + estacionamento.getIDestacionamento() + " adicionado com sucesso.");
        }
    }

    // Método para listar estacionamentos
    public void listarEstacionamentos() {
        if (estacionamentos.isEmpty()) {
            System.out.println("Nenhum estacionamento cadastrado.");
        } else {
            System.out.println("Lista de Estacionamentos:");
            for (Estacionamento estacionamento : estacionamentos) {
                System.out.println(estacionamento.detalhesEstacionamento());
            }
        }
    }
}
