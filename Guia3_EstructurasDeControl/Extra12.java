package egg.BackendJava01.Guia3_EstructurasDeControl;

public class Extra12 {
    public static void main(String[] args) {
        /**for (int i = 0; i < 1000; i++) {
         // Convertir cada número en una cadena de 3 dígitos
         String s = String.format("%03d", i);
         // Reemplazar el "3" por una "E"
         s = s.replace("3", "E");
         // Imprimir la cadena con un guión entre cada dígito
         System.out.println(String.join("-", s.split("")));
         }**/

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    String digito1 = (i == 3) ? "E" : Integer.toString(i);
                    String digito2 = (j == 3) ? "E" : Integer.toString(j);
                    String digito3 = (k == 3) ? "E" : Integer.toString(k);
                    System.out.println(digito1 + "-" + digito2 + "-" + digito3);
                }
            }
        }
    }
}

