package pipg;

public class Professor extends Condutor implements InterfaceCondutor {

    private int id;
    private String disciplina;

    public Professor(String categoria, String nome, String dataNascimento,
            char sexo, int contribuinte, int contato, Viatura viatura, int id, String disciplina) {

        super(categoria, nome, dataNascimento, sexo, contribuinte, contato, viatura);
        this.id = id;
        this.disciplina = disciplina;
    }
    //get e sett

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    //

    @Override
    public String detalhesCondutor() {
        return super.detalhesCondutor()
                + "\n id: " + id
                + ";\n disciplina: " + disciplina
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
        if ((e.getAtivo() == true) && (e.getLivre() == true)) {

        }
    }

    @Override
    public void desocuparEstacionamento(Viatura v, Estacionamento e) {
    }

    @Override
    public void enviarMensagemSuporte(Suporte s) {
    }
}
