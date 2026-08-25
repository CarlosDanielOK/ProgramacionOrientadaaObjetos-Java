package comoprogramarenjava;

import java.util.Scanner;

public class C3_ej21 {
    public static void main(String[] args) {
        int i = 0, numero = 0, mayor = -1, ganador = 0;

        Scanner input = new Scanner(System.in);

        while (i < 10) {
            System.out.print("Ingrese cantidad de ventas del empleado " + i + ": ");
            numero = input.nextInt();

            if (i == 0 || numero > mayor) {
                mayor = numero;
                ganador = i;
            }

            i++;
        }

        System.out.println("El empleado " + ganador + " es el ganador con " + mayor + " ventas.");
    }
}
