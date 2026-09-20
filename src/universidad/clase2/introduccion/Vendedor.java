package universidad.clase2.introduccion;

public class Vendedor extends Empleado {
    private double comision;
    private double totalVentas;

    public Vendedor(String nombre, String legajo, double sueldoBase, double comision, double totalVentas) {
        super(nombre, legajo, sueldoBase);
        this.comision = comision;
        this.totalVentas = totalVentas;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public double getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(double totalVentas) {
        this.totalVentas = totalVentas;
    }

    public void registrarVenta(double monto) {
        totalVentas += monto;
    }

    @Override
    public double calcularSueldo() {
        return getSueldoBase() + totalVentas * comision;
    }
}