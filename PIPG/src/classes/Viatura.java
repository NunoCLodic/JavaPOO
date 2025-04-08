package classes;

import interfaces.InterfaceViatura;
import java.util.List;

public class Viatura extends Transporte implements InterfaceViatura {

    protected List<Viatura> viaturas;

    public Viatura(String matricula, String marca, String modelo, int ano, String cor, double comprimento, double largura, double altura, Condutor condutor) {
        super(matricula, marca, modelo, ano, cor, comprimento, largura, altura, condutor);
    }

    @Override
    public void adicionarViatura(Viatura v) {
        if (viaturas.contains(v)) {
            System.out.println("A viatura já está associada ao condutor.");
        } else {
            viaturas.add(v);
            System.out.println("Viaturas adicionadas");
        }
    }

    @Override
    public void removerViatura(Viatura v) {
        if (viaturas.remove(v)) {
            System.out.println("Viatura removida com sucesso.");
        } else {
            System.out.println("A viatura não está associada ao condutor.");
        }
    }

    @Override
    public void listarViaturas() {
        for (Viatura viatura : viaturas) {
            System.out.println(viatura);
        }
    }

    @Override
    public void ativarViatura(Viatura v) {
    }

    @Override
    public void desativarViatura(Viatura v) {
    }

    @Override
    public void editarViatura(Viatura v) {
    }

    @Override
    public void atribuirViatura(Condutor c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
