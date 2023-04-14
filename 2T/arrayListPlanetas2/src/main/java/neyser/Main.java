package neyser;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<Planeta> arrayPlanetas = new ArrayList<>();

        // Método 1 para añadir objeos al arraylist
        // Crear objetps y añadirlos a la ArraList
        arrayPlanetas.add(new Planeta("Tierra","Terrestre",6371));
        arrayPlanetas.add(new Planeta("Jupiter","Joviano",69911));

        // Método 2 para añadir objeos al arraylist
        // Crear Objetos
        Planeta planeta1 = new Planeta("Mercurio","Terrestre",2439);
        Planeta planeta2 = new Planeta("Saturno","Joviano",58232);
        arrayPlanetas.add(planeta1);
        arrayPlanetas.add(planeta2);

        // Mostrar el contenido completo de nuestra ArrayList
        for (Planeta planeta: arrayPlanetas)
        {
            System.out.println("Nombre del planeta:" + planeta.nombre);
            System.out.println("Tipo del planeta:" + planeta.tipo);
            System.out.println("Radio del planeta:" + planeta.radio);
            System.out.println();
        }

        arrayPlanetas.forEach((n)-> System.out.println("Nombre del Planeta: "+n.nombre));
        System.out.println();

        // Buscar si la ArayList contiene el nombre del planeta Jupiter
        for (Planeta planeta: arrayPlanetas)
        {
            boolean resultado = planeta.nombre.equalsIgnoreCase("Jupiter");
            if (resultado)
            {
                System.out.println("Nombre del planeta:" + planeta.nombre);
                System.out.println("Tipo del planeta:" + planeta.tipo);
                System.out.println("Radio del planeta:" + planeta.radio);
            }
        }



    }
}