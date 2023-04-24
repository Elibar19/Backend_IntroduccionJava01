package Main.Servicio;

import Main.Entidad.MesSecreto;

import java.util.Scanner;

public class MesSecretoServicio {

    public String sortearMes(MesSecreto juego) {
        juego.setMesSecreto(juego.getMeses()[(int) (Math.random() * 12)]);
        //System.out.println(juego.getMesSecreto());

        return juego.getMesSecreto();
    }

    public void adivinarMes(MesSecreto juego) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String mesSecreto = sortearMes(juego);

        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:");
        String mes = leer.next();

        while (!mes.equals(mesSecreto)) {
            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
            mes = leer.next();
        }
        System.out.println("Ha acertado!");
    }
}
