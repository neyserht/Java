package com.neyser.com;
public class Main {
    public static void main(String[] args)
    {
        Empleado e1 = new Empleado("123456789-Z",TURNO.DIARIO, JORNADA.MANANA);
        String emp1 = e1.getEmpleado();
        System.out.println(emp1);

        JORNADA[] j1 = new JORNADA[3];
        j1[0] = JORNADA.MANANA;

    }
}