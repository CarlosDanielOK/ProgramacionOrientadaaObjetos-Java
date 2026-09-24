package universidad.clase6;

public class ActividadIndividual extends Actividad {
    public ActividadIndividual(Long codigo, String nombre, int duracionMinutos, Double precioBase) {
        super(codigo, nombre, duracionMinutos, precioBase);
    }

    @Override
    public Double calcularPrecioFinal() {
        return getPrecioBase() * getDuracionMinutos();
    }
}
