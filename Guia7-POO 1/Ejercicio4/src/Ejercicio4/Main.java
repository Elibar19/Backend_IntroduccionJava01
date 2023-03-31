package Ejercicio4;

import Ejercicio4.Rectangulo.Rectangulo;

public class Main {
    public static void main(String[] args) {

        Rectangulo rect1 = new Rectangulo();
        rect1.crearRectangulo();
        System.out.println("Perimetro: " + rect1.perimetro());
        System.out.println("Superficie: " + rect1.superficie());
        rect1.dibujarRectangulo();

    }
}