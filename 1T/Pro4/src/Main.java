
import java.io.PrintStream;
import java.util.Scanner;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Main {
    public static void main(String[] args)
    {

        // Como representar caracteres especiales (tildes, diéresis, etc)
        PrintStream out = new PrintStream(System.out, true, UTF_8);

        String respuesta;
        Scanner sc1 = new Scanner(System.in);
        boolean i = false;

                do
        {
            out.println("¿La revolución de Octubre fue en Octubre?: (si o no) ");
            respuesta = sc1.nextLine().toLowerCase();

            if (respuesta.isEmpty()) {
                System.out.println("Debe escribi algo");
                if (respuesta.trim().equalsIgnoreCase("si".trim())) {
                    System.out.println("NO, lo setimos, fue e noviembre");
                    i = true;
                } else if (respuesta.trim().equalsIgnoreCase("no".trim())) {
                    System.out.println("Correcto, fue e noviembre");
                    i = true;
                }
            } else{
                if (respuesta.trim().equalsIgnoreCase("si".trim())) {
                    System.out.println("NO, lo setimos, fue e noviembre");
                    i = true;
                } else if (respuesta.trim().equalsIgnoreCase("no".trim())) {
                    System.out.println("Correcto, fue e noviembre");
                    i = true;
                }
            }

        }
        while (i==false);
        {
            sc1.close();
        }








        /*

        // Solicitud de monumento y quitar tíldes a respuesta:
        System.out.println("Escribir el monumento más famoso de "+ciudad);
        String monumento = sc1.nextLine().toLowerCase();
        monumento = Normalizer.normalize(monumento,Normalizer.Form.NFD);
        monumento = monumento.replaceAll("[^\\p{ASCII}]", "");

        // Quitar tildes a monumentos asignados
        String m1 = "La puerta de Alcalá";
        m1 = Normalizer.normalize(m1,Normalizer.Form.NFD);
        m1 = m1.replaceAll("[^\\p{ASCII}]", "");

        String m2 = "El Miguelete";
        m2 = Normalizer.normalize(m2,Normalizer.Form.NFD);
        m2 = m2.replaceAll("[^\\p{ASCII}]", "");

        String m3 = "La Alhambra";
        m3 = Normalizer.normalize(m3,Normalizer.Form.NFD);
        m3 = m3.replaceAll("[^\\p{ASCII}]", "");

        String respuesta = "Respuesta correcta";
        String error = "Error, la respuesta es: ";

        switch (ciudad){
            case "madrid":
                if (monumento.equalsIgnoreCase(m1) ) {
                    System.out.println(respuesta);
                } else {
                    System.out.println(error+m1);
                }
                break;
            case "valencia":
                if (monumento.equalsIgnoreCase(m2) ) {
                    System.out.println(respuesta);
                } else {
                    System.out.println(error+m2);
                }
                break;
            case "granada":
                if (monumento.equalsIgnoreCase(m3) ) {
                    System.out.println(respuesta);
                } else {
                    System.out.println(error+m3);
                }
                break;
            default:
                System.out.println(error);
        }

        sc1.close();
        */

    }
}