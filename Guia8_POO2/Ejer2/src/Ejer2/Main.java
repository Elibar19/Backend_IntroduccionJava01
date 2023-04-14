package Ejer2;

import Ejer2.Entidades.Cafetera;
import Ejer2.Servicios.CafeteraServicios;

public class Main {
    public static void main(String[] args) {

        Cafetera cafetera1 = new Cafetera();
        CafeteraServicios cs = new CafeteraServicios();
        cs.menu(cafetera1);
    }

}