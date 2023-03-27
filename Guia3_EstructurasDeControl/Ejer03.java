package egg.BackendJava01.Guia3_EstructurasDeControl;

import java.util.Scanner;

public class Ejer03 {
    public static void main(String[] args) {

        String frase;
        Scanner leer = new Scanner(System.in);

        System.out.println("Escriba una frase de 8 caracteres");
        frase = leer.nextLine();

        if (frase.length() == 8) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
}
