package neyser;

import java.util.Scanner;

public class Paciente {

    String[][][] enfermedades = {
            {{"Covid-19"},{"fiebre", "tos seca" ,"diarrea", "fatiga", "dolor muscular", "dolor abdominal"}},
            {{"Resfriado"},{"estornudo", "dolor muscular", "congestion" ,"dolor de gartanta"}},
            {{"Gripe"},{"fiebre", "fatiga", "seca" ,"diarrea", "tos seca", "dolor muscular", "dolor de cabeza","diarrea"}}
    };

    String

    String sintomas;
    String sc1;
    boolean parar;

    public void preguntar(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Bienvenido");
        if (parar){

        } else {
            System.out.println("Indicar cuales son sus sintomas");
            sintomas = sc1.nextLine();
        }
        sc1.close();
    }

}
