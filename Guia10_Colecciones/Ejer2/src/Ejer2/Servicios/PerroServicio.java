package Ejer2.Servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class PerroServicio {
    private Scanner leer;
    private ArrayList<String> perros;

    public PerroServicio() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.perros = new ArrayList<>();
    }

    public void crearPerro() {
        String añadir;
        do {
            System.out.println("Ingrese la raza");
            String raza = leer.next();
            perros.add(raza);
            System.out.println("¿Desea añadir otra raza?(S/N)");
            añadir = leer.next();
            while (!añadir.equalsIgnoreCase("s") && !añadir.equalsIgnoreCase("n")) {
                System.out.println("Ha ingresado una opcion invalida. Intente de nuevo.");
                System.out.println("¿Desea añadir otra raza?(S/N)");
                añadir = leer.next();
            }
        } while (añadir.equalsIgnoreCase("S"));
        mostrarRazas();
    }

    public void mostrarRazas() {
        System.out.println("Las razas cargadas en la lista son:");
        for (String aux : perros) {
            System.out.println(aux);
        }
    }

    public void recorrerRazas() {

        System.out.println("Ingrese el perro que desea buscar y eliminar de la lista");
        String raza = leer.next();
        boolean encontrado = false;
        Iterator<String> it = perros.iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(raza)) {
                it.remove();
                System.out.println("Se ha eliminado la raza con éxito");
                Collections.sort(perros);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se ha encontrado la raza en la lista");
        }
        mostrarRazas();
    }
}
