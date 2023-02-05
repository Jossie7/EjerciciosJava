package Practica3.ej1;

public class MainCasa {
    public static void main(String[] args) {
        Casa casa1 = new Casa();
        casa1.setPrecio(952);
        casa1.setCatastral("IDIDIDI");
        casa1.setEnergía("Edelnor");
        casa1.MostrarPrecioConIva();
        casa1.MostrarPrecioConIvareducido();
        casa1.MostrarCatastral_Y_Precios();
    }

}
