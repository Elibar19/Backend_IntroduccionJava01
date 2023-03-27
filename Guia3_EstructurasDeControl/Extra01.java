package egg.BackendJava01.Guia3_EstructurasDeControl;

import java.util.Scanner;

public class Extra01 {
    public static void main(String[] args) {
        int minutos;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de minutos: ");
        minutos = leer.nextInt();

        int dias = minutos / 1440;
        int horas = minutos % 1440 / 60;

        System.out.println(minutos + " minutos equivale a " + dias + " día/s y " + horas + " hora/s.");
    }
}
