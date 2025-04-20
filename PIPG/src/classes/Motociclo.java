package classes;

import java.util.List;

public class Motociclo extends Transporte {

    protected List<Motociclo> motociclos;

    public Motociclo(Categoria categoria, String matricula, String marca, String modelo, int ano, String cor, double comprimento, double largura, double altura, Condutor condutor) {
        super(categoria, matricula, marca, modelo, ano, cor, comprimento, largura, altura, condutor);
    }
}
