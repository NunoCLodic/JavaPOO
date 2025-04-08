
package classes;


public class MensagemChat {
    
    private String remetente;
    private String destinatario;
    private String mensagem;
    private long timestamp;

    public MensagemChat(String remetente, String destinatario, String mensagem, long timestamp) {
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.mensagem = mensagem;
        this.timestamp = timestamp;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "MensagemChat{" 
                + "remetente: " + remetente 
                + ", destinatario: " + destinatario 
                + ", mensagem: " + mensagem 
                + ", timestamp: " + timestamp 
                + '}';
    }
    
    
   
    
    
}
