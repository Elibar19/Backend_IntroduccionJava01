package Extra2;

import Extra2.Punto.Puntos;

public class Main {
    public static void main(String[] args) {

        Puntos puntos1 = new Puntos();
        puntos1.crearPuntos();
        System.out.println(puntos1.calcularDistancia());
    }
}