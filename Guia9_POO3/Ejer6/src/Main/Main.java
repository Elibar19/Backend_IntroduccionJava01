package Main;

import Main.Entidades.Curso;
import Main.Servicio.CursoService;

public class Main {
    public static void main(String[] args) {

        CursoService cursoS = new CursoService();
        Curso curso1 = cursoS.crearCurso();

        cursoS.calcularGananciaSemanal(curso1);
        cursoS.mostrarAlumnos(curso1);

    }
}