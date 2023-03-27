package egg.BackendJava01.Guia5_Arreglos;

import java.util.Scanner;

public class Extra01 {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingrese el tamaño del vector");
        int tamaño = leer.nextInt();
        int[] vector = new int[tamaño];

        cargar(vector);
        imprimir(vector);
        sumar(vector);

    }

    public static void cargar(int[] vector) {

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el elemento de la posicion " + i);
            vector[i] = leer.nextInt();
        }
    }

    public static void imprimir(int[] vector) {
        for (int elemento : vector) {
            System.out.print(" [" + elemento + "] ");
        }
        System.out.println("");
    }

    public static void sumar(int[] vector) {
        int sumaElementos = 0;

        for (int elemento : vector) {
            sumaElementos += elemento;
        }
        System.out.println("La suma de todos los elementos es: " + sumaElementos);
    }
}
