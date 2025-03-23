package pipg;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public abstract class Condutor {

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
    protected double mensalidade;///valor da mensalidade
    protected Map<LocalDate, Boolean> statusMensalidade;//registar os pagamentos

    //construtor
    public Condutor(String categoria, String nome, String dataNascimento, char sexo,
            int contribuinte, String contato, String email, String nCartaConducao, List<Viatura> viatura) {
        this.categoria = categoria;
        this.idCondutor = UUID.randomUUID().toString().replace("-", "").substring(0, 8);
        this.nome = nome;
        this.dataNascimento = LocalDate.parse(dataNascimento);//converte a string no localDate
        this.sexo = sexo;
        this.contribuinte = contribuinte;
        if (!ContatoValidator(contato)) {
            throw new IllegalArgumentException("Contato inválido: " + contato);
        }
        this.contato = contato;
        if (!EmailValidator(email)) {
            throw new IllegalArgumentException("Email inválido: " + email);
        }
        this.email = email;
        if (!NcartaValidator(nCartaConducao)) {
            throw new IllegalArgumentException("Carta de Condução inválido: " + nCartaConducao);
        }
        this.nCartaConducao = nCartaConducao;
        this.viaturas = viatura;
        this.viaturas = new ArrayList<>();
        this.statusMensalidade = new HashMap<>();//iniciar o registro de pagamento

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
        this.email = email;
    }

    public String getnCartaConducao() {
        return nCartaConducao;
    }

    public void setnCartaConducao(String nCartaConducao) {
        this.nCartaConducao = nCartaConducao;
    }

    public double isMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double Mensalidade) {
        this.mensalidade = Mensalidade;
    }
    
    public List<Viatura> getViaturas() { //obter lista de viaturas
        return viaturas;
    }

    public void setViaturas(List<Viatura> viaturas) {
        this.viaturas = viaturas;
    }

    //Metodos
    //Calcular idade do Condutor
    public int calcularIdade() {
        LocalDate dataAtual = LocalDate.now();
        return dataAtual.getYear() - dataNascimento.getYear()
                - ((dataAtual.getMonthValue() < dataNascimento.getMonthValue()
                || (dataAtual.getMonthValue() == dataNascimento.getMonthValue()
                && dataAtual.getDayOfMonth() < dataNascimento.getDayOfMonth())) ? 1 : 0);
    }

    //Detalhes do Condutor
    public abstract String detalhesCondutor();

    // Adicionar uma viatura à lista
    public void adicionarViatura(Viatura viatura) {
        if (viaturas.contains(viatura)) {
            System.out.println("A viatura já está associada ao condutor.");
        } else {
            viaturas.add(viatura);
            System.out.println("Viaturas adicionadas");
        }
    }

    // Remover uma viatura da lista
    public void removerViatura(Viatura viatura) {
        if (viaturas.remove(viatura)) {
            System.out.println("Viatura removida com sucesso.");
        } else {
            System.out.println("A viatura não está associada ao condutor.");
        }
    }

    // Listar viaturas
    public void listarViaturas() {
        for (Viatura viatura : viaturas) {
            System.out.println(viatura);
        }
    }
//  Metodos de Validações

    private boolean NcartaValidator(String nCartaConducao) {
        // Expressão regular para verificar se é um número com exatamente 8 dígitos
        String regex = "^[0-9]{8}$";
        return nCartaConducao != null && nCartaConducao.matches(regex);
    }

    private boolean EmailValidator(String email) {
        // Expressão regular para validar e-mails
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email != null && email.matches(regex);
    }

    private boolean ContatoValidator(String contato) {
        // Valida prefixos móveis 
        String regex = "^(9[123689])[0-9]{7}$";
        return contato != null && contato.matches(regex);
    }

}
