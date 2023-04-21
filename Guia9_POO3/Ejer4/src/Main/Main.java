package Main;



import Main.Service.FechaService;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        FechaService fs = new FechaService();
        Date fechaNac = fs.fechaNacimiento();
        System.out.println(fechaNac.toString());
        Date fechaActual = fs.fechaActual();
        System.out.println(fechaActual.toString());
        int edad = fs.difAños(fechaNac, fechaActual);
        System.out.println(edad);

    }
}