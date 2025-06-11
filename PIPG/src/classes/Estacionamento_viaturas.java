/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Administrador
 */
public class Estacionamento_viaturas extends Estacionamento {

    public Estacionamento_viaturas(Zona zona, Categoria categoria, double latitude, double longitude, boolean coberto, double comprimentoMaximo,
            double larguraMaxima, double alturaMaxima) {
        super(zona, categoria, latitude, longitude, coberto, comprimentoMaximo, larguraMaxima, alturaMaxima);

    }

}
