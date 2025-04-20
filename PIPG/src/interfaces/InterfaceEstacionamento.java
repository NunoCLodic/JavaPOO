package interfaces;

import classes.Estacionamento;
import classes.Transporte;
import classes.Viatura;
import java.time.LocalDate;
import java.util.List;

public interface InterfaceEstacionamento {

    public void reservarEstacionamento(Transporte t, Estacionamento e);

    public void estacionar(Transporte t, Estacionamento e);

    public void desocuparEstacionamento(Transporte t, Estacionamento e);

    public void enviarNotificacaoSuporte();

    public void enviarNotificacaoMotorista();
    
    public List<Viatura> listarViaturasPorDia(LocalDate data);
    
    public void mostrarViaturasPorDia(LocalDate data);
    

}
