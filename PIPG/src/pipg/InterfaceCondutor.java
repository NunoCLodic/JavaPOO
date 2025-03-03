
package pipg;

public interface InterfaceCondutor {
    
    public void adicionarViatura(Viatura v);
    public void editarViatura(Viatura v);
    public void eliminarViatura(Viatura v);
    public void reservarEstacionamento(Viatura v,Estacionamento e);
    public void estacionarViatura(Viatura v, Estacionamento e);
    public void desocuparEstacionamento(Viatura v, Estacionamento e);
    public void enviarMensagemSuporte(Suporte s);
}
