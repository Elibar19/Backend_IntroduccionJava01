package egg.BackendJava01.Guia4_Subprogramas;

import java.util.Scanner;


public class Ejer02 {
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {


        System.out.println("Ingrese la cantidad de personas");
        int n = leer.nextInt();

        esMayor(n);

    }

    public static void esMayor(int n) {

        for (int f = 0; f < n; f++) {
            System.out.println("Ingrese el nombre de la persona: ");
            String nombre = leer.next();

            System.out.println("Ingrese la edad: ");
            int edad = leer.nextInt();

            if (edad < 18) {
                System.out.println(nombre + " es menor de edad.");
            } else {
                System.out.println(nombre + " es mayor de edad.");
            }

            if (f < n - 1) {
                System.out.println("¿Desea continuar?(S/N)");
                String opcion = leer.next();

                if (opcion.equalsIgnoreCase("n")) {
                    break;
                }

            }
        }
    }
}
