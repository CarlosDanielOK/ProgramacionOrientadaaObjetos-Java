package universidad.clase4.agregacion;

public class Principal {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Lionel", 10, 5, 8);
        Jugador jugador2 = new Jugador("Diego", 9, 4, 6);
        Jugador jugador3 = new Jugador("Martin", 7, 3, 2);
        Jugador jugador4 = new Jugador("Juan", 5, 2, 1);

        jugador1.registrarPartido();
        jugador1.registrarGoles(2);

        Equipo equipo = new Equipo("Los Campeones", 5);
        equipo.incorporarJugador(jugador1);
        equipo.incorporarJugador(jugador2);
        equipo.incorporarJugador(jugador3);
        equipo.incorporarJugador(jugador4);

        equipo.mostrarPlantel();
        System.out.println("Total de goles: " + equipo.calcularTotalGoles());
        System.out.println("Goleador: " + equipo.obtenerGoleador().getNombre());
        System.out.println("Promedio de goles por jugador: " + equipo.calcularPromedioGolesEquipo());
    }
}