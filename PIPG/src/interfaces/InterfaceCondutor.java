package interfaces;

import classes.Estacionamento;
import classes.Suporte;
import classes.Viatura;

public interface InterfaceCondutor {

    public int calcularIdade();
    public abstract String detalhesCondutor();
    public void enviarMensagemSuporte(Suporte s);
}
