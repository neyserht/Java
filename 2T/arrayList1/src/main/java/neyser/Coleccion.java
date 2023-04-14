package neyser;
import java.util.*;

public class Coleccion
{
    private List<String> animales = new ArrayList<>();

    public void setAnimal(String animal)
    {
        // Añade en la última posición libre
        animales.add(animal);
    }

    public void removeAnimal(String animal)
    {
        // Elimina el valor indicado
        animales.remove(animal);
    }

    public void getAnimales()
    {
        // Muestra todos los datos con su estuctura
        System.out.println(animales);
    }

    public void getAnimales2()
    {
        // Muestra todos los datos sin su estructura
        animales.forEach((n)-> System.out.println(n));
    }

    public void getAnimal(int indice)
    {
        // Muestra el dato de la posicion indicada con Base en 0
        System.out.println(animales.get(indice));
    }

    public void getNumeroAnimales()
    {
        // Muestra el número de elementos almacenados
        System.out.println(animales.size());
    }

}
