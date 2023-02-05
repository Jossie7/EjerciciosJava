package Arrays.ejercicios;

public class Array {
    public static void main(String[] args) {
        int x=1;
        String s = "Hola";
        Double[] a = {1d, 2.5d,34.56d,null,0d};

        //En la impresión, tanto de String como de int,
        //no varían porque se toma una copia de la referencia y que se cambia del método pero no afecta al exterior.
        System.out.println(x);
        m(x);
        System.out.println(x);

        System.out.println(s);
        m(s);
        System.out.println(s);

        //En la impresión de los arrays, la referencia que se crea en el  método sobreescribre al método original.
        System.out.println(a[0]);;
        m(a);
        System.out.println(a[0]);
        System.out.println(a[(a.length/1)/2]);;
        m(a);
        System.out.println(a[(a.length/1)/2]);
        System.out.println(a[a.length-1]);;
        m(a);
        System.out.println(a[a.length-1]);
    }
    public static void m(int x){
        x++;
    }
    public static void m(String s){
        s=(s.toUpperCase());
    }
    public static void m(Double[]  a){
        a[0]++;
        a[((a.length-1)/2)]++;
        a[a.length-1]++;

    }
}