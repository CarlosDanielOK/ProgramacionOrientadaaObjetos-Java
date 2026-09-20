package universidad.clase4.composicion;

public class PrincipalFactura {
    public static void main(String[] args) {
        Factura factura = new Factura("F-001", "Carlos", 4);

        factura.agregarDetalle("Cuaderno", 2, 150.0);
        factura.agregarDetalle("Lapicera", 3, 50.0);
        factura.agregarDetalle("Mochila", 1, 1200.0);
        factura.agregarDetalle("Producto invalido", 0, 500.0);

        factura.mostrarFactura();

        DetalleFactura detalle = factura.buscarDetalle("Lapicera");
        if (detalle != null) {
            System.out.println("Detalle encontrado: " + detalle);
        }
    }
}