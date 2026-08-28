package universidad.agregacion;

public class Profesor {
    private String Nombre;
    private int legajo;

    public Profesor(String nombre, int legajo) {
        Nombre = nombre;
        this.legajo = legajo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    @Override
    public String toString() {
        return "Nombre='" + Nombre + '\'' +
                ", legajo=" + legajo;

    }
}
