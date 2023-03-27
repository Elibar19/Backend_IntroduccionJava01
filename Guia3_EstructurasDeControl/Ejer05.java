package egg.BackendJava01.Guia3_EstructurasDeControl;

import java.util.Scanner;

public class Ejer05 {
    public static void main(String[] args) {
        int num, suma = 0;
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("Ingrese un numero (cuando la suma de ellos llegue a 100 finalizará)");
            num = leer.nextInt();
            suma += num;
        } while (suma < 100);
    }
}
