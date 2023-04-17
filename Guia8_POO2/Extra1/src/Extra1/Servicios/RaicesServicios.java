package Extra1.Servicios;

import Extra1.Entidades.Raices;

import static java.lang.Math.sqrt;

public class RaicesServicios {

    public double getDiscrimate(Raices operacion) {
        return Math.pow(operacion.getB(), 2) - 4 * operacion.getA() * operacion.getC();

    }

    public boolean tieneRaices(Raices operacion) {
        return getDiscrimate(operacion) >= 0;

    }

    public boolean tieneRaiz(Raices operacion) {
        return getDiscrimate(operacion) == 0;

    }

    public void obtenerRaices(Raices operacion) {
        if (tieneRaices(operacion)) {
            double raiz1 = (-operacion.getB() - sqrt((Math.pow(operacion.getB(), 2)) - (4 * operacion.getA() * operacion.getC()))) / (2 * operacion.getA());
            double raiz2 = (-operacion.getB() + sqrt((Math.pow(operacion.getB(), 2)) - (4 * operacion.getA() * operacion.getC()))) / (2 * operacion.getA());
            System.out.println("Las dos raices son: " + raiz1 + " y " + raiz2);
        }

    }

    public void obtenerRaiz(Raices operacion) {
        if (tieneRaiz(operacion)) {
            double raizUnica = (-operacion.getB() / (2 * operacion.getA()));
            System.out.println("La raiz es: " + raizUnica);
        }
    }

    public void calcular(Raices raices) {
        if (tieneRaices(raices)) {
            obtenerRaices(raices);
        } else if (tieneRaiz(raices)) {
            obtenerRaiz(raices);
        } else {
            System.out.println("No hay solución real para esta ecuación.");
        }
    }
}
