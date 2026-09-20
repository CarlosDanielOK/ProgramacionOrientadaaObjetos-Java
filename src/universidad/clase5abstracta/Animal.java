package universidad.clase5abstracta;

public abstract class Animal {
    String nombre;
    short edad;
    String alimento;

    public Animal(String nombre, short edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String comer() {
        // System.out.println("Su alimento es: " + alimento);
        return alimento;
    }

    public abstract void hacerSonido();
}