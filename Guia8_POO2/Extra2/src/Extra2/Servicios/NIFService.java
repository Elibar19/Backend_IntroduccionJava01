package Extra2.Servicios;

import Extra2.Entidades.NIF;

import java.util.Scanner;

public class NIFService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearNIF(NIF nif1) {
        System.out.println("Ingrese su DNI: ");
        nif1.setDNI(leer.nextLong());
    }

    public char calcularLetra(NIF nif1) {
        int resto = (int) (nif1.getDNI() % 23);
        return nif1.getLetra()[resto];
    }

    public void mostrar(NIF nif1) {
        System.out.println(nif1.getDNI() + "-" + calcularLetra(nif1));
    }
}
