package UT5.ejercicios.Conjuntos;

public class Persona implements Comparable{
    private String nombre;
    private String apellido;
    private Integer edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public Persona (String nombre, Integer edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    @Override
    public int compareTo(Object other) {
        Persona otherPersona = (Persona) other;
        return this.nombre.compareTo(otherPersona.nombre);
    }

    @Override
    public String toString() {
        return this.nombre + " tiene " + this.edad + " años";

    }

}