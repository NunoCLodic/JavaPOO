
package classes;

import java.util.List;

public class Estudante_bolseiro extends Estudante{
    private double bolsa;
    
    public Estudante_bolseiro(Categoria categoria, String nome, String dataNascimento, char sexo, int contribuinte, String contato,
            String email, String numeroCartaConducao, List<Transporte> transporte, int nEstudante, double bolsa) {
        super(categoria, nome, dataNascimento, sexo, contribuinte, contato, email, numeroCartaConducao, transporte, nEstudante);
        this.bolsa = bolsa;
        this.vMensalidade = bolsa;
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
    
    
}
