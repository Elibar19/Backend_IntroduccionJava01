package Ejer2.Servicios;

import Ejer2.Entidades.ParDeNumeros;

public class ParDeNumerosService {
    public void mostrarValores(ParDeNumeros numeros) {
        System.out.println("El primer numero es " + numeros.getNum1());
        System.out.println("El segundo numero es " + numeros.getNum2());
    }

    public void retornarMayor(ParDeNumeros numeros) {
        if (Integer.compare(numeros.getNum1(), numeros.getNum2()) == 0) {
            System.out.println("Los numeros son iguales");
        } else if (Integer.compare(numeros.getNum1(), numeros.getNum2()) == 1) {
            System.out.println("El primer numero (" + numeros.getNum1() + ") es mayor");
        } else {
            System.out.println("El segundo numero (" + numeros.getNum2() + ") es mayor");
        }
    }

    public void calcularPotencia(ParDeNumeros numeros) {
        int num1 = Math.round(numeros.getNum1());
        int num2 = Math.round(numeros.getNum2());
        int potencia = 0;
        if (num1 > num2) {
            potencia = (int) Math.pow(num1, num2);
        } else {
            potencia = (int) Math.pow(num2, num1);
        }
        System.out.println("La potencia del mayor valor elevado al menor valor es " + potencia);
    }

    public void calcularRaiz(ParDeNumeros numeros) {
        int valorAbsoluto = 0;
        double raiz = 0;
        if (numeros.getNum1() > numeros.getNum2()) {
            valorAbsoluto = Math.abs(numeros.getNum2());
            raiz = Math.sqrt(valorAbsoluto);
        } else {
            valorAbsoluto = Math.abs(numeros.getNum1());
            raiz = Math.sqrt(valorAbsoluto);
        }
        System.out.println("La raiz cuadrada del menor numero es " + raiz);
    }
}
