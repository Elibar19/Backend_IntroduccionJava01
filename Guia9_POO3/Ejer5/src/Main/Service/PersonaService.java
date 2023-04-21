package Main.Service;

import Main.Entidades.Persona;

import java.util.Date;
import java.util.Scanner;

public class PersonaService {
    public Persona crearPersona() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Escriba su nombre");
        String nombre = leer.next();
        System.out.println("Por favor, ingrese el día de su nacimiento:");
        int dia = leer.nextInt();
        System.out.println("Por favor, ingrese el mes de su nacimiento (1-12):");
        int mes = leer.nextInt() - 1;
        System.out.println("Por favor, ingrese el año de su nacimiento:");
        int anio = leer.nextInt() - 1900;
        Date fechaNac = new Date(anio, mes, dia);
        return new Persona(nombre, fechaNac);
    }

    public int calculcarEdad(Persona persona) {

        Date fechaActual = new Date();
        return difAños(persona.getFechaNacimiento(), fechaActual);
    }

    public int difAños(Date fechaNac, Date fechaAct) {

        long milisegundosPorAnio = 1000L * 60 * 60 * 24 * 365;
        long diferenciaMilisegundos = fechaAct.getTime() - fechaNac.getTime();
        int edad = (int) (diferenciaMilisegundos / milisegundosPorAnio);

        return edad;
    }

    public boolean menorQue(Persona persona, int edad) {
        int edadPersona = calculcarEdad(persona);
        return edadPersona < edad;
    }

    public void mostrarPersona(Persona persona) {
        System.out.println("Nombre: " + persona.getName());
        System.out.println("Fecha de nacimiento: " + persona.getFechaNacimiento());
    }


}

