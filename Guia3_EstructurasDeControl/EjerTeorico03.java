package egg.BackendJava01.Guia3_EstructurasDeControl;

import java.util.Scanner;

public class EjerTeorico03 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una nota");
        int nota = leer.nextInt();

        while (nota <= 0 || nota >= 10) {
            System.out.println("La nota ingresada es incorrecta. Ingrese una nota entre 0 y 10");
            nota = leer.nextInt();
        }
    }
}
