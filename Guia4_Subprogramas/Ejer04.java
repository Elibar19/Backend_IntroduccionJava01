package egg.BackendJava01.Guia4_Subprogramas;

import java.util.Scanner;

public class Ejer04 {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        System.out.println("Escriba un numero para validar si es primo:");
        int num = leer.nextInt();

        if (validarPrimo(num)) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no es primo");
        }
    }

    public static boolean validarPrimo(int num) {

        int primo = 0;

        for (int f = 1; f <= num; f++) {
            if (num % f == 0) {
                primo++;
            }
            if (primo > 2) {
                break;
            }
        }
        return primo <= 2;
    }
}
