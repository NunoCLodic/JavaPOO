
package pipg;


public class Estudante extends Condutor implements InterfaceCondutor{
    
    private int id;
    private String curso;
    private int ano;

    public Estudante(String categoria,String nome, String dataNascimento, char sexo, int contribuinte,
            int contato, Viatura viatura, int id, String curso, int ano) {
        
        super(categoria,nome, dataNascimento, sexo, contribuinte, contato, viatura); 
        this.id = id;
        this.curso = curso;
        this.ano = ano;
    }
    //get set de condutores Estudantes
    public int getNumeroEstudante() {
        return id;
    }

    public void setNumeroEstudante(int numeroEstudante) {
        this.id = numeroEstudante;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

     //Detalhes do Condutor Estudante
    @Override
    public String detalhesCondutor() {
        return super.detalhesCondutor() 
                + "\n numero estudante: " + id
                + ";\n curso: " + curso
                + ";\n ano: " + ano
                + "\n******************************************************\n";
    }
    
  
    //metodos do condutor
    @Override
    public void adicionarViatura(Viatura v) {
        setViatura(viatura);
    }

    @Override
    public void editarViatura(Viatura v) {
        getViatura();
    }

    @Override
    public void eliminarViatura(Viatura v) {
        //em construcao
    }

    @Override
    public void reservarEstacionamento(Viatura v, Estacionamento e) {
        if ((e.getAtivo() == true) && (e.getLivre() == true)) {
            System.out.println("10 Minutos até a Viatura " + v.getMatricula() + " estacionar");
        } else {
            System.out.println("impossivel reservar estacionamento");
        }
    }

    @Override
    public void estacionarViatura(Viatura v, Estacionamento e) {
        if((e.getAtivo() == true)&&(e.getLivre() == true)){
            
        }
    }

    @Override
    public void desocuparEstacionamento(Viatura v, Estacionamento e) {
    }

    @Override
    public void enviarMensagemSuporte(Suporte s) {
    }
}
