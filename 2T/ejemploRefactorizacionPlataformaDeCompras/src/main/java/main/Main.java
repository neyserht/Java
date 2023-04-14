package main;

import plataforma.Articulos;
import plataforma.Plataforma;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {

        Plataforma art1 = new Plataforma();
        art1.altaArticulos(1,"Gran Turismo",69.95,100);
        art1.altaArticulos(2,"Gran Turismo 2",89.95,200);
        art1.verArticulos();
        art1.verArticulo(3);
    }
}