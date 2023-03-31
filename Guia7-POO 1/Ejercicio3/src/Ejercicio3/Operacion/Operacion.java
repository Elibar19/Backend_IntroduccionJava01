package Ejercicio3.Operacion;

import java.util.Scanner;

public class Operacion {
    Scanner leer = new Scanner(System.in);
    //-------------ATRIBUTOS-------------//
    private int numero1;
    private int numero2;

    //-----------------------------------//
    //-------------METODOS---------------//
    public Operacion() {

    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void crearOperacion() {
        System.out.println("Ingrese el numero 1: ");
        int nuevoNum1 = leer.nextInt();
        setNumero1(nuevoNum1);
        System.out.println("Ingrese el numero 2: ");
        int nuevoNum2 = leer.nextInt();
        setNumero2(nuevoNum2);
    }

    public int sumar() {
        int resultado = getNumero1() + getNumero2();
        return resultado;
    }

    public int restar() {
        int resultado = getNumero1() - getNumero2();
        return resultado;
    }

    public double multiplicar() {
        if (getNumero1() != 0 && getNumero2() != 0) {
            double resultado = getNumero1() * getNumero2();
            return resultado;
        } else {
            System.out.println("ERROR - Uno de los dos numeros es 0");
            return 0;
        }
    }

    public double dividir() {
        if (getNumero1() != 0 && getNumero2() != 0) {
            double resultado = getNumero1() * getNumero2();
            return resultado;
        } else {
            System.out.println("ERROR - Uno de los dos numeros es 0");
            return 0;
        }
    }
}
