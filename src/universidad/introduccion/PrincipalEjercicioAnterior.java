package universidad.introduccion;

public class PrincipalEjercicioAnterior {
    public static void main(String[] args) {
        Licencia licencia = new Licencia("LIC-123", "B1", false);
        Persona persona = new Persona("Carlos", "30123456", licencia);
        persona.mostrarFichaPersona();

        System.out.println("------------------------------------");
        licencia.renovar();
        persona.mostrarFichaPersona();

        System.out.println("------------------------------------");
        Persona personaSinLicencia = new Persona("Ana", "30987654");
        personaSinLicencia.asignarLicencia(new Licencia("LIC-456", "B1", true));
        personaSinLicencia.mostrarFichaPersona();

        System.out.println("------------------------------------");
        Vendedor vendedor = new Vendedor("Pedro", "VEN-001", 500000, 0.05, 0);
        vendedor.registrarVenta(1000000);
        vendedor.registrarVenta(500000);
        System.out.println("Sueldo del vendedor: " + vendedor.calcularSueldo());
    }
}