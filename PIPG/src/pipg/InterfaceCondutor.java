package pipg;

public interface InterfaceCondutor {

    public int calcularIdade();

    public abstract String detalhesCondutor();

    public void adicionarViatura(Viatura v);

    public void removerViatura(Viatura viatura);

    public void listarViaturas();

    public void editarViatura(Viatura v);

    public void eliminarViatura(Viatura v);

    public void reservarEstacionamento(Viatura v, Estacionamento e);

    public void estacionarViatura(Viatura v, Estacionamento e);

    public void desocuparEstacionamento(Viatura v, Estacionamento e);

    public void enviarMensagemSuporte(Suporte s);
}
