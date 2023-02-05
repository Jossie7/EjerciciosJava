package Interfaces;
//Creamos la clase TestImpresiones, la cual tendrá el método main.

public class TestImpresiones {
    public static void main(String[] args) {
        //Creamos los objetos:
        Impresora impresora1= new Impresora();
        Consola consola1 = new Consola();
        //9. Creamos el objeto tipo Imprimible:
        Imprimible imprimible1 = new Imprimible() {
            //Ya que en el ejercicio 8 Imprimible heredó de Borrable, se puede utilizar el método "Elimina".
            @Override
            public void Elimina() {

            }
            @Override
            public void imprime() {

            }
            @Override
            public void establecerContenido(String contenido) {

            }
        };
        // Se imprime el contenido por defecto
        impresora1.imprime();
        //Se imprime el contenido después de haber sido eliminado
        impresora1.Elimina();
        //Se imprime el contenido después de darle un contenido de tipo cadena.
        impresora1.establecerContenido("esto es un test");
        consola1.imprime();
        consola1.Elimina();
        consola1.establecerContenido("Esto es un test");
        imprimible1.imprime();
        //Si no hacíamos el ejercicio 8, pues el método Elimina no podría ejecutarse ya que no teníamos  acceso a la interfaz Borrable.
        imprimible1.Elimina();
        imprimible1.establecerContenido("Esto es un test");

    }
}
