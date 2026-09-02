package comoprogramarenjava.C712;

public class Empleado {
    private String nombre;
    private String apellido;
    private double salarioMensual;

    public Empleado(String nombre, String apellido, double salarioMensual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioMensual = salarioMensual > 0 ? salarioMensual : 0.0;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public double getSalarioMensual() {
        return this.salarioMensual;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual > 0 ? salarioMensual : 0.0;
    }
}
