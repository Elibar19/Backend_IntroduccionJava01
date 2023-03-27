/*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDE), y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().*/

package egg.BackendJava01.Guia3_EstructurasDeControl;

import java.util.Scanner;

public class Ejer07 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        int cantCorrectas = 0;
        int cantIncorrectas = 0;

        System.out.println("Deberá escribir una cadena de caracteres de 5 caracteres de maximo, que comience con O y termine con X\nEscriba &&&&& para finalizar");


        for (int f = 1; f < 6; f++) {
            System.out.println("Ingrese la cadena nro: " + f);
            frase = leer.nextLine();
            String primerLetra = frase.substring(0, 1);
            String ultimaLetra = frase.substring(4, 5);

            if (frase.equalsIgnoreCase("&&&&&")) {
                System.out.println("Saliendo del programa...");
                break;
            } else if (frase.length() == 5 && primerLetra.equalsIgnoreCase("O") && ultimaLetra.equalsIgnoreCase("x")) {
                cantCorrectas += 1;
            } else {
                cantIncorrectas += 1;
            }
        }
        System.out.println("La cantidad de cadenas correctas ingresadas fue de: " + cantCorrectas);
        System.out.println("La cantidad de cadenas incorrectas ingresadas fue de: " + cantIncorrectas);
    }
}


