package Ejer2;

import Ejer2.Entidades.ParDeNumeros;
import Ejer2.Servicios.ParDeNumerosService;

public class Main {
    public static void main(String[] args) {
        ParDeNumeros numeros = new ParDeNumeros();
        ParDeNumerosService ns = new ParDeNumerosService();
        ns.mostrarValores(numeros);
        ns.retornarMayor(numeros);
        ns.calcularPotencia(numeros);
        ns.calcularRaiz(numeros);
    }
}