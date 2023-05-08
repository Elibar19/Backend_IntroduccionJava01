package Main;

import Main.Entidades.Estudiante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Estudiante[] estudiantes = new Estudiante[2];

        double promedioNotas = 0;

        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("Escriba el nombre del alumno");
            String nombre = leer.next();
            System.out.println("Escriba la nota del alumno");
            double nota = leer.nextDouble();

            estudiantes[i] = new Estudiante(nombre, nota);

        }

        for (int i = 0; i < estudiantes.length; i++) {
            promedioNotas += estudiantes[i].getNota();

        }
        promedioNotas = promedioNotas/ estudiantes.length;
        System.out.println("El promedio de notas del curso es: "+(promedioNotas));

        int n = 0;

        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getNota() > promedioNotas) {
                n++;
            }
        }

        String[] nombreEstudiantesMayor = new String[n];
        n = 0;
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getNota() > promedioNotas) {
               nombreEstudiantesMayor[n] = estudiantes[i].getNombre();
               n++;
            }
        }

        for (int i = 0; i < nombreEstudiantesMayor.length; i++) {
            System.out.println("El/La empleado/a "+nombreEstudiantesMayor[i]+" tiene una nota mayor al promedio");
        }

        for (int i = 0; i < nombreEstudiantesMayor.length ; i++) {
            System.out.println(nombreEstudiantesMayor);
        }

        int cuantasveces=0;
        for (int i = 2; i < 128 ; i*=2) {
            System.out.println("i"+i);
            cuantasveces++;
        }
        System.out.println(cuantasveces);
    }
}