package Extra3.Juego;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Juego {
    Scanner leer = new Scanner(System.in);
    private int num1, num2;

    public int getGanadasJugador1() {
        return ganadasJugador1;
    }

    public void setGanadasJugador1() {
        this.ganadasJugador1 = ganadasJugador1 + 1;
    }

    public int getGanadasJugador2() {
        return ganadasJugador2;
    }

    public void setGanadasJugador2() {
        this.ganadasJugador2 = ganadasJugador2 + 1;
    }

    private int ganadasJugador1;
    private int ganadasJugador2;

    public Juego(){

    }

    public void iniciarJuego() {


        System.out.println("JUGADOR 1 ELIGE UN NUMERO: ");
        num1 = leer.nextInt();
        setNum1(num1);

        System.out.println("ADIVINA EL NUMERO, TIENE SOLO 3 INTENTOS");

        int i = 1;
        int intentos = 0;
        while (i <=4) {

            System.out.println("INTENTO NUMERO " + i + ". Ingrese un numero");
            num2 = leer.nextInt();
            if (num2 == num1) {
                System.out.println("CORRECTO!! JUGADOR 2 HA GANADO");
                System.out.println("USTED NECESITÓ " + intentos + " INTENTO/S");
                setGanadasJugador2();
                break;
            } else if (num2 < num1) {
                System.out.println("EL NUMERO QUE INTENTAS ADIVINAR ES MAS GRANDE");
                System.out.println("");
            } else if (num2 > num1) {
                System.out.println("EL NUMERO QUE INTENTAS ADIVINAR ES MAS CHICO");
                System.out.println("");
            }
            if(i==3) {
                System.out.println("Usted no tiene mas intentos. Ha perdido :(");
                setGanadasJugador1();
                break;
            }
            i++;
            intentos++;
        }
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void mayorGanador() {
        System.out.println("Jugador 1 ha ganado " + getGanadasJugador1() + " veces.");
        System.out.println("Jugador 2 ha ganado " + getGanadasJugador2() + " veces.");
        if (getGanadasJugador1() > getGanadasJugador2()) {
            System.out.println("Jugador 1 ha ganado más veces!");
        } else if (getGanadasJugador2() > getGanadasJugador1()) {
            System.out.println("Jugador 2 ha ganado más veces!");
        } else {
            System.out.println("Ambos jugadores han ganado la misma cantidad de veces.");
        }
    }
}
