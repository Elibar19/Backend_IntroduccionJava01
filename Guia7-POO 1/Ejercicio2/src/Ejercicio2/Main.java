package Ejercicio2;

import Ejercicio2.Medidas.Medidas;

public class Main {
    public static void main(String[] args) {

        Medidas circulo1 = new Medidas();
        circulo1.crearCircunferencia();
        System.out.println("El area es: " + circulo1.area());
        System.out.println("El area es: " + circulo1.perimetro());

    }
}