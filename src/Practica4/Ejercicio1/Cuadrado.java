package Practica4.Ejercicio1;

import com.sun.source.tree.BreakTree;

public class Cuadrado extends Geometria implements Coloreable{
    protected Double lado;
    String color;

    public Cuadrado(Double lado) {
        this.lado = lado;
    }

    @Override
    public void colorear(String color) {
    this.color=color;
    }

    @Override
    double calcularArea() {
        double area = lado * lado;
        return area;
    }

    @Override
    double calcularPerimetro() {
        double perimetro=4*lado;
        return perimetro;
    }


}
