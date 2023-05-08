package Ejer2;

import Ejer2.Entidades.Perro;
import Ejer2.Servicios.PerroServicio;

public class Main {
    public static void main(String[] args) {
        PerroServicio lista1 = new PerroServicio();
        lista1.crearPerro();
        lista1.recorrerRazas();
    }
}