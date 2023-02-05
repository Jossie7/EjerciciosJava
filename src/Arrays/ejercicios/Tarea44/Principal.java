package Arrays.ejercicios.Tarea44;
public class Principal {
    public static void main(String[] args) {
        //Vamos a crear a nuestras 3 personas:
        Persona p1= new Persona("Luis",18);
        Persona p2= new Persona("Carmen",30);
        Persona p3= new Persona("Jossie",19);

        //Vamos a crear nuestro array de tipo personas:
        Persona[] arrayPersonas = {p1,p2,p3};
        for (Persona p: arrayPersonas) {
            System.out.println(p);
        }
    }
}