package egg.BackendJava01.Guia3_EstructurasDeControl;

import java.util.Scanner;

public class Ejer06 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int opcion, num1, num2;

        System.out.println("Ingrese dos numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        boolean ban = true;


        do {
            System.out.println("Menu");
            System.out.println("1.SUMAR");
            System.out.println("2.RESTAR");
            System.out.println("3.MULTIPLICAR");
            System.out.println("4.DIVIDIR");
            System.out.println("5.FINALIZAR");
            System.out.println("Elija opcion");

            opcion = leer.nextInt();
            switch (opcion) {

                case 1:
                    System.out.println("El resultado de la suma es: " + (num1 + num2));
                    break;

                case 2:
                    System.out.println("El resultado de la resta es: " + (num1 - num2));
                    break;

                case 3:
                    System.out.println("El resultado de la multiplicacion es: " + (num1 * num2));
                    break;

                case 4:
                    System.out.println("El resultado de la division es: " + (num1 / num2));
                    break;

                case 5:
                    System.out.println("¿Esta seguro que quiere salir del programa(S/N)?");
                    String opcion2 = leer.next();
                    if (opcion2.equalsIgnoreCase("S")) {
                        ban = false;
                    } else if (opcion2.equalsIgnoreCase("N")) {
                    } else {
                        System.out.println("La opcion ingresada no es valida. Vuelve al menu");
                    }
                    break;
                default:
                    System.out.println("La opcion ingresada no existe");
                    break;
            }
        } while (ban);

    }
}
