package Practica4.Ejercicio1;

public class Circulo extends Geometria implements Coloreable {
    static Double pi=3.1415;
    protected Double radio;
    String color;


    public Circulo(Double radio) {
        this.radio = radio;
    }

    @Override
    public void colorear(String color) {
        this.color = color;
    }

    @Override
    double calcularArea() {
        double area = pi*radio*radio;
        return area;
    }

    @Override
    double calcularPerimetro() {
        double perimetro=2*pi*radio;
        return perimetro;
    }
}
