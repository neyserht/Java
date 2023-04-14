package neyser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Estudiante {
    private int id;
    private String nombre;
    double[] calificaciones1 = new double[3];
    List<Double> calificaciones2 = new ArrayList<>();

    // Constructor
    public Estudiante(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCalificacion1 (Double calificacion)
    {
        for (int i = 0; i < calificaciones1.length; i++)
        {
            if(calificaciones1[i]==0)
            {
                calificaciones1[i] =calificacion;
                break;
            }
        }
    }

    public void setCalificacion2 (Double calificacion)
    {
        calificaciones2.add(calificacion);
    }

    public String getCalificaciones1()
    {
        return Arrays.toString(calificaciones1);
    }

    public String getCalificaciones2()
    {
        return calificaciones2.toString();
    }

    public double calcularPromedio1()
    {
        double suma = 0;
        for (Double calificacion : calificaciones1)
        {
            suma += calificacion;
        }
        return suma / calificaciones1.length;
    }

    public double calcularPromedio2()
    {
        double suma = 0;
        for (Double calificacion : calificaciones2)
        {
            suma += calificacion;
        }
        return suma / calificaciones2.size();
    }
}
