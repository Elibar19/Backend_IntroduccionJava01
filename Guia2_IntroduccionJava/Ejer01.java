package egg.BackendJava01.Guia2_IntroduccionJava;

import java.util.Scanner;

/* Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de la suma */
public class Ejer01 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int suma;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = leer.nextInt();

        suma = num1 + num2;

        System.out.println(suma);
    }
}

