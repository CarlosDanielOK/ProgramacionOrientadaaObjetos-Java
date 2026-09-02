package comoprogramarenjava.C88;

public class Persona {
    private String nombre;
    private Direccion direccion;

    public Persona(String nombre, Direccion direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String toString() {
        return "Nombre: " + nombre + "\nDireccion: " + direccion;
    }
}
