package universidad.clase2.introduccion;

public class Persona {
    private String nombre;
    private String dni;
    private Licencia licencia;

    public Persona(String nombre, String dni, Licencia licencia) {
        this.nombre = nombre;
        this.dni = dni;
        this.licencia = licencia;
    }

    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.licencia = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Licencia getLicencia() {
        return licencia;
    }

    public void setLicencia(Licencia licencia) {
        this.licencia = licencia;
    }

    public void asignarLicencia(Licencia nuevaLicencia) {
        licencia = nuevaLicencia;
    }

    public void mostrarFichaPersona() {
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        if (licencia != null) {
            System.out.println("Numero de licencia: " + licencia.getNumero());
            System.out.println("Categoria: " + licencia.getCategoria());
            System.out.println("Vigente: " + licencia.isVigente());
        } else {
            System.out.println("La persona no posee licencia.");
        }
    }
}