/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livros;

public interface Publicacao {
    
    public void abrir();
    public void fechar();
    public void folhear(int p);
    public void avancarPagina();
    public void voltarPagina();
    
}
