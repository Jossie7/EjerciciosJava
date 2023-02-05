package Arrays.ejercicios.Tarea43;

import Arrays.ejercicios.Array;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [] arrayAleatorio =crearArrayAleatorio(5);
        int [] arrayAleatorio2 = crearArrayAleatorio(5);
        int [][] arrayClone = new int[4][0];
        System.out.println(Arrays.toString(arrayAleatorio));
        System.out.println(mostrarArrayDescendente(arrayAleatorio));
        System.out.println(arrayOrdenado(arrayAleatorio));
        System.out.println(buscarNumero(arrayAleatorio, 9));
        System.out.println(buscarNumeroBinarySearch(arrayAleatorio,15));
        comparacionArrays(arrayAleatorio,arrayAleatorio2);
        copiarConClone( arrayClone, arrayAleatorio);
        copiarConCopyOf(arrayClone,arrayAleatorio);
        copianConCopyOfRange(arrayClone, arrayAleatorio);
        copianConSystemArraycopy(arrayClone,arrayAleatorio);
        enseñarArray(arrayClone);

    }
    //Ejercicio 1:
    static int [] crearArrayAleatorio(int longitud){
    Random aleatorio = new Random();
    int [] arrayAleatorio = new int[longitud];
    for (int i =0;i<arrayAleatorio.length;i++){
        arrayAleatorio [i] = aleatorio.nextInt(50);
    }
    return arrayAleatorio;
    }
    //Ejercicio 2:
    static String mostrarArrayDescendente (int [] ArrayAnterior){
        for(int i=ArrayAnterior.length-1;i>=0;i--){
            System.out.print(ArrayAnterior[i] + " ");
        }
        return "Este es el array invertido S:";
    }
    //Ejercicio 3:
    static String arrayOrdenado (int [] a){
        Arrays.sort(a);
        return Arrays.toString(a);
    }
    //Ejercicio 4:
    static String buscarNumero (int [] x, int buscar){
        for (int i=0; i<x.length; i++){
            if(buscar==x[i]){
                return "El número está en la posición: " + i;
            }
        }
        return "El número no está. ";
    }
    static  String buscarNumeroBinarySearch(int [] x, int buscar){
        return "El número en una búsqueda binario está en " + Arrays.binarySearch(x,buscar);
    }
    //Ejercicio 5:
    static void comparacionArrays(int [] x, int [] y){
        System.out.println(Arrays.equals(x,y));
    }
    //Ejercicio 6:
    //6.1: Clone:
    static void copiarConClone (int [][] arraycopia, int [] original){
        arraycopia [0] =original.clone();
        System.out.println(Arrays.toString(arraycopia[0]) + " ");
    }
    //6.2: Cloneof:
    static  void copiarConCopyOf (int [][] Copia, int [] original ){
        Copia [1] =Arrays.copyOf(original, original.length);
        System.out.println( Arrays.toString(Copia[1] ) + " ");
    }
    //6.3 Con CopyofRange :
    static void copianConCopyOfRange (int [][] Copia, int [] original ) {
        Copia [2] = Arrays.copyOfRange(original, 0, original.length);
        System.out.println( Arrays.toString(Copia [2] ) + " ");
        }
    //6.4  System.arraycopy:
    static void copianConSystemArraycopy (int [][] Copia, int [] original ) {
        int[] arraySystemCopy = new int[4];
        System.arraycopy(original, 0, arraySystemCopy, 0, Copia.length);
        Copia[3] = arraySystemCopy;
        System.out.println(Arrays.toString(Copia[3]));
    }
    private static void enseñarArray(int[][] arrayClon){
        System.out.println(Arrays.toString(arrayClon[0]) + " " + (Arrays.toString(arrayClon[1]) + " " + (Arrays.toString(arrayClon[2]) + " " + (Arrays.toString(arrayClon[3])))));
    }
}
