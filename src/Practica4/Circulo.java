package Practica4;

public class Circulo extends Geometria implements  Coloreable{
    static Double pi=3.1415;
    protected Double radio;

    private void calcularPerimetro (double perimetro){
        perimetro = 2*pi*radio;
        System.out.println("El perímetro es: " + perimetro);
    }
    private void calcularArea(double area){
        area = pi * radio * radio;
        System.out.println("El área es: " + area);
    }

    @Override
    public void colorear(String color) {
        System.out.println();
    }
}
