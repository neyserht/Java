package neyser;

public class Clase1
{
    public void metodo1(String... args)
    {
        for (String arg: args)
        {
            System.out.println(arg);
        }
    }

    public void metodo2(Integer... agrs)
    {
        Integer suma =0;
        for (Integer arg: agrs)
        {
            suma+=arg;
        }
        System.out.println("La suma total es: "+suma);
    }
}
