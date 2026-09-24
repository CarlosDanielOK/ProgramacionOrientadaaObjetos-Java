package universidad.clase6;

public class UsarCredencial {
    public static void main(String[] args) {
        Credencial credencial = new Credencial(1234, "Naruto");
        System.out.println(credencial.mostrarDatos());
        credencial.setHabilitada(false);
        System.out.println(credencial.mostrarDatos());

        ActividadIndividual actividad = new ActividadIndividual(1234l, "Sasuke", 20, 1000.0);
        System.out.println(actividad.calcularPrecioFinal());

        ActividadGrupal actividadGrupal = new ActividadGrupal(54321l, "Itachi", 10, 1000.0);
        System.out.println(actividadGrupal.calcularPrecioFinal());
        System.out.println(actividadGrupal.calcularDescuento());
    }
}
