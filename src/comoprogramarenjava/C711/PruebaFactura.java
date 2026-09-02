package comoprogramarenjava.C711;

public class PruebaFactura {
    public static void main(String[] args) {
        Factura factura1 = new Factura("10", "Articulo de prueba", 8, 50.00);
        System.out.println(factura1.getNumeroPieza());
        System.out.println(factura1.getDescripcion());
        System.out.println(factura1.getCantidad());
        System.out.println(factura1.getPrecio());

        System.out.println(factura1.obtenerMontoFactura());

        factura1.setNumeroPieza("20");
        factura1.setDescripcion("Nueva descripción");
        factura1.setCantidad(30);
        factura1.setPrecio(60.00);

        System.out.println(factura1.obtenerMontoFactura());
    }
}
