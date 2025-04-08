package interfaces;

import classes.Condutor;
import classes.Viatura;

public interface InterfaceViatura {

    public void adicionarViatura(Viatura v);

    public void atribuirViatura(Condutor c);

    public void removerViatura(Viatura v);

    public void listarViaturas();

    public void ativarViatura(Viatura v);

    public void desativarViatura(Viatura v);

    public void editarViatura(Viatura v);

}
