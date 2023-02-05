package Interfaces;
//Voy a crear la interfaz llamada imprimible

/**8. Hacemos que imprimible herede de borrable. ¿Sigue funcionando igual?
 * Pues sí, ya que una interfaz puede heredar de varias interfaces; en cambio,
 * una clase solo puede heredar de una sola clase.
 */

public interface Imprimible extends Borrable{
    //He creado la constante llamado texto_por_defecto, la cual hemos inicializado con el valor "página de prueba".
    final static String texto_por_defecto = "Página de prueba";
    // Y ahora crearemos el método imprime, que no tenga parámetros y que no va a devolver nada.

    void imprime();
    //Crearé un nuevo método:
    void establecerContenido(String contenido);
}
