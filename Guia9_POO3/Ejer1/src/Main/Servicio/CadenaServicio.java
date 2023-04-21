package Main.Servicio;

import Main.Entidades.Cadena;

import java.util.Scanner;

public class CadenaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public int mostrarVocales(Cadena frase) {
        int cantVocales = 0;
        String frase1 = frase.getFrase();
        for (int i = 0; i < frase1.length(); i++) {
            if (frase1.charAt(i) == 'a' ||
                    frase1.charAt(i) == 'e' ||
                    frase1.charAt(i) == 'i' ||
                    frase1.charAt(i) == 'o' ||
                    frase1.charAt(i) == 'u') {
                cantVocales++;
            }
        }
        return cantVocales;
    }

    public String invertirFrase(Cadena frase) {
        String fraseInvertida = "";
        String frase1 = frase.getFrase();
        for (int i = frase.getLongitud() - 1; i >= 0; i--) {
            fraseInvertida += frase1.charAt(i);
        }
        return fraseInvertida;
    }

    /*public static void invertirFrase(String frase) {
        // Convertir la frase a un arreglo de caracteres
        char[] caracteres = frase.toCharArray();

        // Invertir el arreglo de caracteres
        for (int i = 0; i < caracteres.length / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[caracteres.length - 1 - i];
            caracteres[caracteres.length - 1 - i] = temp;
        }

        // Convertir el arreglo de caracteres invertido de vuelta a una cadena de texto
        String fraseInvertida = new String(caracteres);

        // Mostrar la frase invertida por pantalla
        System.out.println(fraseInvertida);
    }*/

    public void vecesRepetido(Cadena frase) {

        int veces = 0;
        String frase1 = frase.getFrase();
        System.out.println("Escriba la letra que desea saber cuantas veces se repite");
        String letra = leer.next();
        for (int i = 0; i < frase.getLongitud(); i++) {
            if (letra.equalsIgnoreCase(String.valueOf(frase1.charAt(i)))) {
                veces++;
            }
        }
        System.out.println("La letra se repite " + veces + " veces");
    }

    public void compararLongitud(Cadena frase) {
        System.out.println("Escriba la nueva frase que quiere comparar con la original");
        String nuevaFrase = leer.next();
        if (frase.getFrase().compareTo(nuevaFrase) == 0) {
            System.out.println("Las frases son de igual longitud");
        } else if (frase.getFrase().compareTo(nuevaFrase) == 1) {
            System.out.println("La frase original es mas larga");
        } else {
            System.out.println("La frase nueva es mas larga");
        }

    }

    public void unirFrases(Cadena frase) {
        System.out.println("Escriba la nueva frase que desea unir a la original");
        String fraseNueva = leer.next();
        System.out.println(frase.getFrase().concat(" " + fraseNueva));
    }

    public void reemplazar(Cadena frase) {
        System.out.println("Escriba la letra que reemplazara las letras \"a\"");
        String letra = leer.next();
        System.out.println(frase.getFrase().replaceAll("a", letra));

    }

    public void contiene(Cadena frase) {
        System.out.println("Escriba la letra que desea saber si se encuentra en la frase");
        String letra = leer.next();
        System.out.println(frase.getFrase().contains(letra));
    }
}
