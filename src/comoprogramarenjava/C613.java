package comoprogramarenjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C613 {
    public static void main(String[] args) {
        int[] a = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int[] b = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int[] c = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        for (int i : a) {
            System.out.print(i + " ");
        }
        Arrays.sort(a);
        for (int i : a) {
            System.out.print(i + " ");
        }

        if (Arrays.equals(b, c)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }

        int ubicacion = Arrays.binarySearch(a, 8);
        if (ubicacion >= 0) {
            System.out.println("El numero " + 8 + " esta en la posicion " + ubicacion);
        } else {
            System.out.println("El numero no existe en el array");
        }

        List<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        System.out.println(lista.size());
        System.out.println(lista.contains(20));
        for (int numero : lista) {
            System.out.print(numero + " ");
        }
    }
}
