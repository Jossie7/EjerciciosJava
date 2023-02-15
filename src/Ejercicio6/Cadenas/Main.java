package Ejercicio6.Cadenas;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    //TODO: imprimeLongitudCadena:
        imprimeLongitudCadena("El labrador labra la tierra");

//TODO: caracterEnPosicionEmpezandoEn1 dada la posición devolver el caracter que ocupa esa posición contando desde 1
caracteEnPosicionEmpezandoEn1("Pepita Perez quiere comer",5);


//TODO: cuentaOcurrenciasDeUnCaracter
        cuentaOcurrenciasDeUnCaracter("mama me mima", 'm');

//TODO: imprimeCadenasEnOrdenAlfabético imprime en orden alfabético las cadenas dadas por un array de cadenas,
// sin tener en cuenta si son mayúsculas o minúsculas.
        String [] cadena= {"Alicia", "El chapo", "Pablo Escobar", "Perez", "Domingo"};
        imprimeCadenasEnOrdenAlfabetico(cadena);
    //TODO: un método que dado un pequeño texto devuelva un array de cadenas codificando el texto, de modo que:

// - todas las vocales se sustituyan por un número: o --> 0, i --> 1, a --> 4, e --> 3, salvo la u que se cambia por v.
// - cada vez que aparezca el caracter punto (.) se corte esa frase y se meta en una posición del array.
// - la frase que se mete en cada posición del array tiene que estar sin espacios al principio ni al final.
        String texto = "La independencia del Perú se produjo en el año 1821. Sin embargo, no se ejecutó hasta el año 1822. En donde los mestizos quedaron  librs.";
        System.out.println(Arrays.toString(sustituirPorNumeros(texto)));
//TODO Convertir los siguientes números a String y posteriormente ordenarlos alfabéticamente de menor a mayor
    int[] numbers = {2,1,11,10};
        System.out.println(Arrays.toString(ConvertirNumerosString(numbers)));
    }

    static void imprimeLongitudCadena(String cadena){
        System.out.println(cadena.length());

    }
    static void caracteEnPosicionEmpezandoEn1(String cadena, int posicion){
        System.out.println(cadena.charAt(posicion -1 ));
    }
    static void cuentaOcurrenciasDeUnCaracter(String cadena, char caracter){
        int contador=0;
        for(int i=0;i<cadena.length();i++){
            if (caracter == cadena.charAt(i)){
                contador++;
            }
        }
        System.out.println(contador);
    }

    static void imprimeCadenasEnOrdenAlfabetico (String[] cadena){
        //El sort es para odenar alfabeticamente:
        Arrays.sort(cadena);
        System.out.println(Arrays.toString(cadena));
    }

    static String [] sustituirPorNumeros(String texto){
        // El método replace es para sustituir:
        String textoCodificado=texto.replace('a', '4').replace('e','3').replace('i','1')
                .replace('u','v').replace('o','0');
        // El método split es para cortar un array en el caracter que le demos.
        String [] arrayCodificado = textoCodificado.split("\\.");

        return arrayCodificado;
    }
    static String [] ConvertirNumerosString (int [] original){
        String [] convertido= new String[original.length];
        for (int i=0;i< original.length;i++){
            convertido[i] = String.valueOf(original[i]);
        }
        Arrays.sort(convertido);
        return convertido;
    }
}
