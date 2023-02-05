package HerenciaAMH;

import HerenciaAMH.Madre;

public class Hija extends Madre {
    void MostrarEdad(Integer edad){
        System.out.println("Yo tengo " + edad + " años. ");
    }
    void ComidaPreferida(String comidafav){
        System.out.println("Mi comida favorita es " + comidafav);
    }
    void MostrarNombre(){
        System.out.println("Me llamo " + nombre);
    }
    void MostrarApellido(){
        System.out.println("Me apellido " + apellido);
    }
}
