package egg.BackendJava01.Guia2_IntroduccionJava;

import java.util.Scanner;

public class Ejer05 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        System.out.println(num * 2);
        System.out.println(num * 3);
        System.out.println(Math.sqrt(num));
    }
}
    