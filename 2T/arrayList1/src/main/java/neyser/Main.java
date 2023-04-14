package neyser;

public class Main {
    public static void main(String[] args)
    {
        Coleccion col01 = new Coleccion();
        col01.setAnimal("Gato");
        col01.setAnimal("perro");
        col01.setAnimal("Pato");
        col01.getAnimales();
        col01.getAnimales2();
        col01.removeAnimal("Perro");
        col01.getAnimales();
        col01.getAnimal(0);
        col01.getNumeroAnimales();
    }
}