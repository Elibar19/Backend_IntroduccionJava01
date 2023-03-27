package egg.BackendJava01.Guia3_EstructurasDeControl;

import java.util.Scanner;

public class Ejer04 {
    public static void main(String[] args) {

        String frase;
        Scanner leer = new Scanner(System.in);

        System.out.println("Escriba una frase que la primera letra sea 'A'");
        frase = leer.nextLine();

        frase = frase.substring(0, 1);

        if (frase.equalsIgnoreCase("a")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
}