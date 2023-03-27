package egg.BackendJava01.Guia2_IntroduccionJava;

import java.util.Scanner;

/* Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla */
public class Ejer02 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Cual es tu nombre?");
        String nombre = leer.nextLine();
        System.out.println("Hola " + nombre);
    }
}
