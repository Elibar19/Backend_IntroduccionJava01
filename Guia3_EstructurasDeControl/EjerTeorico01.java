package egg.BackendJava01.Guia3_EstructurasDeControl;

import java.util.Scanner;

public class EjerTeorico01 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        System.out.println("Ingrese un numero");
        num1 = leer.nextInt();
        System.out.println("Ingrese un numero");
        num2 = leer.nextInt();

        if (num1 > 25 && num2 > 25) {
            System.out.println("Ambos numeros son mayores que 25");
        } else if (num1 > 25 || num2 > 25) {
            System.out.println("Uno de los dos numeros es mayor a 25");
        } else {
            System.out.println("Ningun numero es mayor a 25");
        }
    }
}

