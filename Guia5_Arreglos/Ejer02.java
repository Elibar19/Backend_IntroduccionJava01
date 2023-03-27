package egg.BackendJava01.Guia5_Arreglos;

import java.util.Scanner;

public class Ejer02 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int[] vector = new int[10];

        for (int f = 0; f < 10; f++) //Cargo el vector
        {
            vector[f] = (int) (Math.random() * 11);
        }

        for (int elemento : vector) //Imprimo el vector
        {
            System.out.println("[" + elemento + "]");
        }

        System.out.println("¿Que numero desea buscar?(Elegir un numero del 0 al 10)");
        int num = leer.nextInt(); //Numero que desea encontrar

        int pos = -1;

        for (int f = 0; f < 10; f++) {
            if (vector[f] == num) {
                pos = f;
                System.out.println("El numero se encuentra en la posicion: " + pos);
            }

        }
        if (pos == -1) {
            System.out.println("El numero no se encuentra en el vector");
        }
    }
}
