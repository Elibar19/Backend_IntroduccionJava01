package Ejercicio1.Libro;

import java.util.Scanner;

public class Libro {
    Scanner leer = new Scanner(System.in);
    //-------ATRIBUTOS---------//
    public String ISBN;
    public String titulo;
    public String autor;
    public int numeroPaginas;
    //-------ATRIBUTOS---------//

    //-------METODOS---------//
    public Libro() {
    }

    public Libro(String ISBN, String titulo, String autor, int numeroPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public void crearLibro() {

        System.out.println("Ingresa el ISBN");
        ISBN = leer.nextLine();
        System.out.println("Ingresa el título");
        titulo = leer.nextLine();
        System.out.println("Ingresa el autor");
        autor = leer.nextLine();
        System.out.println("Ingresa la cantidad de páginas");
        numeroPaginas = leer.nextInt();
        ;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }


}

