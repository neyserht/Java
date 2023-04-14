package neyser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Escribir un número:");
        String val1 = sc1.nextLine();
        if (isNumeric(val1))
        {
            System.out.println("El valor es numérico");
        } else
        {
            System.out.println("El valor no es un número");
        }

    }

    public static boolean isNumeric(String numero)
    {
        boolean resultado = true;
        try {
            Double.parseDouble(numero);
        }catch (Exception e){
            resultado = false;
        }
        return resultado;
    }
}