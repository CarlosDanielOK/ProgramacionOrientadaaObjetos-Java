package comoprogramarenjava;

public class C44 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 2; i <= 20; total += i, i+=2) {
            System.out.println(total);
        }

        System.out.println("El total es " + total);
    }
}
