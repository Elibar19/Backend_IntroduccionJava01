package Main.Service;

import java.util.Date;

import java.util.Scanner;

public class FechaService {
    public Date fechaNacimiento() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese el día de su nacimiento:");
        int dia = scanner.nextInt();
        System.out.println("Por favor, ingrese el mes de su nacimiento (1-12):");
        int mes = scanner.nextInt() - 1;
        System.out.println("Por favor, ingrese el año de su nacimiento:");
        int anio = scanner.nextInt() - 1900;

        return new Date(anio, mes, dia);
    }

    public Date fechaActual() {
        return new Date();
    }

    public int difAños(Date fechaNac, Date fechaAct) {
        /*int edad = 0;
        if (fechaAct.getMonth() > fechaNac.getMonth()) {
            edad = fechaAct.getYear()-fechaNac.getYear();
        }
        if (fechaAct.getMonth() < fechaNac.getMonth()) {
            edad = (fechaAct.getYear()-fechaNac.getYear())-1;
        }
        if (fechaAct.getMonth() == fechaNac.getMonth()){
            if (fechaAct.getDay() == fechaNac.getDay()){
                edad = fechaAct.getYear()-fechaNac.getYear();
            }
            else if (fechaAct.getDay() <= fechaNac.getDay()) {
                edad = (fechaAct.getYear()-fechaNac.getYear())-1;
            }
            else {
                edad = fechaAct.getYear()-fechaNac.getYear();
            }
        }
        return edad;
    }*/
        long milisegundosPorAnio = 1000L * 60 * 60 * 24 * 365;
        long diferenciaMilisegundos = fechaAct.getTime() - fechaNac.getTime();
        int edad = (int) (diferenciaMilisegundos / milisegundosPorAnio);

        return edad;
    }
}
