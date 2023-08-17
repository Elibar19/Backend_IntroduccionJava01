import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Random random = new Random();
        int numero = random.nextInt(500) + 1;
        int intentos = 0;
        int respuestaNro = 0;

        do {
            System.out.println("Adivine el numero secreto entre 1 y 500");
            intentos++;
            try {
                String respuesta = leer.next();
                respuestaNro = Integer.parseInt(respuesta);
                if (respuestaNro > numero){
                    System.out.println("Ha ingresado un número mayor. Intente de nuevo");
                }
                else if (respuestaNro < numero){
                    System.out.println("Ha ingresado un numero menor. Intente de nuevo");
                }
                else if (respuestaNro == numero){
                    System.out.println("Usted ha adivinado!");
                    System.out.println("Numero de intentos realizados: "+intentos);
                }

            } catch (NumberFormatException a) {
                System.out.println("No se ha ingresado un número.");
            }
        } while (respuestaNro != numero);
    }
}