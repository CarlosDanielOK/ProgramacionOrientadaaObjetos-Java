package comoprogramarenjava.C712;

public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Naruto", "Uzumaki", 1000);
        Empleado empleado2 = new Empleado("Sasuke", "Uchiha", 999);

        System.out.println("EMPLEADO 1:");
        System.out.println(empleado1.getNombre());
        System.out.println(empleado1.getApellido());
        System.out.println("$" + empleado1.getSalarioMensual());
        System.out.println("Salario anual: $" + (empleado1.getSalarioMensual() * 12));

        System.out.println("EMPLEADO 2:");
        System.out.println(empleado2.getNombre());
        System.out.println(empleado2.getApellido());
        System.out.println("$" + empleado2.getSalarioMensual());
        System.out.println("Salario anual: $" + (empleado2.getSalarioMensual() * 12));

        System.out.println("APLICANDO AUMENTO DEL 10%");
        empleado1.setSalarioMensual(empleado1.getSalarioMensual() * 1.10);
        System.out.println("Nuevo salario anual de empleado 1: $" + (empleado1.getSalarioMensual() * 12));
        empleado2.setSalarioMensual(empleado2.getSalarioMensual() * 1.10);
        System.out.println("Nuevo salario anual de empleado 2: $" + (empleado2.getSalarioMensual() * 12));
    }
}
