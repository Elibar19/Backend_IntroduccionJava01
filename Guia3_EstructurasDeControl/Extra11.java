package egg.BackendJava01.Guia3_EstructurasDeControl;

import java.util.Scanner;

public class Extra11 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int i = 0;

        System.out.println("Escriba un numero: ");
        int num = leer.nextInt();
        int res = num;

        do {
            res /= 10;
            i++;

        } while (res != 0);

        System.out.println("El numero tiene " + i + " digitos");

    }
}
