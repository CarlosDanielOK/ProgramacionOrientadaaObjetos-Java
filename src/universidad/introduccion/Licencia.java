package universidad.introduccion;

public class Licencia {
    private String numero;
    private String categoria;
    private boolean vigente;

    public Licencia(String numero, String categoria, boolean vigente) {
        this.numero = numero;
        this.categoria = categoria;
        this.vigente = vigente;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isVigente() {
        return vigente;
    }

    public void setVigente(boolean vigente) {
        this.vigente = vigente;
    }

    public void renovar() {
        vigente = true;
    }
}