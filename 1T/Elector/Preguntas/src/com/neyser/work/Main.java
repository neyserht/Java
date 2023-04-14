package com.neyser.work;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declaración de Matriz bidimensional con preguntas y respuestas
        String[][] m1 = {
                {"¿1+1?","2"},
                {"¿Capital de España?","Madrid"},
                {"¿Cuantos Planetas existen?","8"},
                {"¿6*6?","36"},
                {"¿Capital de Italia?","Roma"}
        };

        // Declaración de variables
        Scanner sc1 = new Scanner(System.in);
        int puntaje = 0;

        // Recorrido de Matriz  validación de respuestas
        for (String[] fila:m1) {
            for (int i = 0; i < fila.length; ) {
                System.out.println(fila[i]);
                String respuesta = sc1.nextLine();
                if (respuesta.equalsIgnoreCase(fila[++i])){
                    puntaje++;
                }
                break;
            }
        }

        // Impresión de resultado
        System.out.println("Puntaje obtenido: "+ puntaje);

    }
}