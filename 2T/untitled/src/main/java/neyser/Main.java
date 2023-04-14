package neyser;

import java.util.ArrayList;

public class Main {

    static ArrayList<String> coleccionDeValores = new ArrayList();



    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        poblarColeccion();
        System.out.println("Resultado 1: "+contieneValor1(coleccionDeValores,"Valor1"));
        System.out.println("Resultado 2: "+contieneValor2(coleccionDeValores,"Valor1"));
    }

    public static boolean contieneValor1
            (ArrayList<String> coleccionDeValores, String datoDeBusqueda)
    {
        for (String valor: coleccionDeValores)
        {
            if (valor.equalsIgnoreCase(datoDeBusqueda))
            {
                return true;
            }
        }
        return false;
    }

    public static boolean contieneValor2
            (ArrayList<String> coleccionDeValores, String datoDeBusqueda)
    {
        boolean resultadoEvaluacion = false;
        for (String valor: coleccionDeValores)
        {
            resultadoEvaluacion = (valor.equalsIgnoreCase(datoDeBusqueda))?true:false;
        }
        return resultadoEvaluacion;
    }

    static void poblarColeccion(){
        coleccionDeValores.add("Valor1");
        coleccionDeValores.add("Valor2");
        coleccionDeValores.add("Valor3");
    }

}