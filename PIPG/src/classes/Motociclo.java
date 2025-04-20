package classes;

import interfaces.InterfaceMotociclo;
import java.util.List;

public class Motociclo extends Transporte implements InterfaceMotociclo {

    protected List<Motociclo> motociclos;

    public Motociclo(Categoria categoria, String matricula, String marca, String modelo, int ano, String cor, double comprimento, double largura, double altura, Condutor condutor) {
        super(categoria, matricula, marca, modelo, ano, cor, comprimento, largura, altura, condutor);
    }


    @Override
    public void adicionarMotociclo(Motociclo m) {
        if (motociclos.contains(m)) {
            System.out.println("O Motociclo já está associada ao condutor.");
        } else {
            motociclos.add(m);
            System.out.println("Motociclo adicionadas");
        }
    }

    @Override
    public void removerMotociclo(Motociclo m) {
        if (motociclos.remove(m)) {
            System.out.println("Motociclo removida com sucesso.");
        } else {
            System.out.println("O motociclo não está associada ao condutor.");
        }
    }

    @Override
    public void listarMotociclo() {
        for (Motociclo motociclo : motociclos) {
            System.out.println(motociclo);
        }
    }

    @Override
    public void ativarMotociclo(Motociclo m) {
    }

    @Override
    public void desativarMotociclo(Motociclo m) {
    }

    @Override
    public void editarMotociclo(Motociclo m) {
    }

}
