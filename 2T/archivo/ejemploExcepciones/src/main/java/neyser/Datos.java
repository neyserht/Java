package neyser;

import java.util.Scanner;

public class Datos
{
    private String nombre;
    private int edad;
    private Scanner teclado;
    private String dato;
    public void setDatos()
    {
        teclado = new Scanner(System.in);
        System.out.println("Indique su nombre");
        nombre = teclado.nextLine();
        System.out.println("Indique su edad");
        dato = teclado.nextLine();

        try
        {
            edad = Integer.parseInt(dato);
        }
        catch (Exception e)
        {
            System.out.println("Dato no permitido");
            edad = 0;
        }

        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: " + edad);

    }

}
