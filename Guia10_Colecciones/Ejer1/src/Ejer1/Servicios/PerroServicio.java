package Ejer1.Servicios;

import Ejer1.Entidades.Perro;

import java.util.ArrayList;
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
}
