package universidad.clase4.composicion;

public class Prueba {
    public static void main(String[] args) {
        Casa casa = new Casa('A', 25);
        casa.agregarHabitacion("Living");
        casa.agregarHabitacion("baño");
        casa.agregarHabitacion("dormitorio1");
        casa.mostrarHabitacion();

    }
}
