package egg.BackendJava01.Guia3_EstructurasDeControl;

import java.util.Scanner;

public class Extra14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float cantHijos, edadHijos, totalHijos = 0, totalEdad = 0;

        System.out.println("Cuantas familias ingresará?");
        int cantFamilias = leer.nextInt();

        for (int f = 0; f < cantFamilias; f++) {
            System.out.println("Cuantos hijos tiene la familia " + (f + 1));
            cantHijos = leer.nextInt();

            totalHijos += cantHijos;

            for (int j = 0; j < cantHijos; j++) {
                System.out.println("Ingrese la edad de los hijos: ");
                edadHijos = leer.nextInt();

                totalEdad += edadHijos;
            }
        }
        System.out.println("La edad media de todos los hijos es de: " + (totalEdad /= totalHijos));
    }
}
