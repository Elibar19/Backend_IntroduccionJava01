package egg.BackendJava01.Guia3_EstructurasDeControl;

import java.util.Scanner;

public class Extra07 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Escriba la cantidad de numeros a ingresar: ");
        int n = leer.nextInt();

        float nMax = Integer.MIN_VALUE;
        float nMin = Integer.MAX_VALUE;
        float promedio = 0;
        int i = 0;

        /*do    OPCION CON DO-WHILE
        {

            System.out.println("Ingrese el numero: ");
            float num = leer.nextFloat();

            if (num>nMax)
            {
                nMax=num;
            }
            if (num<nMin)
            {
                nMin = num;
            }
            promedio += num;

            i++;

        }while(i<n);*/

        while (i < n) {
            System.out.println("Ingrese el numero: ");
            float num = leer.nextFloat();

            if (num > nMax) {
                nMax = num;
            }
            if (num < nMin) {
                nMin = num;
            }
            promedio += num;

            i++;
        }

        System.out.println("El valor maximo es: " + nMax);
        System.out.println("El valor mas bajo es: " + nMin);
        System.out.println("El promedio es: " + (promedio /= n));
    }
}
