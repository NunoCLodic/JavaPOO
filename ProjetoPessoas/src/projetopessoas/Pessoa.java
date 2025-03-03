
package projetopessoas;


public abstract class  Pessoa {
    //atributos de pessoa
    protected  String nome;
    protected int idade;
    protected String sexo;
    //metodo fazer aniversario
    public void fazerAniversario(){
        this.idade ++;
    }
    //metodos especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "***Pessoa*** " 
                + "\n nome: " + nome 
                + ";\n idade: " + idade 
                + ";\n sexo: " + sexo 
                + ";\n'*******************'";
    }
    
    
    
}
