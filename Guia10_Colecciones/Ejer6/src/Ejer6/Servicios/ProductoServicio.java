package Ejer6.Servicios;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ProductoServicio {
    private Scanner leer;
    private HashMap<String, Integer> productos;

    public ProductoServicio() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.productos = new HashMap<>();
    }

    public void menu() {
        do {
            System.out.println("Elige una opcion (Seleccionar número)" + "\n" +
                    "1.Cargar producto" + "\n" +
                    "2.Modificar precio" + "\n" +
                    "3.Eliminar producto" + "\n" +
                    "4.Mostrar lista de productos" + "\n" +
                    "5.Salir");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    introducirProducto();
                    break;
                case 2:
                    modificarPrecio();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    mostrarProductos();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("La opcion ingresada no existe");
            }
        } while (true);
    }

    public void introducirProducto() {
        String opcion;
        do {
            System.out.println("Ingrese el nombre del producto");
            String nombre = leer.next();
            System.out.println("Ingrese el precio del producto");
            int precio = leer.nextInt();
            productos.put(nombre, precio);
            System.out.println("¿Desea añadir otro producto? (S/N)");
            opcion = leer.next();
            while (!opcion.equalsIgnoreCase("s") && !opcion.equalsIgnoreCase("n")) {
                System.out.println("Ha ingresado una opcion invalida. Intente de nuevo.");
                System.out.println("¿Desea añadir otro producto?(S/N)");
                opcion = leer.next();
            }
        } while (opcion.equalsIgnoreCase("S"));
    }

    public void modificarPrecio() {
        boolean encontrado = false;

        System.out.println("Ingrese el nombre del producto que desea modificar");
        String producto = leer.next();
        System.out.println("Ingrese el nuevo precio");
        int precioNuevo = leer.nextInt();

        for (Map.Entry<String, Integer> aux : productos.entrySet()) {
            String key = aux.getKey();
            Integer value = aux.getValue();
            if (key.equalsIgnoreCase(producto)) {

                productos.replace(producto, value, precioNuevo);
                encontrado = true;
                System.out.println("Precio modificado con éxito");
                System.out.println("");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El producto no se encuentra en la lista");
        }
    }


    public void eliminarProducto() {
        boolean encontrado = false;
        System.out.println("Escriba el nombre del producto que desea eliminar");
        String nombre = leer.next();

        for (Map.Entry<String, Integer> aux : productos.entrySet()) {
            String key = aux.getKey();

            if (key.equalsIgnoreCase(nombre)) {

                productos.remove(key);
                encontrado = true;
                System.out.println("Producto eliminado");
                System.out.println("");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El producto no se encuentra en la lista");
        }
    }

    public void mostrarProductos() {

        System.out.println("---TIENDA---");
        for (Map.Entry<String, Integer> aux : productos.entrySet()) {
            String key = aux.getKey();
            Integer value = aux.getValue();
            System.out.println("Producto: " + key + "\n" + "Precio: $" + value);
            System.out.println("------------------");
        }
        System.out.println("----FIN----");
        System.out.println("");
    }
}

