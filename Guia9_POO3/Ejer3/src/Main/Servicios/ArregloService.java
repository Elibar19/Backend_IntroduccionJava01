package Main.Servicios;

import java.util.Arrays;

public class ArregloService {
    public double[] inicializarArregloA(double[] arr) {

        for (int i = 0; i < arr.length; i++) {
            boolean repetido = true;
            double numAleatorio = -1; // Inicializar en un valor no válido para poder entrar al bucle

            while (repetido) {
                numAleatorio = Math.round(Math.random() * 100);
                repetido = false;

                // Comprobar si el número generado ya existe en el arreglo
                for (int j = 0; j < i; j++) {
                    if (numAleatorio == arr[j]) {
                        repetido = true;
                        break;
                    }
                }
            }
            arr[i] = numAleatorio;
        }
        return arr;
    }

    public void mostrarArreglo(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public double[] ordenar(double[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public double[] inicializarArregloB(double[] arrA, double[] arrB) {
        for (int i = 0; i < 10; i++) {
            arrB[i] = arrA[i];
        }
        Arrays.fill(arrB, 10, arrB.length, 0.5);
        return arrB;
    }
}

