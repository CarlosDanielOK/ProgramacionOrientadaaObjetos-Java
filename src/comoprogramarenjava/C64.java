package comoprogramarenjava;

public class C64 {
    public static void main(String[] args) {
        final int LONGITUD = 10; // constante
        int c[] = new int[LONGITUD];
        int[] a = { 1, 2, 3, 4 };

        for (int i = 0; i < c.length; i++) {
            System.out.println("Indice " + i + " | Valor " + c[i]);
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("Indice " + i + " | Valor " + a[i]);
        }
    }
}
