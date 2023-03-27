package egg.BackendJava01.Guia5_Arreglos;

import java.util.Scanner;

public class Extra04 {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        double[] promedioAlumnos = new double[2];
        cargar(promedioAlumnos);
        cantidad(promedioAlumnos);
    }

    public static void cargar(double[] promedioAlumnos) {
        for (int i = 0; i < promedioAlumnos.length; i++) {
            System.out.println("Ingrese la nota del primer trabajo practico evaluativo: ");
            double nota1 = leer.nextDouble();
            System.out.println("Ingrese la nota del segundo trabajo practico evaluativo: ");
            double nota2 = leer.nextDouble();
            System.out.println("Ingrese la nota del primer integrador: ");
            double nota3 = leer.nextDouble();
            System.out.println("Ingrese la nota del segundo integrador: ");
            double nota4 = leer.nextDouble();

            double promedio = ((nota1 * 0.10) + (nota2 * 0.15) + (nota3 * 0.25) + (nota4 * 0.50));
            promedioAlumnos[i] = promedio;
        }
    }

    public static void cantidad(double[] promedioAlumnos) {
        int aprobados = 0;
        int desaprobados = 0;
        for (int i = 0; i < promedioAlumnos.length; i++) {
            if (promedioAlumnos[i] >= 7) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }
        System.out.println("El numero de aprobados es: " + aprobados);
        System.out.println("El numero de desaprobados es: " + desaprobados);
    }
}
