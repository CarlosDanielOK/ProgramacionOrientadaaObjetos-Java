package universidad.clase5abstracta;

public class Perro extends Animal {
    String raza;
    String pelaje;

    public Perro(String nombre, short edad, String raza, String pelaje) {
        super(nombre, edad);
        this.raza = raza;
        this.pelaje = pelaje;
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau guau");
    }
}
