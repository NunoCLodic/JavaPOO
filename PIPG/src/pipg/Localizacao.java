
package pipg;

import java.awt.geom.Point2D;


class Localizacao {
    private Point2D coordenadas;
    //construtor localizacao
    public Localizacao(double latitude, double longitude){
        this.coordenadas = new Point2D.Double(latitude, longitude);
    }
    //get latitude e longetude
    public double getLatitude(){
        return coordenadas.getX();
    }
    
    public double getLongitude(){
        return coordenadas.getY();
    }
}
