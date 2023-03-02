package UT5.ejercicios.Conjuntos;

import java.util.Comparator;

public class Comparador implements Comparator<Persona> {
    @Override
    public int compare(Persona p1, Persona p2) {
        if (p1.getNombre().compareToIgnoreCase(p2.getNombre()) == 0) {
            if (p1.getEdad() == p2.getEdad()) {
                return 0;
            }
            if (p1.getEdad() < p2.getEdad()) {
                return 1;
            }
            return -1;
        }
        return p1.getNombre().compareToIgnoreCase(p2.getNombre());
    }

    @Override
    public Comparator<Persona> reversed() {
        return Comparator.super.reversed();
    }
}