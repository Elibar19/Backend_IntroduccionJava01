package Extra1;

import Extra1.Cancion.Cancion;

public class Main {
    public static void main(String[] args) {
       Cancion cancion1 = new Cancion("Fantasma", "Arbol");
        System.out.println(cancion1.getAutor() +"\n"+ cancion1.getTitulo());
    }
}