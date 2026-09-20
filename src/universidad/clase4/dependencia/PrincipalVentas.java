package universidad.clase4.dependencia;

public class PrincipalVentas {
    public static void main(String[] args) {
        Venta venta = new Venta("V-001", "Carlos", 125000);
        GeneradorInforme generador = new GeneradorInforme();

        generador.generarInforme(venta);
        System.out.println("------------------------------------");
        generador.generarInformeConDescuento(venta, 10);
        System.out.println("------------------------------------");
        System.out.println("La venta es importante: " + generador.esVentaImportante(venta));
    }
}