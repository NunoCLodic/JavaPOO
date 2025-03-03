package pipg;

import java.time.LocalDate;
//import org.apache.commons.validator.routines.EmailValidator;
import java.util.UUID;

public abstract class Condutor {

    //Atributs da classe condutor
    protected String IDcondutor;
    protected String categoria;
    protected String nome;
    protected LocalDate dataNascimento;
    protected char sexo;
    protected int contribuinte;
    protected int contato;
    protected String email;
    protected Viatura viatura;

    //construtor
    public Condutor(String categoria,String nome, String dataNascimento, char sexo, int contribuinte, int contato, Viatura viatura) {
        this.categoria = categoria;
        this.IDcondutor = UUID.randomUUID().toString().replace("-", "").substring(0, 8);
        this.nome = nome;
        this.dataNascimento = LocalDate.parse(dataNascimento);//converte a string no localDate
        this.sexo = sexo;
        this.contribuinte = contribuinte;
        this.contato = contato;
//        if(EmailValidator.getInstance().isValid(email)){
//            this.email = email;
//        }else{
//            throw new IllegalArgumentException("Email invalido!");
//        }
        this.viatura = viatura;

    }
    //get e sett

    public String getIDcondutor() {//nao tem set do IDcondutor
        return IDcondutor;
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

    public int getContato() {
        return contato;
    }

    public void setContato(int contato) {
        this.contato = contato;
    }
    //Metodos
    //get do ID da viatura

    public String getIdDaViatura() {
        return viatura.getIDviatura();
    }

    //Calcular idade do Condutor
    public int calcularIdade() {
        LocalDate dataAtual = LocalDate.now();
        return dataAtual.getYear() - dataNascimento.getYear()
                - ((dataAtual.getMonthValue() < dataNascimento.getMonthValue()
                || (dataAtual.getMonthValue() == dataNascimento.getMonthValue()
                && dataAtual.getDayOfMonth() < dataNascimento.getDayOfMonth())) ? 1 : 0);
    }
    
    
    //Detalhes Comum Condutor
    public String detalhesCondutor() {
        return "*********** DETALHES DO CONDUTOR COM ID: " + IDcondutor + " **************"
                + ";\n Catedoria: " + categoria
                + ";\n nome: " + nome
                + ";\n idade: " + calcularIdade() + " anos"
                + ";\n sexo: " + sexo
                + ";\n contribuinte: " + contribuinte
                + ";\n contato: " + contato
                + ";\n id da viatura: "/*+ viatura.getIDviatura()*/ + " (em construção);"
                ;
    }

}
