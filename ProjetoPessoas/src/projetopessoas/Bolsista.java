
package projetopessoas;


public class Bolsista extends Aluno{
 
    private float bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovando bolsa do(a) bolsista "+ this.nome);
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println(this.nome + "é bolsista! pagamento facilitado.");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

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
    
    
    
}
