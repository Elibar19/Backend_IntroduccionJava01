package Ejer3;

import Ejer3.Entidades.Persona;
import Ejer3.Servicio.PersonaServicio;

public class Main {
    public static void main(String[] args) {
        PersonaServicio personaServicio = new PersonaServicio();
        Persona[] personas = new Persona[4];
        int[] datosIMC = new int[4];

        for (int i = 0; i < 4; i++) {

            personas[i] = personaServicio.crearPersona();

        }

        for (int i = 0; i < 4; i++) {

            if (personaServicio.esMayorDeEdad(personas[i])) {
                System.out.print(personas[i].getNombre() + " es mayor de edad");
            }
            if (!personaServicio.esMayorDeEdad(personas[i])) {
                System.out.print(personas[i].getNombre() + " es menor de edad");
            }
            System.out.println(personaServicio.pesoIdeal(personaServicio.calcularIMC(personas[i])));

        }

        for (int i = 0; i < 4; i++) {
            datosIMC[i] = personaServicio.calcularIMC(personas[i]);
        }

        int[] resultadoImc = personaServicio.calcularIMCPersonas(datosIMC);
        personaServicio.calcularPorcentajeIMC(resultadoImc);
        personaServicio.calcularPorcentajeMayoresDeEdad(personas);
    }
}