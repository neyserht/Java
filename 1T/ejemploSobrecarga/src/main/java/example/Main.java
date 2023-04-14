package example;

public class Main {
    public static void main(String[] args)
    {

        Cuenta cuenta1 = new Cuenta(123);
        Cuenta cuenta2 = new Cuenta(456, 100);
        Cuenta cuenta3 = new Cuenta(789, 101,"Javier");

        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println(cuenta3);

    }
}