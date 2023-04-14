package neyser;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class Persona
{   private String nombre;
    private Date fechaNacimiento;

    // Constructor
    public Persona(String nombre, Date fechaNacimiento)
    {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int calcularEdad1()
    {
        // Obtenemos la fecha actual
        Date fechaActual = new Date();

        // getTime obtine la fecha en milisegundos
        long diferenciaEnMillis = fechaActual.getTime() - fechaNacimiento.getTime();
        long diferenciaEnSegundos = diferenciaEnMillis / 1000;
        long diferenciaEnMinutos = diferenciaEnSegundos / 60;
        long diferenciaEnHoras = diferenciaEnMinutos / 60;
        long diferenciaEnDias = diferenciaEnHoras / 24;
        int edad = (int) (diferenciaEnDias / 365);
        return edad;
    }
    public int calcularEdad2()
    {
        // Obtenemos la fecha actual
        LocalDate fechaActual = new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fechaNac = fechaNacimiento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        // Evaluar la diferencia de años
        int edad =Period.between(fechaNac,fechaActual).getYears();
        System.out.println("Edad: "+edad);

        return edad;
    }

}
