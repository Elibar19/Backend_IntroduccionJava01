package Ejer2.Servicios;

import Ejer2.Entidades.Cafetera;

import java.util.Scanner;

public class CafeteraServicios {
Scanner leer = new Scanner(System.in);

    public void menu(Cafetera c1){
        int op;
        do {
        System.out.println("\nQue desea hacer? ELIJA UN NUMERO");
        System.out.println("1. Llenar cafetera");
        System.out.println("2. Servir Taza");
        System.out.println("3. Vaciar Cafetera");
        System.out.println("4. Agregar Cafe");
        System.out.println("5. Cantidad de Cafe Actual");
        System.out.println("0. SALIR");
        op = leer.nextInt();

        switch (op){
            case 1: llenarCafetera(c1); break;
            case 2: System.out.println("Tamaño de la taza:"); servirTaza(c1,leer.nextInt()); break;
            case 3: vaciarCafetera(c1); break;
            case 4: System.out.println("Cuanto quiere agregar?(en ml):"); agregarCafe(c1,leer.nextInt()); break;
            case 5: System.out.println("Cafe actual: " + c1.getCantidadActual() + "ml"); break;
            case 0: System.out.println("Gracias por utilizar esta cafetera"); break;
            default: System.out.println("Opcion no valida");
        }
        }while(op != 0);
    }

    public void llenarCafetera(Cafetera c1) {
        c1.setCantidadActual(c1.getCapacidadMaxima());
    }

    public int servirTaza(Cafetera c1, int tamanho) {
        int servido;
        if (tamanho > c1.getCantidadActual()) {
            servido = c1.getCantidadActual();
            c1.setCantidadActual(0);
            System.out.println("La taza no se llenó, se sirvieron "+servido+" ml");
        } else {
            servido = tamanho;
            c1.setCantidadActual(c1.getCantidadActual()-tamanho);
            System.out.println("La taza se llenó");
        }
        return servido;
    }

    public void vaciarCafetera(Cafetera c1) {
        c1.setCantidadActual(0);
    }

    public void agregarCafe(Cafetera c1, int cafe) {
        if ((c1.getCantidadActual() + cafe <= 1000)) {
            c1.setCantidadActual(c1.getCantidadActual() + cafe);
            System.out.println("Se ha agregado el café correctamente\n" + "La cantidad actual es: " + c1.getCantidadActual());
        }
        else if ((c1.getCantidadActual() + cafe > 1000)) {
            System.out.println("La cantidad de cafe que quiere agregar supera el limite.\nEl máximo permitido es: " + (c1.getCapacidadMaxima() - c1.getCantidadActual()));
        }
    }
}
