package pipg;

import java.util.List;

public class Funcionario extends Condutor implements InterfaceCondutor {

    private int id;
    private String seccao;

    public Funcionario(String categoria, String nome, String dataNascimento,
            char sexo, int contribuinte, String contato, String email, String nCartaConducao, List<Viatura> viatura, int id, String seccao) {

        super(categoria, nome, dataNascimento, sexo, contribuinte, contato, email, nCartaConducao, viatura);
        this.id = id;
        this.seccao = seccao;
    }

    //Getters e Setters
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

        StringBuilder detalhes = new StringBuilder();

        detalhes.append("********DETALHES DO CONDUTOR COM ID: ").append(idCondutor).append("********\n");
        detalhes.append("Catedoria: ").append(categoria).append("\n");
        detalhes.append("Id do funcionario: ").append(id).append("\n");
        detalhes.append("nome: ").append(nome).append("\n");
        detalhes.append("secção: ").append(seccao).append("\n");
        detalhes.append("idade: ").append(calcularIdade()).append(" anos\n");
        detalhes.append("sexo: ").append(sexo).append("\n");
        detalhes.append("contribuinte: ").append(contribuinte).append("\n");
        detalhes.append("contato: ").append(contato).append("\n");
        detalhes.append("Nº carta Condução: ").append(nCartaConducao).append("\n");
          for (Viatura viatura : viaturas) {
            detalhes.append("Matricula da viatura: ").append(viatura.getMatricula()).append("\n");
            detalhes.append("Id da viatura: ").append(viatura.getIDviatura()).append("\n");
        }
        detalhes.append("Valor da mensalidade: ").append(mensalidade).append("€\n");
        detalhes.append("Email: ").append(email).append("\n");
        detalhes.append("**********************************************");
        return detalhes.toString();

//        return super.detalhesCondutor()
//                + "\n id: " + id
//                + ";\n seccao: " + seccao
//                + "\n******************************************************\n";
    }

    //metodos do condutor
    @Override
    public void adicionarViatura(Viatura v) {
//        setViatura(viatura);
    }

    @Override
    public void editarViatura(Viatura v) {
//        getViatura();
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
