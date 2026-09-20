package universidad.clase4.composicion;

import java.util.ArrayList;
import java.util.List;

public class Casa {
    private Character categoria;
    private float precio;
    private List<Habitacion> habitaciones;

    public Casa(Character categoria, float precio, String denominacion) {
        this.categoria = categoria;
        this.precio = precio;
        habitaciones = new ArrayList<>();
        // alternativa1
        Habitacion habitacion = new Habitacion(denominacion);
        habitaciones.add(habitacion);
    }

    // alternativa2
    public Casa(Character categoria, float precio) {
        this.categoria = categoria;
        this.precio = precio;
        habitaciones = new ArrayList<>();
    }

    public void agregarHabitacion(String denominacion) {
        Habitacion habitacion = new Habitacion(denominacion);
        habitaciones.add(habitacion);
    }

    public void mostrarHabitacion() {
        System.out.println("Casa - Categoria:" + categoria + "precio: " + precio);
        for (Habitacion ambiente : habitaciones) {
            System.out.println(ambiente);
        }

    }
}
