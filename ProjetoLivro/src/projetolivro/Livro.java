/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetolivro;

/**
 *
 * @author Administrador
 */
public class Livro implements Publicacao {
    
    // atributos do Livro
    private String titulo;
    private String autor;
    private int totalPagina;
    private int paginaAtual;
    private Boolean aberto;
    private Pessoa leitor;
    
    //metodo detalhes

    public String detalhes() {
        return "livro{" + "titulo=" + titulo + "\n, autor=" 
                + autor + "\n, totalPagina=" + totalPagina + "\n, paginaAtual=" 
                + paginaAtual + "\n, aberto=" + aberto + "\n, leitor=" + leitor.getNome() + '}';
    }

    //metodo construtor
    public Livro(String titulo, String autor, int totalpagina, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPagina = totalpagina;
        this.aberto = false;
        this.paginaAtual = 0;
        this.leitor = leitor;
    }

    //gets and setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalpagina() {
        return totalPagina;
    }

    public void setTotalpagina(int totalpagina) {
        this.totalPagina = totalpagina;
    }

    public int getPaginaatual() {
        return paginaAtual;
    }

    public void setPaginaatual(int paginaatual) {
        this.paginaAtual = paginaatual;
    }

    public Boolean getAberto() {
        return aberto;
    }

    public void setAberto(Boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    //implementacao da interface
    @Override
    public void abrir() {
       this.aberto = true;
    }

    @Override
    public void fechar() {
      this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        this.paginaAtual = p;
    }

    @Override
    public void avancarPagina() {
        this.paginaAtual++;
    }

    @Override
    public void voltarPagina() {
        this.paginaAtual--;
    }
  
  
  
}
