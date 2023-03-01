package UT5.ejercicios;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Pepito",15);
        Persona persona2 = new Persona("Juanita",78);
        Persona persona3 = new Persona("Pepito",21);
        Persona persona4 = new Persona("Anita",9);
        Persona persona5 = new Persona("Zoila",54);

        TreeSet <Persona> conjuntoPersonas = new TreeSet<>();
        conjuntoPersonas.add(persona1);
        conjuntoPersonas.add(persona2);
        conjuntoPersonas.add(persona3);
        conjuntoPersonas.add(persona4);
        conjuntoPersonas.add(persona5);

        System.out.println(conjuntoPersonas);
    }
}
