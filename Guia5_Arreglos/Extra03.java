package egg.BackendJava01.Guia5_Arreglos;

public class Extra03 {

    public static void main(String[] args) {

        int[] vector = new int[5];
        cargar(vector);
        imprimir(vector);
    }

    public static void cargar(int[] vector) {

        for (int i = 0; i < 5; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
    }

    public static void imprimir(int[] vector) {
        for (int elemento : vector) {
            System.out.print(" [" + elemento + "] ");
        }
    }
}
