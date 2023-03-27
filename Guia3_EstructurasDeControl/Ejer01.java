package egg.BackendJava01.Guia3_EstructurasDeControl;

import java.util.Scanner;

public class Ejer01 {
    public static void main(String[] args) {

        int num;
        Scanner leer = new Scanner(System.in);

        System.out.println("Escriba un numero");
        num = leer.nextInt();

        if (num % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
}
