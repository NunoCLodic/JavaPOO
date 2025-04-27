package classes;

import classes.Estacionamento.Estado1;
import classes.Estacionamento.Estado2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class GerenciadorTransporte {
//    private List<Transporte> transportes;

    private HashSet<Transporte> transportes;

    public GerenciadorTransporte() {
//        this.transportes = new ArrayList<>();
        this.transportes = new HashSet<>();
    }

    // Método para adicionar transporte
    public void adicionarTransporte(Transporte transporte) {
        if (transportes.contains(transporte)) {
            System.out.println("O transporte com a matrícula " + transporte.getMatricula() + " já está na lista.");
        } else {
            System.out.println("O transporte com a matrícula (" + transporte.getMatricula() + ") adicionado com sucesso!");
            transportes.add(transporte);
        }
    }

    // Método para remover transporte
    public void removerTransporte(Transporte transporte) {
        if (transportes.remove(transporte)) {
            System.out.println("O trasporte com a matrícula " + transporte.getMatricula() + " removido com sucesso!");
        } else {
            System.out.println("O transporte com a  matrícula " + transporte.getMatricula() + " não foi encontrado.");
        }
    }

    // Método para listar transportes
    public void listarTransportes() {
        int totalAdd = 0;
        if (transportes.isEmpty()) {
            System.out.println("Nenhum transporte cadastrado.");
        } else {
            System.out.println("Lista de transportes:");
            for (Transporte transporte : transportes) {
                System.out.println("- " + transporte.getMatricula() + " (" + transporte.getMarca() + ") - " + transporte.getCategoria());
                totalAdd++;
            }
            System.out.println("Total tranportes adicionados: (" + totalAdd + ")");
        }
    }

    public void totalTransporte() {
        System.out.println("A lista  tem um total de " + transportes.size() + " condutores");
    }

    public void estacionarTransporte(Transporte transporte) {
////        // Verifica se o estacionamento está ativo e livre
////        if (getEstado1 == getEstado1.ATIVO && getEstado2 == Estado2.LIVRE) {
////            // Verifica se o transporte atende às dimensões do estacionamento
////            if (transporte.getComprimento() <= this.comprimentoMaximo
////                    && transporte.getLargura() <= this.larguraMaxima
////                    && (!this.coberto || transporte.getAltura() <= this.alturaMaxima)) {
////
////                // Associa o transporte ao estacionamento
////                this.getViatura = (transporte instanceof Viatura) ? (Viatura) transporte : null;
////                this.estado2 = Estado2.OCUPADO;
////                System.out.println("O transporte com matrícula " + transporte.getMatricula() + " foi estacionado no local de ID " + this.id);
////            } else {
////                System.out.println("As dimensões do transporte excedem os limites do estacionamento.");
////            }
////        } else {
////            System.out.println("Não é possível estacionar. O estacionamento está ocupado ou desativado.");
////        }
    }

    public void bloquearTransporte(Transporte t) {

    }

    public void ativarTransporte(Transporte t) {

    }

    public void editarTransporte(Transporte t) {

    }

    public void atribuirTransporte(Condutor c) {

    }
}
