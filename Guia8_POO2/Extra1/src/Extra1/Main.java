package Extra1;

import Extra1.Entidades.Raices;
import Extra1.Servicios.RaicesServicios;

public class Main {
    public static void main(String[] args) {

        RaicesServicios operacionServicio = new RaicesServicios();
        Raices operacion = new Raices(1, 3, -5);
        operacionServicio.calcular(operacion);

    }

}