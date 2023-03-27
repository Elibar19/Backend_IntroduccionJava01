/**
 * Escribir un programa que procese una secuencia de caracteres ingresada por
 * teclado y terminada en punto, y luego codifique la palabra o frase ingresada de
 * la siguiente manera: cada vocal se reemplaza por el carácter que se indica en
 * la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
 * mantienen sin cambios.
 **/


package egg.BackendJava01.Guia4_Subprogramas;

import java.util.Scanner;

public class EjerTeorico01 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una secuencia de caracteres que termine en punto.");
        String frase = leer.nextLine();

        String fraseNueva = frase;

        fraseNueva = fraseNueva.replaceAll("a", "@");
        fraseNueva = fraseNueva.replaceAll("e", "#");
        fraseNueva = fraseNueva.replaceAll("i", "$");
        fraseNueva = fraseNueva.replaceAll("o", "%");
        fraseNueva = fraseNueva.replaceAll("u", "*");

        fraseNueva = fraseNueva.replaceAll("A", "@");
        fraseNueva = fraseNueva.replaceAll("E", "#");
        fraseNueva = fraseNueva.replaceAll("I", "$");
        fraseNueva = fraseNueva.replaceAll("O", "%");
        fraseNueva = fraseNueva.replaceAll("U", "*");

        System.out.println(fraseNueva);

    }
}



