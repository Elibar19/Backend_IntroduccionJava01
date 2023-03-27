package egg.BackendJava01.Guia3_EstructurasDeControl;

import java.util.Scanner;

public class Extra08 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, n, nPar = 0, nImpar = 0, cant = 0;

        System.out.println("Ingrese la cantidad de numeros: ");
        n = leer.nextInt();

        for (int f = 0; f < n; f++) {
            System.out.println("Escriba un numero: ");
            num = leer.nextInt();

            if (num % 5 == 0) {
                break;
            }
            if (num < 0) {
                continue;
            } else if (num % 2 == 0) {
                nPar += 1;
            } else {
                nImpar += 1;
            }
            cant++;
        }

        System.out.println("La cantidad de numeros pares leidos es: " + nPar);
        System.out.println("La cantidad de numeros impares leidos es: " + nImpar);
        System.out.println("La cantidad de numeros totales leidos es: " + cant);

    }
}
