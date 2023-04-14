package neyser;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {

        // Definición del formato de fecha y asignación de la fecha
        String patron1 = "dd-mm-yyyy";
        SimpleDateFormat formatoFecha1 = new SimpleDateFormat(patron1);
        Date fechaNacimiento1 = formatoFecha1.parse("28-10-2013");

        // Creación del objeto
        Persona persona1 = new Persona("Javi", fechaNacimiento1);

        // Llamada al método calcularEdad1
        int edad = persona1.calcularEdad2();
        System.out.println(edad + " años");

    }
}