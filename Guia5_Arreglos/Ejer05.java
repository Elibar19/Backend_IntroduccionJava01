package egg.BackendJava01.Guia5_Arreglos;

import java.util.Scanner;

public class Ejer05 {
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        cargar(matriz);
        imprimir(matriz);
        verificar(matriz);
        mostrar(matriz);
    }

    /*FUNCION CARGAR*/
    public static void cargar(int[][] matriz) {

        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese el elemento de la posicion " + f + " , " + c);
                matriz[f][c] = leer.nextInt();
            }
        }
    }

    /*FUNCION IMPRIMIR*/
    public static void imprimir(int[][] matriz) {
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(" [ " + matriz[f][c] + " ] ");
            }
            System.out.println("");
        }
    }

    /*FUNCION VERIFICAR*/
    public static void verificar(int[][] matriz) {
        boolean verificar = false;
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                if (matriz[f][c] == -matriz[f][c]) {
                    verificar = true;
                }
            }

        }
        if (verificar) {
            System.out.println("La matriz es antisimetrica");
        } else {
            System.out.println("La matriz no es antisimetrica");
        }
    }

    /*FUNCION IMPRIMIR*/
    public static void mostrar(int[][] matriz) {
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(" [ " + matriz[f][c] + " ] ");
            }
            System.out.println("");
        }

        System.out.println("");

        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(" [ " + matriz[c][f] + " ] ");
            }
            System.out.println("");
        }
    }
}
