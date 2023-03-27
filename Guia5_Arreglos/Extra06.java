package egg.BackendJava01.Guia5_Arreglos;

import java.util.Random;
import java.util.Scanner;

public class Extra06 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        char[][] matriz = new char[20][20];
        Random random = new Random();
        String palabra;

        for (int f = 0; f < 5; f++) {
            int aleatorio = random.nextInt(20);
            do {
                System.out.println("Escriba una palabra: ");
                palabra = leer.nextLine();
            } while (palabra.length() > 5 || palabra.length() < 3);
            for (int c = 0; c < palabra.length(); c++) {
                matriz[aleatorio][c] = palabra.charAt(c);
            }
        }

        for (int f = 0; f < 20; f++) {
            for (int c = 0; c < 20; c++) {
                if (matriz[f][c] == '\u0000') {
                    matriz[f][c] = (char) ('0' + random.nextInt(10));
                }
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println();
        }
    }
}
