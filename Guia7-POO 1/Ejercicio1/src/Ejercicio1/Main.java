package Ejercicio1;

import Ejercicio1.Libro.Libro;

public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro();
        libro1.crearLibro();
        System.out.println("Titulo: " + libro1.getTitulo() + "\n" +
                "Autor: " + libro1.getAutor() + "\n" +
                "ISBN: " + libro1.getISBN() + "\n" +
                "Numero de paginas: " + libro1.getNumeroPaginas());

    }
}