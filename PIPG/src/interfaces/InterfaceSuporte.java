
package interfaces;

import java.util.ArrayList;
import classes.Condutor;
import classes.Estacionamento;


public interface InterfaceSuporte {
    
    public void eliminarContaCondutor(Condutor c);
    public void enviarMensagemCondutor(Condutor c);  
    public void  ativarEstacionamento(Estacionamento e);
    public void desativarEstacionamento(Estacionamento e);
//    public void exibirlistaEstudantes(ArrayList<Estudante> estudantes);
    
        
}
