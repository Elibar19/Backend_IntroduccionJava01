package Ejercicio2.Medidas;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Medidas {
    Scanner leer = new Scanner(System.in);

    //-------ATRIBUTOS---------//
    private double radio;
    //-------ATRIBUTOS---------//

    //-------METODOS---------//
    public Medidas() {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia() {
        System.out.println("Ingrese el radio de la circuferencia: ");
        double rad = leer.nextDouble();
        setRadio(rad);
    }

    public double area() {
        double area = (PI * getRadio() * getRadio());
        return area;
    }

    public double perimetro() {
        double perimetro = (2 * getRadio() * PI);
        return perimetro;
    }
}
