package classes;

import java.awt.geom.Point2D;

class Localizacao {

    int id;
    private static int contadorId = 1;
    private Point2D coordenadas;

    //construtor localizacao
    public Localizacao(double latitude, double longitude) {
        this.coordenadas = new Point2D.Double(latitude, longitude);
        this.id = contadorId;
        contadorId++;
    }

    //get latitude e longetude
    public double getLatitude() {
        return coordenadas.getX();
    }

    public double getLongitude() {
        return coordenadas.getY();
    }

    @Override
    public String toString() {
        return "Lat->" + getLatitude() + "; Long->" + getLongitude();
    }

}
