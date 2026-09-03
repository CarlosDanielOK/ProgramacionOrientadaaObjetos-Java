package universidad.clase5tarea1;

public class PruebaCuenta {
    public static void main(String[] args) {
        CuentaCorriente primeraCuenta = new CuentaCorriente("12345", "Naruto", 10000.00, 0, 5000.00);
        CuentaCorriente segundaCuenta = new CuentaCorriente("1234567", "Sasuke", 100000.00, 0, 50000.00);

        primeraCuenta.depositar(200000.00);
        System.out.println("Saldo: " + primeraCuenta.saldo);
        System.out.println("Transacciones: " + primeraCuenta.transacciones);
        primeraCuenta.extraer(1000.00);
        System.out.println("Saldo: " + primeraCuenta.saldo);

        segundaCuenta.depositar(200000.00);
        System.out.println("Saldo: " + segundaCuenta.saldo);
        System.out.println("Transacciones: " + segundaCuenta.transacciones);
        segundaCuenta.extraer(1000.00);
        System.out.println("Saldo: " + segundaCuenta.saldo);

        CajaAhorro caja = new CajaAhorro("99999", "Sakura", 10000.00, 0);

        caja.depositar(5000.00);
        System.out.println("Saldo caja: " + caja.saldo);
        System.out.println("Transacciones: " + caja.transacciones);

        Boolean retiroExitoso = caja.extraer(12000.00);
        System.out.println("¿Retiro exitoso?: " + retiroExitoso);
        System.out.println("Saldo caja: " + caja.saldo);
    }
}
