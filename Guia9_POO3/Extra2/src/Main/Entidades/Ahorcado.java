package Main.Entidades;

import java.util.Arrays;

public class Ahorcado {
    private String[] palabra;
    private int cantidadLetras;
    private int cantidadJugadas;

    public Ahorcado(String[] palabra, int cantidadLetras, int cantidadJugadas) {
        this.palabra = palabra;
        this.cantidadLetras = cantidadLetras;
        this.cantidadJugadas = cantidadJugadas;
    }

    public Ahorcado() {
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getCantidadLetras() {
        return cantidadLetras;
    }

    public void setCantidadLetras(int cantidadLetras) {
        this.cantidadLetras = cantidadLetras;
    }

    public int getCantidadJugadas() {
        return cantidadJugadas;
    }

    public void setCantidadJugadas(int cantidadJugadas) {
        this.cantidadJugadas = cantidadJugadas;
    }

    @Override
    public String toString() {
        return "Ahorcado{" +
                "palabra=" + Arrays.toString(palabra) +
                '}';
    }
}
