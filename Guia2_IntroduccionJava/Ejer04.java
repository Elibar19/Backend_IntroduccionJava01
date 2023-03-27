package egg.BackendJava01.Guia2_IntroduccionJava;

import java.util.Scanner;

/* Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
La fórmula correspondiente es: F = 32 + (9 * C / 5) */
public class Ejer04 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de grados centígrados");
        int C = leer.nextInt();
        int F = 32 + ((9 * C) / 5);
        System.out.println(C + " grados centigrados equivale a " + F + " grados Fahrenheit");
    }
}
