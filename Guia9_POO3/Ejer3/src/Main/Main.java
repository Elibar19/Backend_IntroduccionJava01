package Main;

import Main.Servicios.ArregloService;

public class Main {
    public static void main(String[] args) {
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        ArregloService arrS = new ArregloService();
        System.out.println("\nArreglo A\n");
        arrS.inicializarArregloA(arregloA);
        arrS.mostrarArreglo(arregloA);
        System.out.println("-------------------------------------");
        System.out.println("\nArreglo A Ordenado\n");
        arrS.ordenar(arregloA);
        arrS.mostrarArreglo(arregloA);
        System.out.println("-------------------------------------");
        System.out.println("\nArreglo B\n");
        arrS.inicializarArregloB(arregloA, arregloB);
        arrS.mostrarArreglo(arregloB);
        System.out.println("-------------------------------------");
    }
}