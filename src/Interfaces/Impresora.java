package Interfaces;
//Hemos creado la clase Impresora la cual está implementada por la interfaz Imprimible.
public class Impresora implements Imprimible,Borrable {


    /**Hemos creado un campo llamado página, la cual es tipo cadena.
    Y también va a ser igual que la varoable texto_por_defecto declarada en nuestra interfaz.*/
    private String pagina = texto_por_defecto;
    //Como se sabe, el método se sobreescribir de manera obligatoria.
    @Override
    public void imprime() {
        //Nos va a imprimir el valor de página.
        System.out.println(pagina);
    }

    @Override
    public void establecerContenido(String contenido) {
        System.out.println(contenido);
    }

    @Override
    public void Elimina() {
        System.out.println();
    }
}
