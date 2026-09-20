package universidad.clase5tarea1;

public abstract class CuentaBancaria {
    String cbu;
    String titular;
    Double saldo;
    Integer transacciones;

    public CuentaBancaria(String cbu, String titular, Double saldo, Integer transacciones) {
        this.cbu = cbu;
        this.titular = titular;
        this.saldo = saldo;
        this.transacciones = transacciones;
    }

    public void depositar(Double monto) {
        this.saldo += monto;
        this.transacciones++;
    }

    public abstract Boolean extraer(Double monto);
}