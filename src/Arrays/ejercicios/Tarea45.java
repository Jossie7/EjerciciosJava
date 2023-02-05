package Arrays.ejercicios;

import java.util.Arrays;

public class Tarea45 {
    public static void main(String[] args) {
        int [] a ={1,2,3,4,5};
        a= metodoInsertador(a,7,2);
        System.out.println(Arrays.toString(a));

        a= cambiarParImpar(a);
        System.out.println(Arrays.toString(a));

    }
    //Ejercicio 1
    static int [] metodoInsertador (int [] arrayEntero, int numeroElemento, int Posicion){
        int [] arrayYaInsertado=new int[arrayEntero.length+1];
        for(int i=0;i<Posicion; i++) {
        arrayYaInsertado [i] = arrayEntero [i];
        }
        arrayYaInsertado[Posicion]=numeroElemento;
        for (int i=Posicion+1; i<arrayEntero.length;i++){
        arrayYaInsertado[i]=arrayEntero[i-1];
        }
        return  arrayYaInsertado;
    }
    //Ejercicio 2: No sé cómo hacerlo, me confunde, perdón :(

    //Ejercicio 3:
    static int [] cambiarParImpar (int [] arrayEntrada){
        for (int i = 0; i < arrayEntrada.length; i++){
            if(i%2 == 0){
                int guardarpos = arrayEntrada[i];
                arrayEntrada[i] = arrayEntrada[i+1];
                arrayEntrada[i+1] = guardarpos;
        }
    }
        return arrayEntrada;
}
    }
