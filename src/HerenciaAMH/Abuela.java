package HerenciaAMH;

public class Abuela {
    String nombre;
    String apellido;
    String comidafav;
    Integer edad;

    void MostrarNombre(){
        System.out.println("Mi abuela se llama " + nombre);
    }
    void MostrarNombre(String nombre){
        System.out.println("El nombre de mi abuela es " + nombre );
    }
    void MostrarApellido(){
        System.out.println("El apellido de mi abuela es " + apellido);
    }
    void MostrarEdad(){
        System.out.println("La edad de mi abuela es " + edad);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setComidafav(String comidafav) {
        this.comidafav = comidafav;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getComidafav() {
        return comidafav;
    }

    public Integer getEdad() {
        return edad;
    }
}


