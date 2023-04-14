package com.neyser.com;

public class Empleado
{
    private String dni;
    private TURNO turno;
    private JORNADA jornada;



    public Empleado(String dni, TURNO turno, JORNADA jornada)
    {
        this.dni = dni;
        this.turno = turno;
        this.jornada = jornada;
    }

    public String getDni() {
        return dni;
    }

    public String getEmpleado() {
        return "Empleado{" +
                "dni='" + dni + '\'' +
                ", turno=" + turno +
                ", jornada=" + jornada +
                '}';
    }
}
