

/*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
        Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
        lo siguiente:*/


package egg.BackendJava01.Guia3_EstructurasDeControl;

import java.util.Scanner;

public class Ejer08 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;

        System.out.println("Ingrese un numero");
        num = leer.nextInt();

        for (int f = 0; f < num; f++) {
            for (int j = 0; j < num; j++) {
                if (f > 0 && f < num - 1 && j > 0 && j < num - 1) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }
}

