package universidad.clase6;

public abstract class Actividad {
    private Long codigo;
    private String nombre;
    private int duracionMinutos;
    private Double precioBase;

    public Actividad(Long codigo, String nombre, int duracionMinutos, Double precioBase) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.duracionMinutos = duracionMinutos;
        this.precioBase = precioBase;
    }

    public Long getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public abstract Double calcularPrecioFinal();
}
