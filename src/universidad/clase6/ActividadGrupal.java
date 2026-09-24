package universidad.clase6;

public class ActividadGrupal extends Actividad implements Promocionable {
    
    public ActividadGrupal(Long codigo, String nombre, int duracionMinutos, Double precioBase) {
        super(codigo, nombre, duracionMinutos, precioBase);
    }

    @Override
    public Double calcularPrecioFinal() {
        return getPrecioBase() * getDuracionMinutos();
    }
    @Override
    public Double calcularDescuento() {
        return calcularPrecioFinal() * 0.10;
    }
}
