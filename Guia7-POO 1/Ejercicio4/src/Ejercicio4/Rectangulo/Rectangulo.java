package Ejercicio4.Rectangulo;

import java.util.Scanner;

public class Rectangulo {
    Scanner leer = new Scanner(System.in);
    //-------ATRIBUTOS--------//
    private int base;
    private int altura;

    //-------ATRIBUTOS--------//
    //-------METODOS----------//
    public Rectangulo() {
    }
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void crearRectangulo() {
        System.out.println("Ingrese la base del rectangulo: ");
        base = leer.nextInt();
        System.out.println("Ingrese la altura del rectangulo: ");
        altura = leer.nextInt();
    }

    public double perimetro() {
        double perimetro = (base + altura) * 2;
        return perimetro;
    }

    public double superficie() {
        double superficie = base * altura;
        return superficie;
    }

    public void dibujarRectangulo() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || j == 0 || i == altura - 1 || j == base - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
