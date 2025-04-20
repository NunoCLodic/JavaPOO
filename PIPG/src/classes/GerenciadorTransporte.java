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
            System.out.println("O transporte com matrícula " + transporte.getMatricula() + " já está na lista.");
        } else {
            transportes.add(transporte);
            System.out.println("Transporte adicionado: " + transporte.getMatricula());
        }
    }

    // Método para remover transporte
    public void removerTransporte(Transporte transporte) {
        if (transportes.remove(transporte)) {
            System.out.println("Transporte removido: " + transporte.getMatricula());
        } else {
            System.out.println("O transporte com matrícula " + transporte.getMatricula() + " não foi encontrado.");
        }
    }

    // Método para listar transportes
    public void listarTransportes() {
        if (transportes.isEmpty()) {
            System.out.println("Nenhum transporte cadastrado.");
        } else {
            System.out.println("Lista de transportes:");
            for (Transporte transporte : transportes) {
                System.out.println("- " + transporte.getMatricula() + " (" + transporte.getMarca() + ")");
            }
        }
    }

    public void estacionarTransporte(Transporte transporte) {
//        // Verifica se o estacionamento está ativo e livre
//        if (getEstado1 == getEstado1.ATIVO && getEstado2 == Estado2.LIVRE) {
//            // Verifica se o transporte atende às dimensões do estacionamento
//            if (transporte.getComprimento() <= this.comprimentoMaximo
//                    && transporte.getLargura() <= this.larguraMaxima
//                    && (!this.coberto || transporte.getAltura() <= this.alturaMaxima)) {
//
//                // Associa o transporte ao estacionamento
//                this.getViatura = (transporte instanceof Viatura) ? (Viatura) transporte : null;
//                this.estado2 = Estado2.OCUPADO;
//                System.out.println("O transporte com matrícula " + transporte.getMatricula() + " foi estacionado no local de ID " + this.id);
//            } else {
//                System.out.println("As dimensões do transporte excedem os limites do estacionamento.");
//            }
//        } else {
//            System.out.println("Não é possível estacionar. O estacionamento está ocupado ou desativado.");
//        }
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
