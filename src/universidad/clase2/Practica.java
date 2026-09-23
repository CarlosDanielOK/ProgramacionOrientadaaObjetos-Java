package universidad.clase2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practica {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(Arrays.asList(3, 12, 7, 20, 5));

        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) > 6) {
                System.out.println(numeros.get(i));
            }
        }

        for (int numero : numeros) {
            if (numero > 6) {
                System.out.println(numero);
            }
        }

        for (Integer numero : numeros) {
            if (numero > 6) {
                System.out.println(numero);
            }
        }
    }
}