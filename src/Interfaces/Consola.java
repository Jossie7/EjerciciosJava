package Interfaces;
//Hemos creado nuestra nueva clase llamada Consola y de igual manera va estar implementada por Imprimible.
public class Consola implements Imprimible,Borrable{
    //Hemos creado el campo llamado pantalla.
    //Hemos inicializado nuestra variable con el símbolo "$", este es el que nos va a salir por defecto.
    private String pantalla="$";


    @Override
    public void imprime() {
        /**Nos va a imprimir el valor de pantalla en mayúscula, con el formato printf*
         * Pondremos "%S" para que salga en mayúscula*/
        System.out.printf("%S", pantalla + "\n");
    }

    @Override
    public void establecerContenido(String contenido) {
        System.out.println(contenido+  " " +pantalla);
    }
    public void Elimina(){
        System.out.println("***");
    }
}
