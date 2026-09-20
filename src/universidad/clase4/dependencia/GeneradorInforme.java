package universidad.clase4.dependencia;

public class GeneradorInforme {
    public void generarInforme(Venta venta) {
        System.out.println("Informe de venta");
        System.out.println(venta);
    }

    public void generarInformeConDescuento(Venta venta, double porcentaje) {
        double descuento = venta.getImporteTotal() * porcentaje / 100;
        double importeFinal = venta.getImporteTotal() - descuento;

        System.out.println("Informe de venta con descuento");
        System.out.println("Numero: " + venta.getNumero());
        System.out.println("Cliente: " + venta.getCliente());
        System.out.println("Importe original: " + venta.getImporteTotal());
        System.out.println("Descuento (" + porcentaje + "%): " + descuento);
        System.out.println("Importe final: " + importeFinal);
    }

    public boolean esVentaImportante(Venta venta) {
        return venta.getImporteTotal() >= 100000;
    }
}