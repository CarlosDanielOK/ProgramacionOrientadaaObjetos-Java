package comoprogramarenjava;

import java.util.Scanner;

public class C3_ej18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeroCuenta, saldoInicio, articulos, creditos, limiteCredito;
        int i = 1;

        System.out.print("Quiere ingresar un nuevo cliente (1 para ingresar, -1 para salir): ");
        int acceso = input.nextInt();

        while (acceso != -1) {
            System.out.println("Cliente " + i);
            System.out.println("Ingrese el numero de cuenta: ");
            numeroCuenta = input.nextInt();
            System.out.println("Ingrese el saldo inicial: ");
            saldoInicio = input.nextInt();
            System.out.println("Ingrese el total de todos los artículos cargados por el cliente en el mes: ");
            articulos = input.nextInt();
            System.out.println("Ingrese el total de todos los créditos aplicados a la cuenta del cliente en el mes: ");
            creditos = input.nextInt();
            System.out.println("Ingrese el límite de crédito permitido: ");
            limiteCredito = input.nextInt();

            int nuevoSaldo = saldoInicio + articulos - creditos;

            System.out.println("Número de cuenta: " + numeroCuenta);
            System.out.println("Nuevo saldo: " + nuevoSaldo);

            if (nuevoSaldo > limiteCredito) {
                System.out.println("Excedio el limite de credito.");
            }

            System.out.print("Quiere ingresar un nuevo cliente (1 para ingresar, -1 para salir): ");
            acceso = input.nextInt();

            i++;
        }
    }
}
