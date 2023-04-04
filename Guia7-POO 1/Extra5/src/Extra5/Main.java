package Extra5;

import Extra5.Empleado.Empleado;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        empleado1.cargarEmpleado();
        System.out.println(empleado1.calcular_aumento());
    }
}