/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import classes.Motociclo;

/**
 *
 * @author Administrador
 */
public interface InterfaceMotociclo {

    public void adicionarMotociclo(Motociclo m);

    public void removerMotociclo(Motociclo m);

    public void listarMotociclo();

    public void ativarMotociclo(Motociclo m);

    public void desativarMotociclo(Motociclo m);

    public void editarMotociclo(Motociclo m);
}
