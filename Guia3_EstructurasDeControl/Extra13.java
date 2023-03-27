package egg.BackendJava01.Guia3_EstructurasDeControl;

import java.util.Scanner;

public class Extra13 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la altura de la escalera: ");
        int altura = leer.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((j + 1));
            }
            System.out.println();
        }
    }
}
