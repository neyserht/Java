package com.neyser.work;

import java.util.Scanner;

public class Transporte {

    String partida = "";
    String destino = "";

    String[][][] transportes = {
            {{"B1"},{"a", "d", "f", "h", "i", "k"},{"2"}},
            {{"B2"},{"b", "c", "e", "h", "j", "m"},{"2"}},
            {{"B3"},{"k", "e", "f", "d", "b", "a"},{"2"}},
            {{"M1"},{"e", "x", "w", "g", "y", "z"},{"1.5"}},
            {{"M2"},{"a", "c", "h", "g", "m", "i"},{"1.5"}},
            {{"M3"},{"m", "h", "k", "ñ", "j", "b"},{"1.5"}}
    };

    public String getPartida() {
        return partida;
    }

    public String getDestino() {
        return destino;
    }

    public void preguntar(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Indicar la partida");
        partida = sc1.nextLine();
        System.out.println("Indicar el destino");
        destino = sc1.nextLine();
        sc1.close();
    }

    public void procesar(){
        //Declarar matrices para recibir transporte coincidentes en partida y destino
        String[][][] resultado_partida_fase1 = new String[transportes.length* transportes.length][3][];
        String[][][] resultado_destino_fase1 = new String[transportes.length* transportes.length][3][];


        int val01 = 0;    // Partida
        int val02 = 0;    // Destino

        int contador_partida = 0;
        int contador_destino = 0;

        System.out.println();
        System.out.println("##################################");
        System.out.println("######### Resultado "+partida.toUpperCase()+"-"+destino.toUpperCase()+" ##########");
        System.out.println("TIPO\tLINEA\tPRECIO\tTRANSBORDO");

        for (String[][] i: transportes){
            String[][][] partida_temporal = new String[1][3][];
            String[][][] destino_temporal = new String[1][3][];

            for (String[] j: i){
                for (int k = 0; k < j.length; k++) {
                    if (j[k].equalsIgnoreCase(getPartida())){
                        val01 = 1;
                        partida_temporal[0] = i;
                    }
                }
                for (int k = 0; k < j.length; k++) {
                    if (j[k].equalsIgnoreCase(getDestino())){
                        val02 = 1;
                        destino_temporal[0] = i;
                    }
                }
            }

            if (val01==1 & val02==1){
                System.out.println("Directo\t"+i[0][0]+"\t\t"+Double.parseDouble(i[2][0])+"€\t\t-");
            } else if (val01==1 & val02!=1) {
                resultado_partida_fase1[contador_partida++] = partida_temporal[0];
            }
            else if (val01!=1 & val02==1) {
                resultado_destino_fase1[contador_destino++] = destino_temporal[0];
            }
            val01 = 0;
            val02 = 0;

            // Resetear valores temporales de matrices partida y destino
            partida_temporal[0] = null;
            destino_temporal[0] = null;
        }

        //Crear matrices de partida y destino despreciando los null
        String[][][] resultado_partida_fase2 = new String[contador_partida][3][];
        String[][][] resultado_destino_fase2 = new String[contador_destino][3][];

        //Llenar informacion a matrices finales (Fase1 -> Fase2)
        for (int i = 0; i < contador_partida; i++) {
            resultado_partida_fase2[i] = resultado_partida_fase1[i];
        }

        for (int i = 0; i < contador_destino; i++) {
            resultado_destino_fase2[i] = resultado_destino_fase1[i];
        }

        //Combinar las partidas con los destino 1 a 1 y verificar si existe alguna parada en comun

        for (int i = 0; i < resultado_partida_fase2.length; i++) {
            for (int j = 0; j < resultado_destino_fase2.length; j++) {
                comparacion01(resultado_partida_fase2[i], resultado_destino_fase2[j]);
            }
        }
        System.out.println("##################################");
        System.out.println(transportes.length);
    }

    private void comparacion01(String[][] a, String[][] b){

        Double importe = (Double.parseDouble(a[2][0]) +Double.parseDouble(b[2][0]));

        e01:
        for (int i = 0; i <a[1].length ; i++) {
            for (int j = 0; j <b[1].length ; j++) {
                if (a[1][i].equalsIgnoreCase(b[1][j])){
                    System.out.println("Mixto\t"+a[0][0]+"-"+b[0][0] + "\t"+importe+"€\t\t"+a[1][i]);
                    //break e01;
                }
            }
        }

    }

}
