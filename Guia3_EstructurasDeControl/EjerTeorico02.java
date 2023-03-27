package egg.BackendJava01.Guia3_EstructurasDeControl;

import java.util.Scanner;

public class EjerTeorico02 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba el tipo de motor (1 al 4)");
        int opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;

            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;

            case 3:
                System.out.println("La bomba es una bomba de hormigon");
                break;

            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor valido para tipo de bomba");
        }
    }
}
