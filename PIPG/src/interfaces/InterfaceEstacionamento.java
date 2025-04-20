package interfaces;

import classes.Estacionamento;
import classes.Transporte;
import classes.Viatura;
import java.time.LocalDate;
import java.util.List;

public interface InterfaceEstacionamento {
    
    public void reservarEstacionamento(Transporte t);

    public void estacionar(Transporte t, Estacionamento e);

    public void desocuparEstacionamento(Transporte t);

    public void enviarNotificacaoSuporte();

    public void enviarNotificacaoMotorista();
    
    public void mostrarViaturasPorDia(LocalDate data);
    
    public void verificarReservaExpirada();
    
    public List<Transporte> listarTransportesPorDia(LocalDate data);
    

}
