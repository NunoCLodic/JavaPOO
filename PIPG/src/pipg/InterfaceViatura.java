
package pipg;

public interface InterfaceViatura {
    
    public void ativarViatura(Viatura v); 
    public void desativarViatura(Viatura v);
    public void estacionarViatura(Viatura v, Estacionamento e);
    public void desocuparEstacionamento(Viatura v);
    public void editarViatura(Viatura v);

    
}
