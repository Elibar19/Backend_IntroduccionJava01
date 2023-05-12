package Ejer5;

import Ejer5.Servicio.PaisService;

public class Main {
    public static void main(String[] args) {
        PaisService paises = new PaisService();
        paises.cargarPaises();
        paises.eliminarPais();
        paises.mostrarOrdenado();
    }
}