package egg.BackendJava01.Guia5_Arreglos;

public class Ejer04 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        String aux = " ";

        for (int f = 0; f < 4; f++) //Cargo la matriz
        {
            for (int c = 0; c < 4; c++) {
                matriz[f][c] = (int) (Math.random() * 11);
            }
        }

        for (int[] fila : matriz) //Imprimo el vector
        {
            aux = "";
            for (int elemento : fila) {
                aux += " " + elemento;
            }
            System.out.println("[" + aux + "]");
        }

        System.out.println("\n");

        for (int c = 0; c < 4; c++) //recorre columnas
        {
            aux = "";
            for (int f = 0; f < 4; f++) //recorre filas
            {
                aux += " " + matriz[f][c];
            }
            System.out.println("[" + aux + "]");
        }

        /* for (int j = 0; j < 4; j++) //recorre columnas
        {
            int[] filaTraspuesta = new int[matriz.length];
            for (int i = 0; i < 4; i++) //recorre filas
            {
                filaTraspuesta[i] = matriz[i][j];
            }
            aux = "";

            for (int elemento : filaTraspuesta)
            {
                aux += " " + elemento;
            }
            System.out.println("[" + aux + "]");
        } */

    }
}

