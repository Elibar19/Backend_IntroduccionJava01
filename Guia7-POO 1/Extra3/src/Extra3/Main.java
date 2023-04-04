package Extra3;

import Extra3.Juego.Juego;

public class Main {
    public static void main(String[] args) {
       Juego juego1 = new Juego();
        System.out.println("EN ESTE JUEGO EL JUGADOR NÚMERO 1 DEBERÁ ELEGIR UN NUMERO SECRETO."+"\n"+"LUEGO EL JUGADOR NÚMERO 2 DEBERÁ ADIVINAR CUAL ES EL NUMERO"
                +"\n"+"EL NUMERO DE INTENTOS MAXIMOS ES DE 3 VECES");
       juego1.iniciarJuego();
       juego1.iniciarJuego();
       juego1.iniciarJuego();
       juego1.mayorGanador();
    }
}