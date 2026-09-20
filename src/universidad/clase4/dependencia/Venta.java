package universidad.clase4.dependencia;

public class Venta {
    private String numero;
    private String cliente;
    private double importeTotal;

    public Venta(String numero, String cliente, double importeTotal) {
        this.numero = numero;
        this.cliente = cliente;
        this.importeTotal = importeTotal;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }

    @Override
    public String toString() {
        return "Numero='" + numero + '\'' +
                ", cliente='" + cliente + '\'' +
                ", importeTotal=" + importeTotal;
    }
}