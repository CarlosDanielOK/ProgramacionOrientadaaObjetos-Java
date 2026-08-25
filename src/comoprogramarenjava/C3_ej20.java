package comoprogramarenjava;

import java.util.Scanner;

public class C3_ej20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sueldoBruto = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.println("EMPLEADO NRO " + i);
            System.out.print("Ingrese la cantidad de horas trabajadas del empleado: ");
            int horas = input.nextInt();
            System.out.print("Ingrese la tarifa por hora: $");
            double tarifaPorHora = input.nextDouble();

            if (horas <= 40) {
                sueldoBruto = horas * tarifaPorHora;
            } else { // si el empleado tiene mas de 40 horas trabajadas
                int horasExtra = horas - 40;
                sueldoBruto = 40 * tarifaPorHora; // paga cuota normal
                tarifaPorHora += (tarifaPorHora / 2); // actualizamos la tarifa para horas extra
                sueldoBruto += horasExtra * tarifaPorHora; // calculamos el sueldo bruto mas las horas extra
            }

            System.out.println("SUELDO BRUTO DEL EMPLEADO " + i + " es: $" + sueldoBruto);
        }
    }
}
