
package pipgproject;
import java.time.LocalDate;
//import org.apache.commons.validator.routines.EmailValidator;
import java.util.UUID;

public class Condutor {
    
    //Atributs da classe condutor
    private String IDcondutor;
    private String nome;
    private LocalDate dataNascimento;
    private char sexo;
    private int contribuinte;
    private int contato;
    private String email;

    private Viatura viatura;
    

    //construtor

    public Condutor(String nome, String dataNascimento, char sexo, int contribuinte, int contato
            /*String email*/, Viatura viatura) {
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

    public String getIDcondutor() {
        return IDcondutor;
    }

    public void setIDcondutor(String IDcondutor) {
        this.IDcondutor = IDcondutor;
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
    
    public String getIdDaViatura(){
        return viatura.getIDviatura();
    }
    
    //Calcular idade do Condutor
    public int calcularIdade(){
        LocalDate dataAtual = LocalDate.now();
        return dataAtual.getYear() - dataNascimento.getYear() - 
                ((dataAtual.getMonthValue() < dataNascimento.getMonthValue()||
                (dataAtual.getMonthValue() == dataNascimento.getMonthValue()&& 
                dataAtual.getDayOfMonth() < dataNascimento.getDayOfMonth()))?1:0);
    }
    
    //Detalhes do motorista

    public String DetalhesCondutor() {
        return "*********** DETALHES DO CONDUTOR COM ID: "+IDcondutor +" **************"  
                + ";\n nome: "  + nome 
                + ";\n idade: "  + calcularIdade() + " anos"
                + ";\n sexo: " + sexo 
                + ";\n contribuinte: " + contribuinte 
                + ";\n contato: " + contato 
                + ";\n ID da viatura: " /*+ getIdDaViatura()*/
                +"\n******************************************************";
    }
    
}
