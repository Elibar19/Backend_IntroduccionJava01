package Main.Servicio;

import Main.Entidades.Curso;

import java.util.Arrays;
import java.util.Scanner;

public class CursoService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public String[] cargarAlumnos(int longitudCurso) {
        System.out.println("A continuacion deberá ingresar los nombres de los alumnos");
        String[] nombreAlumnos = new String[longitudCurso];
        for (int i = 0; i < nombreAlumnos.length; i++) {
            System.out.println("Escriba el nombre del alumno nro. " + (i + 1));
            nombreAlumnos[i] = leer.next();

        }
        return nombreAlumnos;
    }

    public Curso crearCurso() {

        Curso curso = new Curso();
        System.out.println("Ingresa el nombre del curso");
        curso.setNombreCurso(leer.next());
        System.out.println("Ingres la cantidad de horas por día de cursado");
        curso.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Ingresa la cantidad de días que se va a dictar el cursado");
        curso.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("Ingrese si es turno mañana o tarde");
        curso.setTurno(leer.next());
        System.out.println("Ingresa el valor de la hora del cursado");
        curso.setPrecioPorHora(leer.nextInt());

        curso.setAlumnos(cargarAlumnos(curso.getAlumnos().length));

        return curso;

    }

    public void mostrarAlumnos(Curso curso) {
        System.out.println(Arrays.toString(curso.getAlumnos()));
    }

    public void calcularGananciaSemanal(Curso curso) {
        System.out.println("La ganancia semanal es de " + (curso.getCantidadDiasPorSemana() * curso.getCantidadHorasPorDia() * curso.getPrecioPorHora() * curso.getAlumnos().length));
    }
}
