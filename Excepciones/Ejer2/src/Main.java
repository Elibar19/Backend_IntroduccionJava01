public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        try {
            for (int i = 0; i < 4; i++) {
                numeros[i] = i;
            }
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Fuera de rango");
        }
    }
}