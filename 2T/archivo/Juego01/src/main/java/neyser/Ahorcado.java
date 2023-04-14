package neyser;

import java.util.Random;
import java.util.Scanner;

public class Ahorcado {

    String[] animales =
            {
                    "anaconda", "camaleon", "jaguar", "anguila", "cisne", "jirafa", "armadillo", "cocodrilo",
                    "lobo", "lechuza", "avestruz", "comadreja", "leon", "ballena", "conejo", "mapache", "cotorra",
                    "elefante", "mono", "bisonte", "gorila", "puma", "guepardo", "sapo", "bufalo", "halcon", "serpiente",
                    "perro", "gato", "loro"
            };
    String[] letras = new String[20];
    String[][] palabraM = new String[2][20];
    String palabra = "";
    String [][] test =
            {
                    {"c","i","s","n","e"},
                    {"_","_","_","_","_"}
            };

    Random random1 = new Random();
    int posicion = 0;
    int longitud = 0;
    int contador = 0;
    int intentos = 0;
    public void jugar(){
        posicion = aleatorio(0, animales.length);
        palabra = animales[posicion];
        longitud = palabra.length();
        // mensaje(palabra);
        // System.out.println(guiones(longitud));

        crearPalabra();

        for (int i = 0; i < longitud; i++) {
            if (palabraM[1][i].equalsIgnoreCase("_")){
                contador++;
            }
        }

        while (!verificar()){
            mensaje("Adivina la palabra, Introduce una letra");
            validarLetra();

            for (int i = 0; i < longitud; i++) {
                System.out.print(palabraM[1][i]);
            }
            System.out.println("");
            //dibujo();
        }
        if (verificar()){
            mensaje("Termino el juego con "+intentos + " intentos fallidos");
        }

    }
    public int aleatorio(int min, int max){
       return random1.nextInt(min, max);
    }
    private void mensaje(String texto){
        System.out.println(texto);
    }
    private String entradaDeDatos(){
        Scanner sc1 = new Scanner(System.in);
        return sc1.nextLine();
    }
    
    private void crearPalabra(){
        for (int i = 0; (i <longitud ); i++) {
            palabraM[0][i]= palabra.substring(i,i+1);
            palabraM[1][i] = "_";
        }
    }
    private void validarLetra(){
        String digito = entradaDeDatos();
        int correcto = 0;

        for (int i = 0; i < longitud; i++) {
            if (palabraM[0][i].equalsIgnoreCase(digito)){
                palabraM[1][i]=digito;
                correcto++;
            }
        }

        if (correcto==0){
            intentos++;
        }
    }

    public String guiones(int longitud){
        int i = 0;
        String texto = "";
        while(longitud != i){
            texto += "_";
            i++;
        }
        System.out.println(i);
        return texto;
    }

    private boolean verificar(){

        int resultado = 0;
        for (int i = 0; i < longitud; i++) {
            if (palabraM[0][i].equalsIgnoreCase(palabraM[1][i]))
                resultado++;
        }

        if (resultado==longitud){
            return true;
        } else {
            return false;
        }

    }

    /*
    private void dibujo(){
        mensaje("+--+");
        mensaje("|  |");
        mensaje("|  0");
        mensaje("| /|\\");
        mensaje("| / \\");
        mensaje("|");
    }
    */


}
