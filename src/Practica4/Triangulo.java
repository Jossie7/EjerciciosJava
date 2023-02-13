package Practica4;

public class Triangulo implements Coloreable {
    protected Double base;
    protected Double altura;

    private void calcularArea(double area){
        area = (base * altura) / 2;
        System.out.println("El área es: " + area);
    }
    private void calcularPerimetro (double perimetro){
        perimetro = base * 3;
        System.out.println("El perímetro es: " + perimetro);
    }

    @Override
    public void colorear(String color) {

    }
}
