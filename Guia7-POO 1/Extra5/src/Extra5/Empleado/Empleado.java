package Extra5.Empleado;

import java.util.Scanner;

public class Empleado {
    Scanner leer = new Scanner(System.in);
    private String nombre;
    private int edad;
    private double sueldo;

    public Empleado() {
    }

    public void cargarEmpleado() {
        System.out.println("Ingrese el nombre del empleado: ");
        nombre = leer.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = leer.nextInt();
        System.out.println("Ingrese su sueldo: ");
        sueldo = leer.nextDouble();
    }

    public double calcular_aumento() {
        if (edad > 30) {
            sueldo = sueldo * 1.10;
        } else if (edad < 30) {
            sueldo = sueldo * 1.05;
        }
        return sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
