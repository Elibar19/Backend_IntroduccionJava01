package Main.Entidades;

public class Cadena {
    private String frase;
    private int longitud;

    public Cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public Cadena() {
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
}
