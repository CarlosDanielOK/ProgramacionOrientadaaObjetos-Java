package comoprogramarenjava;

import java.util.Scanner;

public class C2_5 {
    // el metodo main empieza la ejecución de la aplicación en Java
    public static void main(String[] args) {
        // crea un Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primero número: ");
        int numero1 = entrada.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int numero2 = entrada.nextInt();

        int suma = numero1 + numero2;

        System.out.printf("La suma es %d%n", suma);
    }
}
