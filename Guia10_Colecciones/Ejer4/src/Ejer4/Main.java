package Ejer4;

import Ejer4.Servicio.PeliculaServicio;

public class Main {
    public static void main(String[] args) {
        PeliculaServicio peliService = new PeliculaServicio();
        peliService.crearPelicula();
        peliService.mostrarPeliculas();
    }
}