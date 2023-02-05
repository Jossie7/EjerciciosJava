package Arrays.ejercicios.Tarea44;

public class Persona {
    String nombre;
    int edad;

    Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Sobreescribimos el método toString
    public String Tostring() {
        this.nombre = nombre;
        this.edad = edad;
        return nombre + "tiene" + edad + "años";
    }
}


