package egg.BackendJava01.Guia5_Arreglos;

public class Ejer01 {
    public static void main(String[] args) {

        int[] vector = new int[100];

        for (int f = 0; f < 100; f++) {
            vector[f] += f;
        }

        for (int f = 99; f >= 0; f--) {
            System.out.println("[" + vector[f] + "]");
        }
    }
}
