package universidad.clase5abstracta;

public class Prueba {
    public static void main(String[] args) {
        Animal miPerro = new Perro("FIRULAIS", (short) 2, "Labrador", "Negro");
        miPerro.hacerSonido();
        System.out.println(miPerro.comer());
    }
}
