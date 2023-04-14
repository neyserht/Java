package neyser;

public class Main {

    public static void duplicar(int arg1)
    {
        arg1=arg1*2;
        System.out.println("arg1: "+arg1);
    }

    public static void main(String[] args)
    {
        int v1 = 10;
        System.out.println("v1: "+v1);
        duplicar(v1);
        System.out.println("v1: "+v1);
    }
}