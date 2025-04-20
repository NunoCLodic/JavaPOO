package classes;

import interfaces.InterfaceCondutor;
import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public abstract class Condutor implements InterfaceCondutor {

    //Atributs da classe condutor
    protected String idCondutor;
    protected String categoria;
    protected String nome;
    protected LocalDate dataNascimento;
    protected char sexo;
    protected int contribuinte;
    protected String contato;
    protected String email;
    protected String nCartaConducao;
    protected List<Viatura> viaturas;
    protected double vMensalidade;//valor da mensalidade
    protected boolean mensalidade;
    protected Map<LocalDate, Boolean> pagamentos;//registar os pagamentos

    //construtor
    public Condutor(String categoria, String nome, String dataNascimento, char sexo,
            int contribuinte, String contato, String email, String nCartaConducao, List<Viatura> viatura) {
        this.categoria = categoria;
        this.idCondutor = UUID.randomUUID().toString().replace("-", "").substring(0, 8);
        this.nome = nome;
        this.dataNascimento = LocalDate.parse(dataNascimento);//converte a string no localDate
        this.sexo = sexo;
        this.contribuinte = contribuinte;
        if (!Validacao.ContatoValidator(contato)) {
            throw new IllegalArgumentException("Contato inválido: " + contato);
        }
        this.contato = contato;
        if (!Validacao.EmailValidator(email)) {
            throw new IllegalArgumentException("Email inválido: " + email);
        }
        this.email = email;
        if (!Validacao.NcartaValidator(nCartaConducao)) {
            throw new IllegalArgumentException("Carta de Condução inválido: " + nCartaConducao);
        }
        this.nCartaConducao = nCartaConducao;
        this.viaturas = new ArrayList<>();
        this.vMensalidade = 20;
        this.pagamentos = new HashMap<>();//iniciar o registro de pagamento
    }

    //Getters e Setters
    public String getIDcondutor() {
        return idCondutor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getContribuinte() {
        return contribuinte;
    }

    public void setContribuinte(int contribuinte) {
        this.contribuinte = contribuinte;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        if (!Validacao.ContatoValidator(contato)) {
            throw new IllegalArgumentException("Contato inválido: " + contato);
        }
        this.contato = contato;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!Validacao.EmailValidator(email)) {
            throw new IllegalArgumentException("Email inválido: " + email);
        }
        this.email = email;
    }

    public String getnCartaConducao() {
        return nCartaConducao;
    }

    public void setnCartaConducao(String nCartaConducao) {
        if (!Validacao.NcartaValidator(nCartaConducao)) {
            throw new IllegalArgumentException("Carta de Condução inválido: " + nCartaConducao);
        }
        this.nCartaConducao = nCartaConducao;
    }

    public double getMensalidade() {
        return vMensalidade;
    }

    public void setMensalidade(double Mensalidade) {
        this.vMensalidade = Mensalidade;
    }

    public List<Viatura> getViaturas() { //obter lista de viaturas
        return viaturas;
    }

    public void setViaturas(List<Viatura> viaturas) {
        this.viaturas = viaturas;
    }

    // METODOS ABSTRATOS
    @Override
    public abstract String detalhesCondutor();
    @Override
    public abstract void registrarPagamento(LocalDate mes);
    @Override
    public abstract boolean verificarPagamento(LocalDate mes);
    @Override
    public abstract void mostrarHistoricoPagamento();
    @Override
    public abstract void enviarMensagemSuporte(Suporte s);

    // OUTROS METODOS
 
    //Calcular idade do Condutor
    @Override
    public int calcularIdade() {
        LocalDate dataAtual = LocalDate.now();
        return dataAtual.getYear() - dataNascimento.getYear()
                - ((dataAtual.getMonthValue() < dataNascimento.getMonthValue()
                || (dataAtual.getMonthValue() == dataNascimento.getMonthValue()
                && dataAtual.getDayOfMonth() < dataNascimento.getDayOfMonth())) ? 1 : 0);
    }

}
