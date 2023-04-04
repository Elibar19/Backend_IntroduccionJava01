package Extra6;

import Extra6.Rectangulo.Rectangulo;

public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(4, 6);
        System.out.println(rectangulo1.calcularArea(rectangulo1.getLado1(), rectangulo1.getLado2()));
    }
}