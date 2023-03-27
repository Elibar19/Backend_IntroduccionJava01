package egg.BackendJava01.Guia4_Subprogramas;

import java.util.Scanner;

public class EjerTeorico01V2 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una secuencia de caracteres");
        String frase = leer.nextLine();

        System.out.println(fraseNueva(frase));

    }

    public static String fraseNueva(String frase) {

        String fraseNueva = "";

        for (int i = 0; i < frase.length(); i++) {

            char letra = frase.charAt(i);

            switch (letra) {
                case 'a':
                    fraseNueva = fraseNueva.concat("@");
                    break;

                case 'E', 'e':
                    fraseNueva = fraseNueva.concat("#");
                    break;

                case 'I', 'i':
                    fraseNueva = fraseNueva.concat("$");
                    break;

                case 'O', 'o':
                    fraseNueva = fraseNueva.concat("%");
                    break;

                case 'U', 'u':
                    fraseNueva = fraseNueva.concat("*");
                    break;

                default:
                    fraseNueva = fraseNueva.concat(String.valueOf(letra));
                    break;
            }
        }
        return fraseNueva;
    }
}
