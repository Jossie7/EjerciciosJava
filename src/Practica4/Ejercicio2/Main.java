package Practica4.Ejercicio2;

public class Main {
    public static void main(String[] args) {

        System.out.println(contarPalabras("Hola, cómo estás, mi nombre es pepita perez y tu nombre cuál es"));

    }
    private static int contarPalabras(String texto){
        int contador=0;
        //El "toLowerCase sirve para poner todito en minúscula"
        texto.toLowerCase();
        //El método split separa las palabras por el caracter que le digamos, en este caso será un espacio en blanco.
        String[] palabras = texto.split(" ");
        String[] palabrasDistintas = new String[palabras.length];
        for (String palabra : palabras) {
            if(!repetidaONo(palabrasDistintas, contador, palabra)){
                palabrasDistintas[contador]=palabra;
                contador++;
            }
        }

        return contador;

    }

    private static boolean repetidaONo (String[] palabras, int posicionActual, String palabra){
        boolean estaRepetida = false;
        for (int i=0;i<posicionActual;i++){
            if(palabras[i].equals(palabra)) {
                estaRepetida = true;
                break;
            }
        }

       return estaRepetida;
    }


}
