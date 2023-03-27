package egg.BackendJava01.Guia5_Arreglos;

import java.util.Scanner;

public class Extra02 {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese el tamaño que tendran los vectores: ");
        int tamaño = leer.nextInt();

        int[] vector1 = new int[tamaño];
        int[] vector2 = new int[tamaño];

        cargarVectores(vector1, vector2);
        imprimirVectores(vector1, vector2);
        verificarIgualdad(vector1, vector2);
        if (verificarIgualdad(vector1, vector2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }
    }

    public static void cargarVectores(int[] vector1, int[] vector2) {
        int i = 0;
        for (int elemento : vector1) {
            System.out.println("Ingrese el elemento de la posicion " + i + " del primer vector");
            vector1[i] = leer.nextInt();
            i++;
        }

        i = 0;
        for (int elemento : vector2) {
            System.out.println("Ingrese el elemento de la posicion " + i + " del segundo vector");
            vector2[i] = leer.nextInt();
            i++;
        }
    }

    public static void imprimirVectores(int[] vector1, int[] vector2) {
        for (int elemento : vector1) {
            System.out.print(" [" + elemento + "] ");
        }

        System.out.println("");

        for (int elemento : vector2) {
            System.out.print(" [" + elemento + "] ");
        }
    }

    public static boolean verificarIgualdad(int[] vector1, int[] vector2) {
        boolean verificar = false;
        for (int f = 0; f < vector1.length; f++) {
            if (vector1[f] == vector2[f]) {
                verificar = true;
            } else {
                verificar = false;
                break;
            }
        }
        return verificar;
    }
}
