package egg.BackendJava01.Guia2_IntroduccionJava;

import java.util.Scanner;

public class Ejer03 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Escriba una frase");
        String frase = leer.nextLine();
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }
}
