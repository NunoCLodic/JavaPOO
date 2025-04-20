package classes;

import java.util.ArrayList;
import java.util.List;

public class Viatura extends Transporte {

//    protected List<Viatura> viaturas = new ArrayList<>();

    public Viatura(Categoria categoria, String matricula, String marca, String modelo, int ano, String cor, double comprimento, double largura, double altura, Condutor condutor) {
        super(categoria, matricula, marca, modelo, ano, cor, comprimento, largura, altura, condutor);

    }
}
