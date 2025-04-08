package classes;

//import java.util.ArrayList;
import classes.MensagemChat;
import classes.Estacionamento;
import classes.Condutor;
import interfaces.InterfaceSuporte;
import java.util.ArrayList;
import java.util.UUID;

public class Suporte implements InterfaceSuporte {

    //atributos do suporte
    private String id;
    private String zona;//o suporte so poderá gerir estacionamento da sua zona
    private String Senha;
    private MensagemChat mensagem;
    private Condutor condutor;
    private Estacionamento estacionamento;
    private Viatura viatura;
    private int listaCondutor;
    private int totalCondutor;
    private int listaViatura;
    private int totalviaturas;
    private int listaEstacionamento;
    private int listaEstacionamentoZona;
    private int estacionamentoLivre;
    private int estacionamentoLivreZona;
    private int estacionamentoOcupado;
    private int estacionamentoOcupadoZona;
    private int totalEstacionamento;
    private int totalEstacionamentoZona;

    //construtor do suporte
    public Suporte(String zona) {
        this.id = UUID.randomUUID().toString().replace("-", "").substring(0, 4);
        this.zona = zona;
        this.Senha = UUID.randomUUID().toString().replace("-", "").substring(0, 8);
    }
    //get e set do suporte

    public String getIDsuporte() {
        return id;
    }

    public void setIDsuporte(String id) {
        this.id = id;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    //metodo detalhes suporte
    public String detalhesSuporte() {
        return "***********DETALHES DO SUPORTE COM ID: " + id + "**************"
                + "zona: " + zona
                + ", Senha: " + Senha //depois retirado
                + ", Estacionamentos Livres: " + estacionamentoLivre
                + ", Estacionamentos Livres: " + estacionamentoLivreZona
                + ", Estacionamentos Livres: " + estacionamentoOcupado
                + ", Estacionamentos Livres: " + estacionamentoOcupadoZona
                + ", Estacionamentos Livres: " + totalEstacionamento
                + ", Estacionamentos Livres: " + totalEstacionamentoZona
                + "\n******************************************************\n";
    }

    @Override
    public void eliminarContaCondutor(Condutor c) {
        //em construcao
    }

    @Override
    public void enviarMensagemCondutor(Condutor c) {
        //em construcao
    }

    @Override
    public void ativarEstacionamento(Estacionamento e) {
        e.ativar();
    }

    @Override
    public void desativarEstacionamento(Estacionamento e) {
        e.Desativar();
    }

//    public static void exibirlistaEstudantes(ArrayList<Estudante> estudantes) {
//        System.out.println("Estudantes: ");
//        for (Estudante estudante : estudantes) {
//            System.out.println(estudante.detalhesCondutor());
//        }
//    }

}
