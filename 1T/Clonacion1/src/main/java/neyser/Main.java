package neyser;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Empleado emp1 = new Empleado("123456789-A",1500);
        Empleado emp2 = (Empleado) emp1.clone();
        emp1.setSalario(2000);
        emp1.getEmpleado();
        emp2.getEmpleado();

    }
}