package Main;

import Main.Entidades.Ahorcado;
import Main.Service.AhorcadoService;

public class Main {
    public static void main(String[] args) {
        Ahorcado juego1 = new Ahorcado();
        AhorcadoService js = new AhorcadoService();

        js.juego(juego1);
        System.out.println(juego1.toString());

    }
}