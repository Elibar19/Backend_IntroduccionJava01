package Main;

import Entidades.Persona;
import Servicio.PersonaServicio;

public class Main {
    public static void main(String[] args) throws Exception {
        PersonaServicio personaServicio = new PersonaServicio();
        Persona[] personas = new Persona[2];
        int[] datosIMC = new int[2];

        personas[0] = personaServicio.crearPersona();
        personas[1] = null;

        for (int i = 0; i < 2; i++) {
            try {
                if (personaServicio.esMayorDeEdad(personas[i])) {
                    System.out.print(personas[i].getNombre() + " es mayor de edad");
                }
                if (!personaServicio.esMayorDeEdad(personas[i])) {
                    System.out.print(personas[i].getNombre() + " es menor de edad");
                }
                System.out.println(personaServicio.pesoIdeal(personaServicio.calcularIMC(personas[i])));

                for (i = 0; i < 2; i++) {
                    datosIMC[i] = personaServicio.calcularIMC(personas[i]);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());

            }

            int[] resultadoImc = personaServicio.calcularIMCPersonas(datosIMC);
            personaServicio.calcularPorcentajeIMC(resultadoImc);
            personaServicio.calcularPorcentajeMayoresDeEdad(personas);
        }
    }
}
