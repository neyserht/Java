package neyser;

import java.util.Random;
import java.util.Scanner;

public class Sistema {

    int ale1 = 0;
    Scanner sc1 = new Scanner(System.in);
    private Random random = new Random();
    int respuesta = 0;

    public void jugar(){
        ale1 = aleatorio(1,10);
        System.out.println(ale1);
        mensaje("Adivina el número");
        respuesta = capurar();
        responder();
    }

    private int aleatorio(int min, int max){
        return random.nextInt(min, max);
    }

    private void mensaje(String pregunta){
        System.out.println(pregunta);
    }

    private void responder(){
        while (!verificar()){
            mensaje("Sigue adivinando!");
            respuesta = capurar();
        }
        if (verificar())
            System.out.println("Respueta Correcta!");
    }

    private int capurar(){
        return sc1.nextInt();
    }

    private boolean verificar(){
        boolean  resp = false;
        if (ale1==respuesta){
            return true;
        } else  {
            return false;
        }

    }

}
