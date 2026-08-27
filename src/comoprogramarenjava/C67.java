package comoprogramarenjava;

public class C67 {
    public static void main(String[] args) {
        int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total = 0;

        // Se puede leer como: para cada iteración, asigne el siguiente elemento del array a la variable del tipo int numero y luego ejecute la siguiente instrucción. 
        for (int numero : array) {
            total += numero;
            System.out.println(numero);
        }

        System.out.println(total);
    }
}
