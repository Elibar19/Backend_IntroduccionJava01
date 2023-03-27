package egg.BackendJava01.Guia3_EstructurasDeControl;

import java.util.Scanner;

public class Extra03 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una letra: ");
        String letra = leer.next();

        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
            System.out.println("La letra es una vocal");
        } else {
            System.out.println("La letra no es una vocal");
        }
    }
}
