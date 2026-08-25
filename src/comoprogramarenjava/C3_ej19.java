package comoprogramarenjava;

import java.util.Scanner;

public class C3_ej19 {
    public static void main(String[] args) {
        double ventas = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese que articulo vendio (-1 para terminar): ");
        int articulo = input.nextInt();

        while (articulo != -1) {
            if (articulo == 1) {
                ventas += 239.99;
            } else if (articulo == 2) {
                ventas += 129.75;
            } else if (articulo == 3) {
                ventas += 99.95;
            } else if (articulo == 4) {
                ventas += 350.89;
            } else {
                System.out.println("ERROR. Número de articulo invalido.");
            }

            System.out.print("Ingrese que articulo vendio (-1 para terminar): ");
            articulo = input.nextInt();
        }

        System.out.println("En total vendiste: $" + ventas);

        double comision = ventas * 0.09; // La vendedora se lleva el 9%
        double total = 200 + comision; // gana 200 fijos + la comision

        System.out.println("Su comisión es: $" + comision);
        System.out.println("Su ganancia semanal es: $" + total);
    }
}
