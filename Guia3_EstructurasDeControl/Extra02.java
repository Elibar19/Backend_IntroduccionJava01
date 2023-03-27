package egg.BackendJava01.Guia3_EstructurasDeControl;

public class Extra02 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int aux;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
