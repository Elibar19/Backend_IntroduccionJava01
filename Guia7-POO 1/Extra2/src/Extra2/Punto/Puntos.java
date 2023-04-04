package Extra2.Punto;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Puntos {
    Scanner leer = new Scanner(System.in);
    private double x1, x2, y1, y2;

    public Puntos() {
    }
    public void crearPuntos() {
        System.out.println("Ingrese las coordenadas X e Y del primer punto: ");
        x1 = leer.nextDouble();
        setX1(x1);
        y1 = leer.nextDouble();
        setY1(y1);
        System.out.println("Ingrese las coordenadas X e Y del segundo punto: ");
        x2 = leer.nextDouble();
        setX2(x2);
        y2 = leer.nextDouble();
        setY2(y2);
    }
    public double calcularDistancia() {
        return sqrt(pow((x2 - x1), 2) + pow((y2 - y1), 2));
    }
    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
}
