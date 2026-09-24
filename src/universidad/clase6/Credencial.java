package universidad.clase6;

public class Credencial {
    private int codigo;
    private String usuario;
    private int anioEmision;
    private boolean estado;

    public Credencial(int codigo, String usuario) {
        this.codigo = codigo;
        this.usuario = usuario;
        this.anioEmision = 2016;
        this.estado = true;
    }

    public int getAnioEmision() {
        return this.anioEmision;
    }

    public void setHabilitada(boolean estado) {
        this.estado = estado;
    }

    public String mostrarDatos() {
        String informacion = "Código: " + codigo + "\nUsuario: " + usuario + "\nAño de emisión: " + anioEmision
                + "\nEstado: " + estado;
        return "Datos de credencial:\n" + informacion;
    }
}
