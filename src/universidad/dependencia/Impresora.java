package universidad.dependencia;

public class Impresora {
    private String marca;
    private String puerto;

    public Impresora(String marca, String puerto) {
        this.marca = marca;
        this.puerto = puerto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public void imprimirDocumento(Documento documento) {
        System.out.println("Imprimiendo: " + documento.getNombre());
    }
}
