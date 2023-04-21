package Main;

import Main.Entidades.Cadena;
import Main.Servicio.CadenaServicio;

public class Main {
    public static void main(String[] args) {
        Cadena frase = new Cadena("Hola mundo");
        CadenaServicio fs = new CadenaServicio();
        System.out.println(fs.mostrarVocales(frase));
        System.out.println(fs.invertirFrase(frase));
        fs.vecesRepetido(frase);
        fs.compararLongitud(frase);
        fs.unirFrases(frase);
        fs.reemplazar(frase);
        fs.contiene(frase);
    }
}