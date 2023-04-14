package plataforma;

import java.util.ArrayList;

public class Plataforma
{
    // Crear ArayList para almacenar productos existentes

    // Articulos articulo = new Articulos(1,"Gran Turismo",69.95,100);
    ArrayList<Articulos> articulos = new ArrayList<>();


    public void altaArticulos(int idArt, String nomArt, Double pvpArt, int uniArt)
    {
        Articulos articulo = new Articulos(idArt, nomArt, pvpArt, uniArt);
        articulos.add(articulo);
    }

    public void verArticulos()
    {
        for (Articulos articulo: articulos) {
            System.out.println("----------------------------------------------");
            System.out.println("Identificador del Articulo: "+articulo.getIdArt());
            System.out.println("Nombre del Articulo: "+articulo.getNomArt());
            System.out.println("PVP del Articulo: "+articulo.getPvpArt());
            System.out.println("Cantidades del Articulo: "+articulo.getUniArt());
            System.out.println("----------------------------------------------");
            System.out.println();
        }
    }

    public void verArticulo(int idArt){
        boolean existeArticulo =false;
        for (Articulos articulo: articulos) {

            if (articulo.getIdArt()==idArt){
                System.out.println("----------------------------------------------");
                System.out.println("Identificador del Articulo: "+articulo.getIdArt());
                System.out.println("Nombre del Articulo: "+articulo.getNomArt());
                System.out.println("PVP del Articulo: "+articulo.getPvpArt());
                System.out.println("Cantidades del Articulo: "+articulo.getUniArt());
                System.out.println("----------------------------------------------");
                existeArticulo = true;
            }
        }
        if(existeArticulo==false){
            System.out.println("----------------------------------------------");
            System.out.println("Actualmente el identificador  del Articulo  no corresponde a articulo alguno");
            System.out.println("----------------------------------------------");
        }
    }




}
