package egg.BackendJava01.Guia5_Arreglos;

import java.util.Scanner;

public class Ejer03 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int[] vector = new int[5];
        int i = 0;

        for (int f = 0; f < 5; f++) {
            System.out.println("Ingrese el elemento del vector");
            int num = leer.nextInt();
            vector[f] = num;
        }

        for (int elemento : vector) //Imprimo el vector
        {
            System.out.print(" [" + elemento + "] ");

        }

        for (int elemento : vector) {
            i++;
            int res = elemento;
            int cont = 0;
            do {
                res = res / 10;
                cont++;
            } while (res != 0);
            System.out.println("");
            System.out.println("El elemento de la posicion " + i + " tiene " + cont + " digitos");
        }
    }
}
