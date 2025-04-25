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
public class Estacionamento_motociclos extends Estacionamento {

    public Estacionamento_motociclos(Zona zona, Categoria categoria, double latitude, double longitude, boolean coberto, double comprimentoMaximo, double larguraMaxima, double alturaMaxima) {
        super(zona, categoria, latitude, longitude, coberto, comprimentoMaximo, larguraMaxima, alturaMaxima);

        if (comprimentoMaximo < 0 || larguraMaxima < 0 || alturaMaxima < 0) {
            throw new IllegalArgumentException("Dimensões não podem ser negativas");
        }
        if (latitude < -90 || latitude > 90) {
            throw new IllegalArgumentException("Latitude inválida. Deve estar entre -90 e 90.");
        }
        if (longitude < -180 || longitude > 180) {
            throw new IllegalArgumentException("Longitude inválida. Deve estar entre -180 e 180.");
        }
    }

}
