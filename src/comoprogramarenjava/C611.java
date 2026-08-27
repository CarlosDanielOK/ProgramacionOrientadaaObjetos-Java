package comoprogramarenjava;

public class C611 {
    public static void main(String[] args) {
        double[] a = { 1, 2, 3, 4, 5 };
        double[] b = { 6, 7, 8, 9 };
        double[] c = new double[10];
        double d1 = 1, d2 = 2, d3 = 3, d4 = 4;
        System.out.println(promedio(a,b));
    }

    public static double promedio(double[]... numeros) {
        double total = 0;

        for (double[] n : numeros) {
            System.out.println(n);
        }

        System.out.println(numeros);
        return total;
    }
}
