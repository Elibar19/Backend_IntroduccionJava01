package Main;

import java.util.InputMismatchException;
import java.util.Scanner;
import Entidades.DivisionNumero;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        try{
        System.out.println("Ingrese el primer numero: ");
        String num1 = leer.next();
        System.out.println("Ingrese el segundo numero: ");
        String num2 = leer.next();

            int numero1 = Integer.parseInt(num1);
            int numero2 = Integer.parseInt(num2);

            int resultado = DivisionNumero.dividirNumeros(numero1, numero2);

            System.out.println("El resultado de la división es: " + resultado);
        } catch(InputMismatchException a){
            System.out.println("Debe ingresar numeros");
        } catch(NumberFormatException b){
            System.out.println("La cadena no se puede convertir a número");
        } catch(ArithmeticException c) {
            System.out.println("No se puede dividir por 0");
        }
    }
}