package HerenciaAMH;

import HerenciaAMH.Abuela;
import HerenciaAMH.Hija;
import HerenciaAMH.Madre;

public class Main {
    public static void main(String[] args){
        //Estoy creando un objeto de tipo abuela y vamos a usar setters para asignarle valores.
        Abuela abuela1 = new Abuela();
        abuela1.setNombre("Pepita");
        abuela1.setApellido("Rodriguez");
        abuela1.setEdad(63);
        abuela1.MostrarNombre();
        abuela1.MostrarNombre("Dominga");
        abuela1.MostrarApellido();
        abuela1.MostrarEdad();

        //Objeto de tipo madre
        Madre madre1 = new Madre();
        madre1.setNombre("Carmen");
        madre1.setApellido("Consuelo");
        madre1.setEdad(38);
        madre1.MostrarNombre();
        madre1.MostrarNombre("Rosario");
        madre1.MostrarApellido();

        //Objeto de tipo hija
        Hija hija1 = new Hija();
        hija1.setNombre("Josso");
        hija1.setApellido("ssoidknk");
        hija1.setEdad(15);
        hija1.MostrarNombre();
        hija1.MostrarNombre("sajbfsbdjf");
        hija1.MostrarApellido();


    }

}