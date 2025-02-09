package LutadorGit;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitoria;
    private int derrota;
    private int empate;  
    
    public void apresentar(){
        System.out.println("**********************APRESENTACÃO**************************");
        System.out.println("CHEGOU A HORA! APRESENTAMOS O LUTADOR :" + this.getNome());
        System.out.println("DIRETAMENTE DE: " +this.getNacionalidade());
        System.out.println("COM: " +this.getIdade() + " Anos");
        System.out.println("PESENDO: " +this.getPeso() + "Kg");
        System.out.println(this.getVitoria() + " Vitórias");
        System.out.println(this.getEmpate()+ " Empates e");
        System.out.println(this.getDerrota()+ " Derotas");
        System.out.println("--------------------------------------------------------");
    }
    public void status(){
        System.out.println("**********************STATUS**************************");
        System.out.println(this.getNome()+ " é um peso " + this.getCategoria());
        System.out.println("Ganhou "+this.getVitoria()+ " Vezes");
        System.out.println("Perdeu "+this.getDerrota()+ " Vezes");
        System.out.println("Empatou "+this.getEmpate()+ " Vezes");
    }
    public void ganharLuta(){
        this.setVitoria(this.getVitoria() + 1);
       // this.vitoria = this.vitoria + 1;
    }
    public void empatarLuta(){
        this.setEmpate(this.getEmpate() + 1);
    }
    public void perderLuta(){
        this.setDerrota(this.getDerrota() +1);
    }
    //Construtor de Lutador
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitoria, int derrota, int empate) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitoria = vitoria;
        this.derrota = derrota;
        this.empate = empate;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if(this.peso < 52.2){
            this.categoria = "Invalido";
        }else if(this.peso <= 70.3){
            this.categoria = "Leve";
        }else if(this.peso <= 83.9){
            this.categoria = "Médio";
        }else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Invalido";
        }
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }
       
    
}
