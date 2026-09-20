package universidad.clase4.composicion;

public class Factura {
    private String numero;
    private String cliente;
    private DetalleFactura[] detalles;
    private int cantidadDetalles;

    public Factura(String numero, String cliente, int capacidadMaxima) {
        this.numero = numero;
        this.cliente = cliente;
        this.detalles = new DetalleFactura[capacidadMaxima];
        this.cantidadDetalles = 0;
    }

    public void agregarDetalle(String descripcion, int cantidad, double precioUnitario) {
        if (cantidad <= 0 || precioUnitario <= 0) {
            System.out.println("No se puede agregar el detalle: la cantidad y el precio deben ser mayores que cero.");
        } else if (cantidadDetalles < detalles.length) {
            detalles[cantidadDetalles] = new DetalleFactura(descripcion, cantidad, precioUnitario);
            cantidadDetalles++;
            System.out.println("Se ha agregado el detalle: " + descripcion);
        } else {
            System.out.println("No hay lugar para agregar el detalle: " + descripcion);
        }
    }

    public double calcularSubtotalGeneral() {
        double subtotalGeneral = 0;
        for (int i = 0; i < cantidadDetalles; i++) {
            subtotalGeneral += detalles[i].calcularSubtotal();
        }
        return subtotalGeneral;
    }

    public double calcularIVA() {
        return calcularSubtotalGeneral() * 0.21;
    }

    public double calcularTotal() {
        return calcularSubtotalGeneral() + calcularIVA();
    }

    public DetalleFactura buscarDetalle(String descripcion) {
        for (int i = 0; i < cantidadDetalles; i++) {
            if (detalles[i].getDescripcion().equals(descripcion)) {
                return detalles[i];
            }
        }
        return null;
    }

    public void mostrarFactura() {
        System.out.println("Factura numero: " + numero);
        System.out.println("Cliente: " + cliente);
        for (int i = 0; i < cantidadDetalles; i++) {
            System.out.println(detalles[i] + ", subtotal=" + detalles[i].calcularSubtotal());
        }
        System.out.println("Subtotal general: " + calcularSubtotalGeneral());
        System.out.println("IVA (21%): " + calcularIVA());
        System.out.println("Total: " + calcularTotal());
    }
}