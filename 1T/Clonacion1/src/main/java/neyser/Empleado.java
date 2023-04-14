package neyser;

public class Empleado implements Cloneable{

    private String dni;
    private int salario;

    public Empleado(String dni, int salario){
        this.dni = dni;
        this.salario = salario;
    }

    public  void getEmpleado(){
        System.out.println("DNI: "+dni);
        System.out.println("Salario: "+salario);
    }

    public void setSalario(int salario){
        this.salario = salario;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
