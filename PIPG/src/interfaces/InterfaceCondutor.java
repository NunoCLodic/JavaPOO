package interfaces;

import classes.Suporte;
import java.time.LocalDate;

public interface InterfaceCondutor {
    public abstract String detalhesCondutor();

    public int calcularIdade();

    public abstract void registrarPagamento(LocalDate mes);

    public abstract boolean verificarPagamento(LocalDate mes);

    public abstract void mostrarHistoricoPagamento();

    public abstract void enviarMensagemSuporte(Suporte s);
}
