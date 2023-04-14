package neyser;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        List<String> planetas1 = new ArrayList<>();
        planetas1.add("Marte");
        planetas1.add("Marte");
        planetas1.add("Venus");
        planetas1.remove("Marte");
        planetas1.remove(0); // Elimina Venus que ahora estaba en la posición 0
        planetas1.add("Marte");
        planetas1.add("Venus");
        planetas1.add("Jupiter");
        System.out.println(planetas1); // Devuelve con la estructura [Marte, Venus]
        planetas1.forEach((n)-> System.out.println(n)); // Devuelve en diferentes líneas los planetas1

        List<String> planetas2 = new ArrayList<>();
        planetas2.add("Marte");
        planetas2.add("Venus");

        planetas1.retainAll(planetas2); // Eliminar en el primer ArrayLis los datos que no esten en el segundo

        System.out.println("");
        System.out.println(planetas1);
        System.out.println(planetas2);





    }
}