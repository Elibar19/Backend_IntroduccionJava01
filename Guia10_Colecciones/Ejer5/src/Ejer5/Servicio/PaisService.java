package Ejer5.Servicio;

import java.util.*;

public class PaisService {
    private Scanner leer;
    private HashSet<String> paises;

    public PaisService() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.paises = new HashSet<>();
    }

    public void cargarPaises() {
        String opcion;
        do {
            System.out.println("Ingrese el nombre de un país");
            paises.add(leer.next());
            System.out.println("¿Desea añadir otro pais? (S/N)");
            opcion = leer.next();

            while (!opcion.equalsIgnoreCase("s") && !opcion.equalsIgnoreCase("n")) {
                System.out.println("Ha ingresado una opcion incorrecta. Escriba S o N");
                System.out.println("¿Desea añadir otro pais? (S/N)");
                opcion = leer.next();
            }
        } while (opcion.equalsIgnoreCase("S"));

        System.out.println("Los paises cargados en la lista son: ");
        for (String aux : paises) {
            System.out.println(aux);
        }
    }

    public void mostrarOrdenado() {
        ArrayList<String> paisesOrdenados = new ArrayList<>(paises);
        Collections.sort(paisesOrdenados);

        System.out.println("Los paises cargados en la lista son: ");
        for (String aux : paisesOrdenados) {
            System.out.println(aux);
        }
    }

    public void eliminarPais() {
        Iterator it = paises.iterator();
        boolean encontrado = false;

        System.out.println("Escriba el pais que desea eliminar");
        String pais = leer.next();

        while (it.hasNext()) {
            if (it.next().equals(pais)) {
                it.remove();
                System.out.println("El pais se ha eliminado correctamente");
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Los paises que quedan en la lista son: ");
            for (String aux : paises) {
                System.out.println(aux);
            }
        }
        if (!encontrado) {
            System.out.println("El pais ingresado no se encuentra en la lista de paises");
        }
    }
}
