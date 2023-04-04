package Extra4.Cuenta;

public class Cuenta {
   private  String titular;
   private double saldo;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void retirarSaldo(int valor){
        if(saldo-valor>0) {
            saldo = saldo-valor;
            setSaldo(saldo);
        }
        else {
            System.out.println("SALDO INSUFICIENTE");
        }
    }
}
