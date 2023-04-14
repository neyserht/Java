package neyser;

import paquete1.Empleado;

public class Main {
    public static void setEmpleado(Empleado emp, String nombre1, String puesto1)
    {
        emp.nombre = nombre1;
        emp.puesto = puesto1;
    }
    public static void main(String[] args)
    {
        Empleado emp1 = new Empleado();
        emp1.nombre = "Patricia";
        emp1.puesto = "Abogada";
        emp1.getEmpleado();
        setEmpleado(emp1, "Javier","Ingeniero");
        emp1.getEmpleado();
        System.out.println();

        Empleado emp2 = new Empleado();
        emp1.nombre = "Luisa";
        emp1.puesto = "Interiorista";
        emp1.getEmpleado();
        setEmpleado(emp2, "Zacarias","Jugador de poker profesional");
        emp2.getEmpleado();

        int val1 = 2;
        int val2 = 0;


        try {
            int div = val1/val2;
            System.out.println(div);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}