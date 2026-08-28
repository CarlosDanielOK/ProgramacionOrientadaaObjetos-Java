package universidad.agregacion;

public class Jugador {
    private String nombre;
    private int numeroCamiseta;
    private int partidosJugados;
    private int golesConvertidos;

    public Jugador(String nombre, int numeroCamiseta, int partidosJugados, int golesConvertidos) {
        this.nombre = nombre;
        this.numeroCamiseta = numeroCamiseta;
        this.partidosJugados = partidosJugados;
        this.golesConvertidos = golesConvertidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getGolesConvertidos() {
        return golesConvertidos;
    }

    public void setGolesConvertidos(int golesConvertidos) {
        this.golesConvertidos = golesConvertidos;
    }

    public void registrarPartido() {
        partidosJugados++;
    }

    public void registrarGoles(int cantidad) {
        golesConvertidos += cantidad;
    }

    public double calcularPromedioGoles() {
        if (partidosJugados == 0) {
            return 0;
        }
        return (double) golesConvertidos / partidosJugados;
    }

    @Override
    public String toString() {
        return "Nombre='" + nombre + '\'' +
                ", numeroCamiseta=" + numeroCamiseta +
                ", partidosJugados=" + partidosJugados +
                ", golesConvertidos=" + golesConvertidos;
    }
}