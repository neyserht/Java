package pe.neyser.work;

import static paquete2.Clase2.*;

public class Main {
    public static void main(String[] args) {

        Elector elector1 = new Elector("Jose",20);
        elector1.presentar();
        elector1.evaluarEdad();

        System.out.println(saludos);

    }
}
