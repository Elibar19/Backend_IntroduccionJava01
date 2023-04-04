package Extra4;

import Extra4.Cuenta.Cuenta;

public class Main {
    public static void main(String[] args) {
        Cuenta cliente1 = new Cuenta("Elian", 10000);
        System.out.println(cliente1.getSaldo());
        cliente1.retirarSaldo(5000);
        System.out.println(cliente1.getSaldo());
        cliente1.retirarSaldo(6000);
        System.out.println(cliente1.getSaldo());
    }
}