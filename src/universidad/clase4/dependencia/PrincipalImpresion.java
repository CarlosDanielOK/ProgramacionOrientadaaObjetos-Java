package universidad.clase4.dependencia;

public class PrincipalImpresion {
    public static void main(String[] args) {
        Documento documento = new Documento("Mi tesis");
        Impresora impresora = new Impresora("Epson", "USB01");
        impresora.imprimirDocumento(documento);

    }
}
