package neyser;

import java.util.Scanner;

public class Suma {

    int num1, num2, suma;
    int numeros[] = new int[10];
    int contador = 0 ;
    int cantidad = 0;
    private Scanner teclado;
    private Scanner tecNumero = new Scanner(System.in);

    public void jugar(){
        cantPreguntas();


        mensaje("Cantidad de preguntas: "+cantidad);
        formulario();
        //convertir(preguntar());
        mensaje("La suma es: "+sumar());
    }

    private void cantPreguntas()
    {
        String cant = "";
        mensaje("¿Cuantos numeros se sumarán?");
        cantidad = tecNumero.nextInt();
    }

    private void formulario(){
        while (contador!=cantidad){
            convertir(preguntar());
        }
    }

    private String preguntar()
    {
        String respuesta;
        teclado = new Scanner(System.in);
        mensaje("Indicar digito # "+(contador+1));
        respuesta = teclado.nextLine();
        return respuesta;
    }

    private int convertir(String valor)
    {
        int numero = 0;
        try
        {
            numeros[contador] = Integer.parseInt(valor);
            contador++;
            return Integer.parseInt(valor);
        }
        catch (Exception e)
        {
            mensaje("El valor " + valor + "no es válido.");
        }

        return numero;
    }

    private int sumar()
    {

        int suma =0;
        for (int a : numeros) {
            suma+=a;
        }
        return suma;
    }

    public void mensaje(String texto)
    {
        System.out.println(texto);
    }

}
