package Entidades;

public class DivisionNumero {
    public static int dividirNumeros(int numero1, int numero2) throws ArithmeticException {
        if(numero2 == 0) {
            throw new ArithmeticException();
        }
        return numero1/numero2;
    }
}