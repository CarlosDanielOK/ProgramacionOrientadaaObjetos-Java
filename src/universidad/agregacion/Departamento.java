package universidad.agregacion;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String denominacion;
    private List<Profesor> profesores;// establecemos la relacion de agregacion

    /// constructor
    public Departamento(String denominacion) {
        this.denominacion = denominacion;
        this.profesores = new ArrayList<>();
    }

    public Departamento(String denominacion, List<Profesor> profesores) {
        this.denominacion = denominacion;
        this.profesores = profesores;
    }

    public void agregarProfesor(Profesor profesor) {
        this.profesores.add(profesor);
        System.out.println("Se ha añadido al departamento al profesor: " + profesor.getNombre());
    }

    public void mostrarProfesores() {
        System.out.println("Profesores que integran el departamento: " + this.denominacion);
        for (Profesor profe : profesores) {
            System.out.println(profe.getNombre().toUpperCase());
        }
    }

    public void mostrarProfesores2() {
        System.out.println("Profesores que integran el departamento: " + this.denominacion);
        for (int i = 0; i < profesores.size(); i++) {
            System.out.println(profesores.get(i));

        }
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public boolean buscarPorLegajo(int legajo) {
        for (Profesor profe : profesores) {
            if (profe.getLegajo() == legajo) {
                return true;
            }
        }
        return false;
    }

    public boolean buscarPorNombre(String nombre) {
        for (Profesor profe : profesores) {
            // if (profe.getNombre() == nombre) //comparaciones referencia a memoria
            if (profe.getNombre().equals(nombre))
                return true;
        }
        return false;
    }
}
