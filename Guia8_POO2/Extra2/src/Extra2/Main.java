package Extra2;

import Extra2.Entidades.NIF;
import Extra2.Servicios.NIFService;

public class Main {
    public static void main(String[] args) {
        NIF nif1 = new NIF();
        NIFService ns = new NIFService();
        ns.crearNIF(nif1);
        ns.mostrar(nif1);
    }
}