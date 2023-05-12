package Ejer4.Servicio;

import Ejer4.Entidades.Pelicula;
import Ejer4.Utilidades.Comparadores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PeliculaServicio {
    private Scanner leer;
    private ArrayList<Pelicula> peliculas;

    public PeliculaServicio() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.peliculas = new ArrayList<>();
    }

    public void crearPelicula() {
        String opcion;
        do {
            System.out.println("Escriba el titulo de la película");
            String titulo = leer.next();
            System.out.println("Escriba el nombre del director/a");
            String director = leer.next();
            System.out.println("Escriba la duracion de la película (en horas)");
            double duracion = leer.nextDouble();

            Pelicula peli = new Pelicula(titulo, director, duracion);
            peliculas.add(peli);

            System.out.println("¿Desea añadir otra película?(S/N)");
            opcion = leer.next();
            while (!opcion.equalsIgnoreCase("s") && !opcion.equalsIgnoreCase("n")) {
                System.out.println("Ha ingresado una opcion invalida. Intente de nuevo.");
                System.out.println("¿Desea añadir otra película?(S/N)");
                opcion = leer.next();
            }
        } while (opcion.equalsIgnoreCase("S"));
    }

    public void mostrarPeliculas() {

        System.out.println("Las películas cargadas en la lista son:");
        for (Pelicula aux : peliculas) {
            System.out.println("\"" + aux.getTitulo() + "\"");
        }

        System.out.println("Las películas con una duracion mayor a una hora son: ");

        for (Pelicula aux : peliculas) {
            if (aux.getDuracion() > 1) {
                System.out.println("\"" + aux.getTitulo() + "\"");
            }
        }

        System.out.println("Películas ordenadas por orden ascendente de duración: ");
        Collections.sort(peliculas, Comparadores.ordenarPorDuracionAsc);
        for (Pelicula aux : peliculas) {
            System.out.println("\"" + aux.getTitulo() + "\"" + "(Duración: " + aux.getDuracion() + " )");
        }

        System.out.println("Películas ordenadas por orden descendente de duración: ");
        Collections.sort(peliculas, Comparadores.ordenarPorDuracionDesc);
        for (Pelicula aux : peliculas) {
            System.out.println("\"" + aux.getTitulo() + "\"" + "(Duración: " + aux.getDuracion() + " )");
        }

        System.out.println("Películas ordenadas alfabéticamente por título: ");
        Collections.sort(peliculas, Comparadores.ordenarPorTituloAlf);
        for (Pelicula aux : peliculas) {
            System.out.println("\"" + aux.getTitulo() + "\"");
        }

        System.out.println("Películas ordenadas alfabéticamente por director:");
        Collections.sort(peliculas, Comparadores.ordenarPorDirectorAlf);
        for (Pelicula aux : peliculas) {
            System.out.println("\"" + aux.getTitulo() + "\"" + "(Director: " + aux.getDirector() + " )");
        }

    }
}
