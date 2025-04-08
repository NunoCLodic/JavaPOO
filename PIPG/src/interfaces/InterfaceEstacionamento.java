package interfaces;

import classes.Estacionamento;
import classes.Transporte;

public interface InterfaceEstacionamento {

    public void reservarEstacionamento(Transporte t, Estacionamento e);

    public void estacionar(Transporte t, Estacionamento e);

    public void desocuparEstacionamento(Transporte t, Estacionamento e);

    public void enviarNotificacaoSuporte();

    public void enviarNotificacaoMotorista();

}
