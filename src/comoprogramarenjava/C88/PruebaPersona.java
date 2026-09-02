package comoprogramarenjava.C88;

public class PruebaPersona {
    public static void main(String[] args) {
        Direccion direccion = new Direccion("Buenos Aires", "Argentina");
        Persona persona = new Persona("Naruto", direccion);

        System.out.println(direccion);
        System.out.println(persona);
    }
}
