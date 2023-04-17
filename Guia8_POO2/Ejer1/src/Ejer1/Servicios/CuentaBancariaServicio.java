package Ejer1.Servicios;

import Ejer1.Entidades.CuentaBancaria;

import java.util.Scanner;

public class CuentaBancariaServicio {
    Scanner leer = new Scanner(System.in);

    public void menu() {
        int opcion;
        CuentaBancaria cuenta = null;
        boolean cuentaCreada = false; // Variable para indicar si se ha creado una cuenta previamente
        do {
            System.out.println("\n" + "INGRESE UNA OPCION PARA CONTINUAR:\n" +
                    "1.CREAR CUENTA\n" +
                    "2.INGRESAR DINERO\n" +
                    "3.RETIRAR DINERO\n" +
                    "4.EXTRACCION RAPIDA\n" +
                    "5.CONSULTAR SALDO\n" +
                    "6.CONSULTAR DATOS DE CUENTA\n" +
                    "7.SALIR\n\n");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    cuenta = crearCuenta();
                    cuentaCreada = true; // Actualizar la variable indicando que se ha creado una cuenta
                    break;
                case 2:
                    if (!cuentaCreada) { // Verificar si se ha creado una cuenta previamente
                        System.out.println("Usted debe crear una cuenta primero");
                        break;
                    }
                    System.out.println("Ingrese la cantidad de dinero a ingresar");
                    int saldo = leer.nextInt();
                    ingresar(cuenta, saldo);
                    break;
                case 3:
                    if (!cuentaCreada) {
                        System.out.println("Usted debe crear una cuenta primero");
                        break;
                    }
                    System.out.println("Ingrese la cantidad de dinero que desea retirar");
                    int retiro = leer.nextInt();
                    retirar(cuenta, retiro);
                    break;
                case 4:
                    if (!cuentaCreada) {
                        System.out.println("Usted debe crear una cuenta primero");
                        break;
                    }
                    System.out.println("Usted puede retirar máximo $" + cuenta.getSaldoActual() * 0.2 + "\n ¿Cuanto desea retirar?");
                    double retiroRapido = leer.nextDouble();
                    extraccionRapida(cuenta, retiroRapido);
                    break;
                case 5:
                    if (!cuentaCreada) {
                        System.out.println("Usted debe crear una cuenta primero");
                        break;
                    }
                    System.out.println(consultarSaldo(cuenta));
                    break;
                case 6:
                    if (!cuentaCreada) {
                        System.out.println("Usted debe crear una cuenta primero");
                        break;
                    }
                    consultarDatos(cuenta);
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (opcion != 7);
    }

    public CuentaBancaria crearCuenta() {

        CuentaBancaria cuenta1 = new CuentaBancaria();
        System.out.println("Ingrese su DNI");
        cuenta1.setDniCliente(leer.nextInt());
        System.out.println("Ingrese numero de cuenta");
        cuenta1.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese su saldo actual: ");
        cuenta1.setSaldoActual(leer.nextInt());

        return cuenta1;

    }

    public void ingresar(CuentaBancaria cuenta, int saldo) {
        cuenta.setSaldoActual(cuenta.getSaldoActual() + saldo);
    }

    public void retirar(CuentaBancaria cuenta, double retiro) {
        if (retiro < cuenta.saldoActual) {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
            System.out.println("Usted ha retirado $" + retiro + "\n\n");
        } else if (retiro > cuenta.saldoActual) {
            retiro = cuenta.saldoActual;
            cuenta.setSaldoActual(0);
            System.out.println("Usted no tiene saldo suficiente para realizar ese retiro. " +
                    "Extraerá de su cuenta el máximo permitido que es $" + retiro + "\n\n");
        }

    }

    public void extraccionRapida(CuentaBancaria cuenta, double retiroRapido) {
        if (retiroRapido < cuenta.saldoActual * 0.2) {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retiroRapido);
            System.out.println("Usted ha retirado $" + retiroRapido);
        }
        if (retiroRapido > cuenta.saldoActual * 0.2) {
            System.out.println("Usted puede retirar " + cuenta.saldoActual * 0.2 + " como máximo.\n\n");

        }
        if (cuenta.getSaldoActual() == 0) {
            System.out.println("Usted no posee saldo en la cuenta.\n\n");
        }

    }

    public double consultarSaldo(CuentaBancaria cuenta) {
        return cuenta.getSaldoActual();
    }

    public void consultarDatos(CuentaBancaria cuenta) {
        System.out.println("Nro. de cuenta :" + cuenta.getNumeroCuenta()
                + "\nDNI del cliente: " + cuenta.getDniCliente()
                + "\nSaldo: " + cuenta.getSaldoActual() + "\n\n");
    }
}
