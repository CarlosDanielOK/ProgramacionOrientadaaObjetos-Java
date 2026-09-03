package universidad.clase5tarea1;

public class CajaAhorro extends CuentaBancaria {

    public CajaAhorro(String cbu, String titular, Double saldo, Integer transacciones) {
        super(cbu, titular, saldo, transacciones);
    }

    @Override
    public Boolean extraer(Double monto) {
        if (this.saldo >= monto) {
            this.saldo -= monto;
            this.transacciones++;
            return true;
        }

        return false;
    }
}
