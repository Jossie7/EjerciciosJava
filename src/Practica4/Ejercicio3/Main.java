package Practica4.Ejercicio3;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [] arrayAleatorio = numerosAleatorios(100);
        System.out.println(Arrays.toString(arrayAleatorio));
        System.out.println("El número máximo del array es: " + numeroMaximo(arrayAleatorio));
        System.out.println("El número mínimo del array es: " + numeroMinimo(arrayAleatorio));
        System.out.println("La suma del array es: " + sumaTotal(arrayAleatorio));
        System.out.println("El promedio del array es: " + mediaAritmetica(arrayAleatorio));
        reemplazarNumero(arrayAleatorio,6,15000);
        System.out.println(Arrays.toString(arrayAleatorio));

    }
    private static  int[] numerosAleatorios (int longitud){
        Random numeroaleatorio = new Random();
        int[] arrayAleatorio =new int[longitud];
        for (int i=0;i<longitud;i++){
            arrayAleatorio[i]=numeroaleatorio.nextInt(100);
        }

        return arrayAleatorio;
    }

    private static int numeroMaximo(int[] array){
        int maximo=0;
        for (int i=0;i<array.length;i++){
            if(array[i]>maximo){
                maximo=array[i];
            }
        }
        return maximo;
    }
    private static int numeroMinimo(int[] array){
        int minimo=100;
        for (int i=0;i<array.length;i++){
            if(array[i]<minimo){
                minimo=array[i];
            }
        }
        return minimo;
    }
    private static int sumaTotal(int[] array){
        int suma=0;
        for (int i=0;i<array.length;i++){
            suma += array[i];
        }
        return suma;
    }
    private static int mediaAritmetica(int[] array){
        int promedio=0;
        int suma=0;
        for (int i=0;i<array.length;i++){
            suma += array[i];
        }
        promedio = suma/array.length;
        return promedio;
    }

    private static void reemplazarNumero(int[] array, int posicionCambiante, int numeroAlQueSeVaCambiar){
        System.out.println("El número que se va a cambiar es: " + array[posicionCambiante]);
        array[posicionCambiante]=numeroAlQueSeVaCambiar;
        System.out.println("El número cambiado es: " + array[posicionCambiante]);

    }
}
