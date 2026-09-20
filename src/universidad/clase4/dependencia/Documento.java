package universidad.clase4.dependencia;

public class Documento {
    private String nombre;
    private String contenido;
    private int paginaInicial;
    private int paginaFinal;
    // constructor

    public Documento(String nombre) {
        this.nombre = nombre;
        this.paginaInicial = 1;
        this.paginaFinal = 1;
    }
    // getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getPaginaInicial() {
        return paginaInicial;
    }

    public void setPaginaInicial(int paginaInicial) {
        this.paginaInicial = paginaInicial;
    }

    public int getPaginaFinal() {
        return paginaFinal;
    }

    public void setPaginaFinal(int paginaFinal) {
        this.paginaFinal = paginaFinal;
    }

    // toString
    // metodos especificos
    @Override
    public String toString() {
        return " " + nombre + '\'' +
                ", Desde " + paginaInicial +
                ", hasta =" + paginaFinal;
    }

}
