package egg.BackendJava01.Guia4_Subprogramas;

import java.util.Scanner;

public class Ejer03 {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        System.out.println("Ingrese la cantidad de euros:");
        float euros = leer.nextInt();
        System.out.println("""
                Elija a que moneda desea convertir el valor:\s
                - DOLAR
                - LIBRA
                - YEN
                """);
        String moneda = leer.next();
        moneda = moneda.toLowerCase();

        convertir(euros, moneda);
    }

    public static void convertir(float euros, String moneda) {

        switch (moneda) {
            case "dolar" -> System.out.println(euros + " euros equivalen a " + euros * 1.28 + " dolares.");
            case "libra" -> System.out.println(euros + " euros equivalen a " + euros * 0.86 + " libras.");
            case "yen" -> System.out.println(euros + " euros equivalen a " + euros * 129.85 + " yenes.");
        }
    }
}
