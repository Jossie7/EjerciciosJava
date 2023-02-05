package Practica3.ej2;

public class Alumno {
   private String nombre;
    private String apellido;
   private Integer edad;
    private Boolean repetidor;
     private Double notamedia;
  private  String correo;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public Boolean getRepetidor() {
        return repetidor;
    }

    public Double getNotamedia() {
        return notamedia;
    }

    public String getCorreo() {
        return correo;
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

    public void setNotamedia(Double notamedia) {
        this.notamedia = notamedia;
    }

    public void setRepetidor(Boolean repetidor) {
        this.repetidor = repetidor;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
     void MostrarNombreYEdad(){
         System.out.println("El nombre del alumno es: " + nombre + ". El apellido del alumno es : " + apellido + ". La edad del alumno es: " + edad );
     }
     Alumno(){}
     public Alumno (String nombre,String apellido, Integer edad ){
        this.nombre=nombre;
        this.edad=edad;
        this.apellido=apellido;
    }
}
