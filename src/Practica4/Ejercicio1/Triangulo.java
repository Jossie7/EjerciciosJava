package Practica4.Ejercicio1;

public class Triangulo extends Geometria implements Coloreable {
    protected Double base;
    protected Double altura;

    String color;

    public Triangulo(Double base, Double altura) {
        this.base = base;
        this.altura=altura;
    }


    @Override
    public void colorear(String color) {
    this.color=color;
    }

    @Override
    double calcularArea() {
       double area = base*altura/2;
        return area;
    }
// Voy a asumir que es un triángulo equilátero, por ende la base sería al lado que va a ser igual.
    @Override
    double calcularPerimetro() {
        double perimetro = base*3;
        return perimetro;
    }
}
