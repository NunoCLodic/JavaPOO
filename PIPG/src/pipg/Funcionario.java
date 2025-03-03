package pipg;

public class Funcionario extends Condutor implements InterfaceCondutor {

    private int id;
    private String seccao;

    public Funcionario(String categoria, String nome, String dataNascimento, char sexo,
            int contribuinte, int contato, Viatura viatura, int id, String seccao) {

        super(categoria, nome, dataNascimento, sexo, contribuinte, contato, viatura);
        this.id = id;
        this.seccao = seccao;
    }

    //gett e sett
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSeccao() {
        return seccao;
    }

    public void setSeccao(String seccao) {
        this.seccao = seccao;
    }

    //resto dos detalhes do funcionario

    @Override
    public String detalhesCondutor() {
        return super.detalhesCondutor()
                + "\n id: " + id
                + ";\n seccao: " + seccao
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
