package Practica4;

public class Cuadrado extends Geometria implements Coloreable{
    protected Double lado;

    private void calcularArea(double area){
        area = lado * lado;
        System.out.println("El área es: " + area);
    }
    private void calcularPerimetro (double perimetro){
        perimetro = lado * 4;
        System.out.println("El perímetro es: " + perimetro);
    }

    @Override
    public void colorear(String color) {

    }
}
