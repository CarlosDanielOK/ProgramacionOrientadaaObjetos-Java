package universidad.composicion;

public class Habitacion {
    private short tamanio;
    private String color;
    private String denominacion;

    public Habitacion(String denominacion) {
        this.denominacion = denominacion;
        this.tamanio = 20;
        this.color = "Blanco";
    }

    public short getTamanio() {
        return tamanio;
    }

    public void setTamanio(short tamanio) {
        this.tamanio = tamanio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    @Override
    public String toString() {
        return "Metros cuadrados=" + tamanio +
                ", color='" + color + '\'' +
                ", denominacion='" + denominacion;

    }
}
