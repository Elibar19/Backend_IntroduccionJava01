package egg.BackendJava01.Guia3_EstructurasDeControl;

import java.util.Scanner;

public class EjerTeorico05 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = 0;
        System.out.println("Ingrese 4 numeros");

        for (int i = 0; i < 4; i++) {
            System.out.println("");
            num = leer.nextInt();
            for (int f = 0; f < num; f++) {
                if (f == 0) {
                    System.out.println("");
                    System.out.print(num + " ");
                }
                System.out.print("*");
            }
        }
    }
}