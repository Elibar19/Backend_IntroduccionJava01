package Ejer3.Servicios;

import Ejer3.Entidades.Alumno;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AlumnoServicio {
    private Scanner leer;
    private ArrayList<Alumno> alumnos;

    public AlumnoServicio() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.alumnos = new ArrayList<>();
    }

    public void crearAlumno() {
        String opcion;
        do {
            System.out.println("Ingrese el nombre del alumno");
            String nombre = leer.next();

            ArrayList<Integer> notas = new ArrayList<>();
            for (int i = 1; i <= 3; i++) {
                System.out.println("Ingrese la nota nro " + i);
                int nota = leer.nextInt();
                notas.add(nota);
            }

            Alumno alumno = new Alumno(nombre, notas);
            alumnos.add(alumno);
            
            System.out.println("¿Desea crear otro alumno?(S/N)");
            opcion = leer.next();
            while (!opcion.equalsIgnoreCase("s") && !opcion.equalsIgnoreCase("n")) {
                System.out.println("Ha ingresado una opcion invalida. Intente de nuevo.");
                System.out.println("¿Desea crear otro alumno?(S/N)");
                opcion = leer.next();
            }
        } while (opcion.equalsIgnoreCase("S"));
    }

    public void buscarAlumno() {

        System.out.println("Ingrese el alumno que desea buscar para calcular su nota final");
        String nombre = leer.next();
        boolean encontrado = false;
        Iterator<Alumno> it = alumnos.iterator();
        while (it.hasNext()) {
            Alumno alumno = it.next();
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                notaFinal(nombre);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró un alumno con ese nombre.");
        }
    }

    public void notaFinal(String nombre) {
        Iterator<Alumno> it = alumnos.iterator();
        Alumno alumno = it.next();
        double promedio = 0;
        ArrayList<Integer> notas = alumno.getNotas();

        for (int i = 0; i < notas.size(); i++) {
            promedio = promedio + notas.get(i);
        }

        promedio = promedio / notas.size();
        System.out.println("La nota final de " + nombre + " es: " + promedio);
    }
}
