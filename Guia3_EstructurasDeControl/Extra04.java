package egg.BackendJava01.Guia3_EstructurasDeControl;

import java.util.Scanner;

public class Extra04 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero del 1 al 10: ");
        int num = leer.nextInt();

        switch (num) {
            case 1:
                System.out.println("Su equivalente en numero romano es: I");
                break;

            case 2:
                System.out.println("Su equivalente en numero romano es: II");
                break;

            case 3:
                System.out.println("Su equivalente en numero romano es: III");
                break;

            case 4:
                System.out.println("Su equivalente en numero romano es: IV");
                break;

            case 5:
                System.out.println("Su equivalente en numero romano es: V");
                break;

            case 6:
                System.out.println("Su equivalente en numero romano es: VI");
                break;

            case 7:
                System.out.println("Su equivalente en numero romano es: VII");
                break;

            case 8:
                System.out.println("Su equivalente en numero romano es: VIII");
                break;

            case 9:
                System.out.println("Su equivalente en numero romano es: IX");
                break;

            case 10:
                System.out.println("Su equivalente en numero romano es: X");
                break;

            default:
                System.out.println("Ha ingresado un numero incorrecto");
        }
    }
}