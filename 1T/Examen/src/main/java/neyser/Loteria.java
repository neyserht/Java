package neyser;

import java.util.Random;
import java.util.Scanner;

public class Loteria
{

    // Creación de variables
    // Creación de matriz de billetes
    Integer[] billetes = new Integer [50];
    String[] clientes = new String [50];
    Integer[] premios = new Integer [3];
    Integer minimo = 1;
    Integer maximo = 99999;
    Scanner sc1 = new Scanner(System.in);
    String cliente = "";


    //Métodos

    public String preguntarCR(String consulta){
        System.out.println(consulta);
        String respuesta = sc1.nextLine();
        return respuesta;
    }
    public void preguntarSR(String consulta){
        System.out.println(consulta);
        String respuesta = sc1.nextLine();
    }


    public void menuPrincipal(){

        System.out.println("Bienvenido, elija una de las siguientes opciones:");
        System.out.println("¿Cual es su nombre?");
        cliente = sc1.nextLine();
        menuCliente();
    }
    public void menuCliente(){
        String opcion;
        System.out.println("Bienvenido, elija una de las siguientes opciones:");
        System.out.println("A) Comprar Billete\tB) Inicia Sorteo\tC) Finalizar Aplicación\tD) Mosrar Billetes");
        opcion  = sc1.nextLine();
        seleccionarOpcion(opcion);
    }

    public void menuSalida(){
        String opcion;
        System.out.println("Bienvenido, elija una de las siguientes opciones:");
        System.out.println("A) Nuevo sorteo\tB) Sali de la aplicacion");
        opcion  = sc1.nextLine();
        seleccionarOpcion(opcion);
    }
    public void seleccionOpcionSalida(String opcion){
        switch (opcion){
            case "a":
                menuPrincipal();
                break;
            case "b":
                System.exit(0);
            default:
        }
    }



    public void seleccionarOpcion(String opcion){
        switch (opcion){
            case "a":
                comprarBillete();
                menuCliente();
                break;
            case "b":
                iniciarSorteo();
                //mostrarBilletes();
                mostrarPremios();
                System.out.println("Comprados: "+billetesComprados());
                menuSalida();
                break;
            case "c":
                System.exit(0);
                break;
            case "d":
                mostrarBilletes();
                mostrarPremios();
                menuCliente();
                break;
            default:
        }
    }

    // Generación de números aleatorios
    public int generarAleatorio(int min, int max)
    {
        Random random = new Random();
        return random.nextInt(min,max);
    }

    public void comprarBillete(){

        compra:
        while (billetes.length!=billetesComprados()){
            Integer billete = generarAleatorio(minimo, maximo);
            if (!existeBillete(billete, billetes)){
                for (int i = 0; i < billetes.length; i++) {
                    if (billetes[i]==null)
                    {
                        billetes[i] = billete;
                        clientes[i] = cliente;
                        System.out.println(cliente +" tu billete comprado es: "+billete);
                        break compra;
                    }
                }
            }
        }
    }

    public Boolean existeBillete(int num, Integer[] matriz){
        Boolean respuesta = false;
        for (int i = 0; i < matriz.length; i++) {

            if(matriz[i]!=null){
                if (num==matriz[i])
                {
                    respuesta = true;
                    break;
                }
            }
        }
        return respuesta;
    }

    public void mostrarBilletes(){
        for (int i = 0; i<billetes.length; i++)
        {
            if (billetes[i]!=null)
            {
                System.out.println((i+1)+") Cliente: "+clientes[i]+" Billete Nº"+billetes[i]+" ");
            }

        }
    }

    public void mostrarPremios(){
        for (int i = 0; i<premios.length; i++)
        {
            //if (premios[i]!=null)
            {
                System.out.println((i+1)+") Billete Ganador Nº"+premios[i]+" ");
            }

        }
    }

    public Integer billetesComprados(){
        int contador = 0;
        for (int i = 0; i < billetes.length; i++) {
            if (billetes[i]!=null)
            {
                contador++;
            }
        }
        return contador;
    }

    public void iniciarSorteo(){
        Integer contador = 0;
        System.out.println("Iniciado Sorteo con "+billetesComprados()+" billetes");

            sorteo:
            while (contador!=4){

                Integer pos = generarAleatorio(0, billetesComprados()-1);
                if (!existeBillete(billetes[pos], premios)){
                    for (int i = 0; i < premios.length; i++) {
                        premios[i] = billetes[generarAleatorio(0, billetesComprados()-1)];
                        //System.out.println("El Ganador "+ clientes[pos]+" Nº"+ billetes[pos]);

                        //break;
                    }
                    contador++;
                }



            }




    }


}
