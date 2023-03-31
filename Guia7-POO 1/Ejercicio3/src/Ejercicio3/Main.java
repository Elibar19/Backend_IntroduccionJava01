package Ejercicio3;

import Ejercicio3.Operacion.Operacion;
public class Main {
    public static void main(String[] args) {

        Operacion op1 = new Operacion();
        op1.crearOperacion();
        System.out.println(op1.sumar());
        System.out.println(op1.restar());
        System.out.println(op1.multiplicar());
        System.out.println(op1.dividir());

    }
}