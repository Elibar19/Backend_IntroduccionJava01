package egg.BackendJava01.Guia4_Subprogramas;

import java.util.Scanner;

public class Ejer01 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese dos numeros: ");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();

        int opcion;

        do {
            System.out.println("""
                    Elije que operacion desea realizar:\s
                    OPCION 1: SUMA
                    OPCION 2: RESTA
                    OPCION 3: DIVISION
                    OPCION 4: MULTIPLICACION
                    OPCION 5: SALIR""");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El resultado es: " + suma(num1, num2));
                    break;

                case 2:
                    System.out.println("El resultado es: " + resta(num1, num2));
                    break;

                case 3:
                    System.out.println("El resultado es: " + multiplicacion(num1, num2));
                    break;

                case 4:
                    System.out.println("El resultado es: " + division(num1, num2));
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Usted ha ingresado una opcion incorrecta");
                    break;
            }
        } while (opcion != 5);
    }

    public static int suma(int n1, int n2) {

        int res;
        res = n1 + n2;
        return res;

    }

    public static int resta(int n1, int n2) {

        int res;
        res = n1 - n2;
        return res;

    }

    public static int division(int n1, int n2) {

        int res;
        res = n1 / n2;
        return res;

    }

    public static int multiplicacion(int n1, int n2) {

        int res;
        res = n1 * n2;
        return res;

    }
}
