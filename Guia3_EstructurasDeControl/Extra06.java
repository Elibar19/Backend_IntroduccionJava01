package egg.BackendJava01.Guia3_EstructurasDeControl;

import java.util.Scanner;

public class Extra06 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float altura = 0;
        float promedioMayor = 0;
        float promedioMenor = 0;
        int cantB = 0;

        System.out.println("Ingrese la cantidad de alturas que seran calculadas");
        int cantA = leer.nextInt();

        for (int f = 0; f < cantA; f++) {
            System.out.println("Ingrese la altura");
            altura = leer.nextFloat();

            promedioMayor += altura;

            if (altura < 1.60) {
                promedioMenor += altura;
                cantB += 1;
            }
        }

        System.out.println("Promedio de altura general: " + (promedioMayor /= cantA));
        System.out.println("Cantidad de personas por debajo de 1.60: " + cantB);
        System.out.println("Promedio de la altura de las personas que miden menos de 1.60m: " + (promedioMenor /= cantB));
    }
}
