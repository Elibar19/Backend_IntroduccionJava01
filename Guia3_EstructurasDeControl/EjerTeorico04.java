package egg.BackendJava01.Guia3_EstructurasDeControl;

import java.util.Scanner;

public class EjerTeorico04 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = 0;
        int suma = 0;
        int i = 0;

        do {
            System.out.println("Escriba numeros para sumarlos (0 para finalizar). Los numeros negativos no se sumaran");
            num = leer.nextInt();

            if (num < 0) {
                continue;
            } else {
                suma += num;
                i += 1;
            }

        } while (num != 0 && i <= 20);

        System.out.println("Se capturo el numero 0");
        System.out.println("La suma de todos los valores ingresados correctamente es: " + suma);

    }
}
