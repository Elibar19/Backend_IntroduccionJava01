package Main;

import Main.Entidad.MesSecreto;
import Main.Servicio.MesSecretoServicio;

public class Main {
    public static void main(String[] args) {
        MesSecreto juego1 = new MesSecreto();
        MesSecretoServicio js = new MesSecretoServicio();
        js.adivinarMes(juego1);
    }
}