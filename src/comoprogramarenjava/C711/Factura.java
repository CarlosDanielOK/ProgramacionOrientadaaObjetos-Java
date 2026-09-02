package comoprogramarenjava.C711;

public class Factura {
    private String numeroPieza;
    private String descripcion;
    private int cantidad;
    private double precio;

    public Factura(String numeroPieza, String descripcion, int cantidad, double precio) {
        this.numeroPieza = numeroPieza;
        this.descripcion = descripcion;
        this.cantidad = cantidad > 0 ? cantidad : 0;
        this.precio = precio > 0 ? precio : 0.0;
    }

    public String getNumeroPieza() {
        return numeroPieza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad > 0 ? cantidad : 0;
    }

    public void setPrecio(double precio) {
        this.precio = precio > 0 ? precio : 0.0;
    }

    public double obtenerMontoFactura() {
        return cantidad * precio;
    }
}
