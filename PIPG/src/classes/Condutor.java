package classes;

import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public abstract class Condutor {

    //Atributs da classe condutor
    protected String idCondutor;
    protected Categoria categoria;
    protected String nome;
    protected LocalDate dataNascimento;
    protected char sexo;
    protected int contribuinte;
    protected String contato;
    protected String email;
    protected String numeroCartaConducao;
    protected List<Transporte> transportes;
    protected double vMensalidade;//valor da mensalidade
    protected boolean mensalidade;
    protected Map<LocalDate, Boolean> pagamentos;//registar os pagamentos

    public enum Categoria {
        PROFESSOR, ESTUDANTE, FUNCIONARIO
    }

    //construtor
    public Condutor(Categoria categoria, String nome, String dataNascimento, char sexo,
            int contribuinte, String contato, String email, String numeroCartaConducao, List<Transporte> transportes) {
        //validações
        if (dataNascimento == null || dataNascimento.isEmpty()) {
            throw new IllegalArgumentException("Data de nascimento não pode ser nula ou vazia.");
        }
//        if (this.dataNascimento.isAfter(LocalDate.now())) {
//            throw new IllegalArgumentException("Data de nascimento não pode ser no futuro.");
//        }
        if (!Validacao.ContatoValidator(contato)) {
            throw new IllegalArgumentException("Contato inválido: " + contato);
        }
        if (!Validacao.EmailValidator(email)) {
            throw new IllegalArgumentException("Email inválido: " + email);
        }
        if (!Validacao.NcartaValidator(numeroCartaConducao)) {
            throw new IllegalArgumentException("Carta de Condução inválido: " + numeroCartaConducao);
        }
        if (transportes != null && transportes.stream().anyMatch(v -> v == null)) {
            throw new IllegalArgumentException("A lista de transporte contém valores nulos.");
        }

        this.categoria = categoria;
        this.idCondutor = UUID.randomUUID().toString().replace("-", "").substring(0, 8);
        this.nome = nome;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.dataNascimento = LocalDate.parse(dataNascimento, formatter);//converte a string no localDate
        this.sexo = sexo;
        this.contribuinte = contribuinte;
        this.contato = contato;
        this.email = email;
        this.numeroCartaConducao = numeroCartaConducao;
        this.transportes = transportes != null ? transportes : new ArrayList<>();
        this.vMensalidade = 20;
        this.pagamentos = new HashMap<>();//iniciar o registro de pagamento
    }

    //Getters e Setters
    public String getIDcondutor() {
        return idCondutor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
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
        return numeroCartaConducao;
    }

    public void setnCartaConducao(String nCartaConducao) {
        if (!Validacao.NcartaValidator(nCartaConducao)) {
            throw new IllegalArgumentException("Carta de Condução inválido: " + nCartaConducao);
        }
        this.numeroCartaConducao = nCartaConducao;
    }

    public double getMensalidade() {
        return vMensalidade;
    }

    public void setMensalidade(double Mensalidade) {
        this.vMensalidade = Mensalidade;
    }

    public List<Transporte> getTransportes() { //obter lista de viaturas
        return transportes;
    }

    public void setTransportes(List<Transporte> transportes) {
        this.transportes = transportes;
    }
//METODOS ABSTRATOS

    public abstract String detalhesCondutor();

    public abstract void registrarPagamento(LocalDate mes);

   
    public abstract void enviarMensagemSuporte(Suporte s);

//METODOS FINAL CALCULAR IDADE DO CONDUTOR
    public final int calcularIdade() {
        LocalDate dataAtual = LocalDate.now();
        return dataAtual.getYear() - dataNascimento.getYear()
                - ((dataAtual.getMonthValue() < dataNascimento.getMonthValue()
                || (dataAtual.getMonthValue() == dataNascimento.getMonthValue()
                && dataAtual.getDayOfMonth() < dataNascimento.getDayOfMonth())) ? 1 : 0);
    }
    
//METODO PARA VERIFICAR PAGAMENTO
    public boolean verificarPagamento(LocalDate mes) {
        return pagamentos.getOrDefault(mes.withDayOfMonth(1), false); // Retorna false se não houver registro
    }

 //METODO PARA MOSTRAR HISTORICO DE PAGAMENTE
    public void mostrarHistoricoPagamento() {
        System.out.println("HISTÓRICO DE PAGAMENTO DO(A): (" + nome + ") - ID:(" + idCondutor + ")");
        LocalDate hoje = LocalDate.now();
        for (int i = 0; i < 12; i++) {
            LocalDate mes = hoje.minusMonths(i).withDayOfMonth(1); // Obter o início de cada mês
            boolean pago = pagamentos.getOrDefault(mes, false); // Verificar se o mês foi pago

            // Exibir o status do mês
            System.out.println("Mês: " + mes.getMonth() + " " + mes.getYear()
                    + " - Estado: " + (pago ? "Pago" : "Pendente"));
        }
        System.out.println("\n");
    }

}
