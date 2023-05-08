package Ejer3;

import Ejer3.Servicios.AlumnoServicio;

public class Main {
    public static void main(String[] args) {
        AlumnoServicio alumnos = new AlumnoServicio();
        alumnos.crearAlumno();
        alumnos.buscarAlumno();
    }
}