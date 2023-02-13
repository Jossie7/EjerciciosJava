package Practica4.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Geometria circulo1 = new Circulo(3d);
        Geometria circulo2= new Circulo(2d);
        Geometria triangulo1 = new Triangulo(2d,5d);
        Geometria triangulo2 = new Triangulo(3d,2d);
        Geometria cuadrado1 = new Cuadrado(10d);
        Geometria cuadrado2 = new Cuadrado(5d);

        Geometria [] figuras = {circulo1,circulo2,triangulo2,triangulo1,cuadrado1,cuadrado2};
    }
    private static double calculandoAreas(Geometria[] arrayParaCalcularAreas){
    double areaTotal=0;
    for(int i=0;i<arrayParaCalcularAreas.length;i++){
        areaTotal += arrayParaCalcularAreas[i].calcularArea();
    }
        return areaTotal;
    }
    private static double calculandoPerimetros(Geometria[] arrayParaCalcularPerimetros){
        double perimetroTotal=0;
        for(int i=0;i<arrayParaCalcularPerimetros.length;i++){
            perimetroTotal += arrayParaCalcularPerimetros[i].calcularPerimetro();
        }
        return perimetroTotal;
    }

}
