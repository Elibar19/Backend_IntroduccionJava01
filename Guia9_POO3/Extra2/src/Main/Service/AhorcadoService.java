package Main.Service;

import Main.Entidades.Ahorcado;

import java.util.Arrays;
import java.util.Scanner;

public class AhorcadoService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearJuego(Ahorcado juego1) {

        System.out.println("Ingrese la palabra secreta: ");
        String palabra = leer.next();
        System.out.println("Ingrese la cantidad de intentos que tendrá el jugador: ");
        juego1.setCantidadJugadas(leer.nextInt());

        String[] letra = new String[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {
            letra[i] = String.valueOf(palabra.charAt(i));

        }
        juego1.setPalabra(letra);
        System.out.println("Comienza el juego. Usted tiene " + juego1.getCantidadJugadas() + " intentos");
    }

    public int longitud(Ahorcado juego) {
        String[] palabra = juego.getPalabra();
        return palabra.length;
    }

    public boolean buscar(String letra, Ahorcado juego) {

        boolean letraEncontrada = false;
        String[] palabra = juego.getPalabra();
        System.out.println("Longitud de la palabra: " + palabra.length);
        for (int i = 0; i < palabra.length; i++) {
            if (letra.equalsIgnoreCase(palabra[i])) {
                letraEncontrada = true;
                juego.setCantidadLetras(juego.getCantidadLetras() + 1);
                break;
            }
        }
        if (letraEncontrada) {
            System.out.println("La letra pertenece a la palabra");
        } else {
            System.out.println("La letra NO pertenece a la palabra");
            juego.setCantidadJugadas(juego.getCantidadJugadas() - 1);
        }
        return letraEncontrada;
    }

    public int intentos(Ahorcado juego) {
        return juego.getCantidadJugadas();
    }

    public void juego(Ahorcado juego1) {
        crearJuego(juego1);
        do {
            System.out.println("Ingrese una letra: ");
            String letra = leer.next();
            System.out.println("Longitud de la palabra: " + longitud(juego1));
            buscar(letra, juego1);
            System.out.println("Numeros de letras (encontradas, faltantes): " + juego1.getCantidadLetras() + "/" + (longitud(juego1) - juego1.getCantidadLetras()));
            System.out.println("Numero de oportunidades restantes: " + juego1.getCantidadJugadas());

            if (juego1.getCantidadLetras() == longitud(juego1)) {
                System.out.println("¡Felicidades! Has adivinado todas las letras de la palabra.");
                break;
            }

            if (juego1.getCantidadJugadas() == 0) {
                System.out.println("Lo siento, has perdido. La palabra secreta era: " + Arrays.toString(juego1.getPalabra()));
                break;
            }

        } while (true);
    }
}
