package egg.BackendJava01.Guia5_Arreglos;

import java.util.Scanner;

public class Extra05 {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Ingrese el tamaño de las filas de la matriz: ");
        int f = leer.nextInt();
        System.out.println("Ingrese el tamaño de las columnas de la matriz: ");
        int c = leer.nextInt();

        int[][] matriz = new int[f][c];

        cargar(matriz);
        imprimir(matriz);
        System.out.println("La suma de todos sus elementos es: " + sumaMatriz(matriz));

    }

    public static void cargar(int[][] matriz) {
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz.length; c++) {
                matriz[f][c] = (int) (Math.random() * 10);
            }
        }
    }

    public static void imprimir(int[][] matriz) {
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz.length; c++) {
                System.out.print(" [" + matriz[f][c] + "] ");
            }
            System.out.println("");
        }
    }

    public static int sumaMatriz(int[][] matriz) {

        int suma = 0;
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz.length; c++) {
                suma += matriz[f][c];
            }
        }
        return suma;
    }
}
