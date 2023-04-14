package neyser;

import java.util.Vector;

public class Main {
    public static void main(String[] args)
    {
        Vector<String> ciudades = new Vector<String>();
        //Añadir un elemento al vector
        ciudades.add("Madrid");
        ciudades.add("Paris");
        ciudades.add("Lima");
        //Añadir u elemento al vector en una determinada posición (base en 0)
        ciudades.add(1, "Roma");
        // ciudades.forEach((n)-> System.out.println(n));
        System.out.println(ciudades);
        // Sobreescribir un valor existente en el vector (base en 0)
        ciudades.set(1, "Berlin");
        System.out.println(ciudades);
        // Conocer la posición del indice de un valor del vector
        System.out.println("Posicin de Madrid: "+ciudades.indexOf("Berlin"));
        // Eliminar un elemento del vector
        ciudades.remove(1);
        System.out.println(ciudades);
        ciudades.remove("Paris");
        System.out.println();
        ciudades.forEach((n)-> System.out.println(n));
        // Recuperar un elemento del vector (base en 0)
        String ciudad = ciudades.get(0);
        System.out.println("Ciudad recuperada: "+ciudad);
        // Consular el númeo de elementos del vector:
        System.out.println("Elementos del vector: " + ciudades.size());
        // Eliminar vectores
        ciudades.clear();
        System.out.println("Elementos del vector: " + ciudades.size());
        System.out.println("Vectores vacios: " + ciudades.isEmpty());
    }
}