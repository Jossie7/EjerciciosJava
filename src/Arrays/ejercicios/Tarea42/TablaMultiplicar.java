package Arrays.ejercicios.Tarea42;

import java.util.Arrays;

public class TablaMultiplicar {
    public static void main(String[] args) {
        //Creamos la matriz:
        int [][][] a = new int[10][10][3];
        for (int i=1; i <=10; i++){
            a [i-1] = multiplicarTabla(i);
        }
        mostrarTabla(a);
    }
    static int [][] multiplicarTabla(int n){
        int [][] tabla = new int [10][3];
        for (int i=0;i<tabla.length;i++){
            tabla[i][0]=n;
            tabla [i][1]=i+1;
            tabla [i][2]=n*tabla[i][1];
        }
        return tabla;
    }

    static void mostrarTabla (int [][][] tablita){
        for(int i=0; i< tablita.length;i++){
            System.out.println("Tabla del " + (i+1) + " : ");
        for (int j=0;j<tablita[i].length; j++){
            System.out.println(Arrays.toString(tablita[i][j]));
        }

        }
    }
}
