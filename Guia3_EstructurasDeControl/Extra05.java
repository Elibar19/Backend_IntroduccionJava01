package egg.BackendJava01.Guia3_EstructurasDeControl;

import java.util.Scanner;

public class Extra05 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String clase;
        int costo;

        System.out.println("Ingrese su categoria de socio (A/B/C)");
        clase = leer.nextLine();
        System.out.println("Ingrese el costo del tratamiento");
        costo = leer.nextInt();

        clase = clase.toLowerCase();
        switch (clase) {
            case "a":
                System.out.println("El costo final del tratamiento será de: " + costo / 2);
                break;

            case "b":
                System.out.println("El costo final del tratamiento será de: " + costo * 0.65);
                break;

            case "c":
                System.out.println("Usted no recibe descuento sobre dicho tratamiento.");
                break;

            default:
                System.out.println("Ha ingresado una categoria incorrecta.");
                break;
        }
    }
}
