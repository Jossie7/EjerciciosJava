package UT5.ejercicios.Map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Integer[] numeros = {1,6,98,45,754,95,6,45};
        contarNumeros(numeros);
        

    }
    //Estamos creando el mapa, y all mapa tiene 2 elementos el primero siempr será Integer.
    //El primero será la clave, en este caso será los números del array y el segundo valor será cuántas veces se repite.
    public static void contarNumeros (Integer [] array){
        Map <Integer,Integer> mapa = new TreeMap<>();
        for(int i=0;i<array.length;i++){
            int numero = array[i];
            if(mapa.containsKey(numero)){
                int contador=mapa.get(numero);
                contador++;
                mapa.put(numero,contador);
            }
            else mapa.put(numero,1);
        }


        // Mostrar elementos del mapa:
        Iterator <Integer> it = mapa.keySet().iterator();
        while (it.hasNext()){
            int numero=it.next();
            System.out.println("El número " + numero + " aparece " + mapa.get(numero) + " veces.");
        }


    }


}
