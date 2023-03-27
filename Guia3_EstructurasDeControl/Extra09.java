package egg.BackendJava01.Guia3_EstructurasDeControl;

import java.util.Scanner;

public class Extra09 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int residuo = 0, cociente = 0;

        System.out.println("Ingrese el dividendo: ");
        int dividendo = leer.nextInt();
        System.out.println("Ingrese el divisor: ");
        int divisor = leer.nextInt();

        do {
            dividendo -= divisor;

            residuo = dividendo;
            cociente++;

        } while (dividendo > divisor);

        System.out.println(residuo);
        System.out.println(cociente);
    }
}
