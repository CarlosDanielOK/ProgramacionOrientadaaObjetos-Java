package comoprogramarenjava;

import java.util.Scanner;

public class C3_ej17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int kTotal = 0;
        int lTotal = 0;

        System.out.print("Ingrese cuantos kilometros recorridos: ");
        int kilometros = input.nextInt();

        while (kilometros != -1) {
            System.out.print("Ingrese cuantos litros usados: ");
            int litros = input.nextInt();

            double rendimiento = (double) kilometros / litros;

            System.out.println("El rendimiento de su viaje es " + rendimiento + " Kilometros por litro.");

            kTotal += kilometros;
            lTotal += litros;

            System.out.print("Ingrese cuantos kilometros recorridos: ");
            kilometros = input.nextInt();
        }

        System.out.print("El rendimiento total de su viaje es " + (double) kTotal / lTotal + " Kilometros por litro.");
    }
}
