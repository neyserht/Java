package neyser;

public class Empleado {

    private String dni;
    private int salario;

    public Empleado(String dni, int salario){
        this.dni = dni;
        this.salario = salario;
    }

    public String getDni() {
        return dni;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario){
        this.salario = salario;
    }

    public void getEmpleado(){
        System.out.println("DNI: "+dni);
        System.out.println("Salario: "+salario);
    }
}
