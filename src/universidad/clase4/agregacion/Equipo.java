package universidad.clase4.agregacion;

public class Equipo {
    private String nombre;
    private Jugador[] jugadores;
    private int cantidadJugadores;

    public Equipo(String nombre, int capacidadMaxima) {
        this.nombre = nombre;
        this.jugadores = new Jugador[capacidadMaxima];
        this.cantidadJugadores = 0;
    }

    public void incorporarJugador(Jugador jugador) {
        if (cantidadJugadores < jugadores.length) {
            jugadores[cantidadJugadores] = jugador;
            cantidadJugadores++;
            System.out.println("Se ha incorporado al equipo al jugador: " + jugador.getNombre());
        } else {
            System.out.println("No hay lugar para incorporar al jugador: " + jugador.getNombre());
        }
    }

    public Jugador buscarJugador(int numeroCamiseta) {
        for (int i = 0; i < cantidadJugadores; i++) {
            if (jugadores[i].getNumeroCamiseta() == numeroCamiseta) {
                return jugadores[i];
            }
        }
        return null;
    }

    public int calcularTotalGoles() {
        int totalGoles = 0;
        for (int i = 0; i < cantidadJugadores; i++) {
            totalGoles += jugadores[i].getGolesConvertidos();
        }
        return totalGoles;
    }

    public Jugador obtenerGoleador() {
        if (cantidadJugadores == 0) {
            return null;
        }

        Jugador goleador = jugadores[0];
        for (int i = 1; i < cantidadJugadores; i++) {
            if (jugadores[i].getGolesConvertidos() > goleador.getGolesConvertidos()) {
                goleador = jugadores[i];
            }
        }
        return goleador;
    }

    public double calcularPromedioGolesEquipo() {
        if (cantidadJugadores == 0) {
            return 0;
        }
        return (double) calcularTotalGoles() / cantidadJugadores;
    }

    public void mostrarPlantel() {
        System.out.println("Plantel del equipo: " + nombre);
        for (int i = 0; i < cantidadJugadores; i++) {
            System.out.println(jugadores[i]);
        }
    }
}