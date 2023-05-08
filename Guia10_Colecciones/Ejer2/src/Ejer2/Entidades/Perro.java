package Ejer2.Entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Perro {
    private String raza;

    public Perro(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                '}';
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Perro() {
    }
}
