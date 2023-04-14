package neyser;

public class Main {
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("123456789-Z",1500);
        empleado1.getEmpleado();

        System.out.println("----------------------");
        
        Empleado empleado2 = empleado1;
        empleado2.setSalario(7000);
        empleado2.getEmpleado();
        empleado1.getEmpleado();


    }
}