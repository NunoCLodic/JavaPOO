package pipg;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Professor extends Condutor implements InterfaceCondutor {

    private int id;
    private String disciplina;

    public Professor(String categoria, String nome, String dataNascimento,
            char sexo, int contribuinte, String contato, String email, String nCartaConducao, List<Viatura> viatura, int id, String disciplina) {

        super(categoria, nome, dataNascimento, sexo, contribuinte, contato, email, nCartaConducao, viatura);
        this.id = id;
        this.disciplina = disciplina;
    }

    //Getters e Setters
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

    //metodos
    @Override
    public String detalhesCondutor() {
        StringBuilder detalhes = new StringBuilder();

        detalhes.append("********DETALHES DO CONDUTOR COM ID: ").append(idCondutor).append("********\n");
        detalhes.append("Catedoria: ").append(categoria).append("\n");
        detalhes.append("Id do professor: ").append(id).append("\n");
        detalhes.append("Nome: ").append(nome).append("\n");
        detalhes.append("Idade: ").append(calcularIdade()).append(" anos\n");
        detalhes.append("Discilplina: ").append(disciplina).append("\n");
        detalhes.append("Sexo: ").append(sexo).append("\n");
        detalhes.append("Contribuinte: ").append(contribuinte).append("\n");
        detalhes.append("Contato: ").append(contato).append("\n");
        detalhes.append("Nº carta Condução: ").append(nCartaConducao).append("\n");
        for (Viatura viatura : viaturas) {
            detalhes.append("Matricula da viatura: ").append(viatura.getMatricula()).append("\n");
        }
        detalhes.append("Valor da mensalidade: ").append(mensalidade).append("€\n");
        detalhes.append("Email: ").append(email).append("\n");
        detalhes.append("**********************************************");
        return detalhes.toString();

//        return super.detalhesCondutor()
//                + "\n id: " + id
//                + ";\n disciplina: " + disciplina
//                + "\n******************************************************\n";
    }
    //compara dois objetos pela numero de estudante

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Professor professor = (Professor) o;
        return Objects.equals(id, professor.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
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

    @Override
    public void editarViatura(Viatura v) {
    }

    @Override
    public void eliminarViatura(Viatura v) {
    }

    @Override
    public void registrarPagamento(LocalDate mes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean verificarPagamento(LocalDate mes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mostrarHistoricoPagamento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
