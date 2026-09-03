package universidad.clase5tarea1;

public class CuentaCorriente extends CuentaBancaria {
    Double limiteSobregiro;

    public CuentaCorriente(String cbu, String titular, Double saldo, Integer transacciones, Double limiteSobregiro) {
        super(cbu, titular, saldo, transacciones);
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public Boolean extraer(Double monto) {
        if (this.saldo - monto >= -this.limiteSobregiro) {
            this.saldo -= monto;
            this.transacciones++;
            return true;
        }

        return false;
    }
}
