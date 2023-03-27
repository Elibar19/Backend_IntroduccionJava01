package egg.BackendJava01.Guia3_EstructurasDeControl;

import java.util.Scanner;

public class Extra10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int x = (int) (Math.random() * 10);
        int x2;
        System.out.println("Escriba el numero para adivinarlo: ");

        do {
            {
                x2 = leer.nextInt();
                if (x2 == x) {
                    System.out.println("Has adivinado el numero");
                } else {
                    System.out.println("Intentelo de nuevo: ");
                }
            }
        } while (x2 != x);
    }
}
