package neyser;

import java.util.Random;
import java.util.Scanner;

public class Juego
{
    private Random random1 = new Random();
    private int ale1=0;
    private int val1=0;

    public void jugar()
    {
        ale1 = aleatorio(1, 5);
        mensaje("Adivina el numero");
        evaluar();
    }

    private int aleatorio(int ini, int fin)
    {
        return random1.nextInt(ini, fin);
    }

    private void mensaje(String texto)
    {
        System.out.println(texto);
    }

    private int entradaDeDatos()
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private void evaluar()
    {
        int i = 0;
        while(i==0)
        {
            val1 = entradaDeDatos();
            if(ale1==val1)
            {
                mensaje("Enhorabuena");
                i++;
            }
            else if(ale1>val1)
            {
                mensaje("Es mayor");
            }
            else if(ale1<val1)
            {
                mensaje("Es menor");
            }
        }
    }
}
