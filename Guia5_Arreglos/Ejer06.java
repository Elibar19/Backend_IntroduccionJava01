package egg.BackendJava01.Guia5_Arreglos;

import java.util.Scanner;

public class Ejer06 {
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        while (true) {
            cargar(matriz);
            imprimir(matriz);
            System.out.println("");
            if (verificar(matriz)) {
                System.out.println("Es magica");
            } else {
                System.out.println("No es magica");
            }
        }
    }

    /*FUNCION CARGAR Y VERIFICAR VALOR DENTRO DEL RANGO*/
    public static void cargar(int[][] matriz) {
        int num = 0;

        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {

                System.out.println("Ingrese un numero del 1 al 9 en la posicion " + f + " , " + c);
                num = leer.nextInt();
                if (num < 1 || num > 9) {
                    do {
                        System.out.println("Valor incorrecto. Ingrese nuevamente un numero entre 1 y 9");
                        num = leer.nextInt();
                    } while (num < 1 || num > 9);
                } else {
                    matriz[f][c] = num;
                }
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
    public static boolean verificar(int[][] matriz) {
        int sumaFila = 0;
        int comparacion = 0;
        for (int i = 0; i < matriz.length; i++) {
            sumaFila = 0;
            for (int j = 0; j < matriz.length; j++) {
                sumaFila += matriz[i][j];
            }
            if (i == 0) {
                comparacion = sumaFila;
                continue;
            }
            if (sumaFila != comparacion) {
                return false;
            }
        }
        int sumaColumna = 0;
        for (int j = 0; j < matriz.length; j++) {
            sumaColumna = 0;
            for (int i = 0; i < matriz.length; i++) {
                sumaColumna += matriz[i][j];
            }
            if (j == 0) {
                comparacion = sumaColumna;
                continue;
            }
            if (sumaColumna != comparacion) {
                return false;
            }
        }
        int sumaDiagonal = 0;
        for (int i = 0; i < matriz.length; i++) {
            sumaDiagonal += matriz[i][i];
        }
        int sumaDiagonalInversa = 0;
        int j = 2;
        for (int i = 0; i < matriz.length; i++) {
            sumaDiagonalInversa += matriz[i][j];
            j--;
        }
        return !(sumaDiagonalInversa != sumaDiagonal || sumaDiagonalInversa != sumaColumna || sumaDiagonalInversa != sumaFila);
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
