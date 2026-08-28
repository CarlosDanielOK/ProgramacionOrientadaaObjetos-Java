package universidad.introduccion;

public class Empleado {
    private String nombre;
    private String legajo;
    private double sueldoBase;

    public Empleado(String nombre, String legajo, double sueldoBase) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.sueldoBase = sueldoBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double calcularSueldo() {
        return sueldoBase;
    }
}