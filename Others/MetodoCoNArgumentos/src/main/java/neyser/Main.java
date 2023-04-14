package neyser;

public class Main {
    public static void main(String[] args)
    {

        Clase1 c01 = new Clase1();
        c01.metodo1("val1");
        System.out.println();
        c01.metodo1("val1","val2");
        System.out.println();
        c01.metodo1(new String[]{"Valor1","Valor2","Valor3"});
        System.out.println();
        c01.metodo2(1,2,3,4,5);


    }
}