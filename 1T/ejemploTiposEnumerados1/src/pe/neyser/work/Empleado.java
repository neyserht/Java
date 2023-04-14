package pe.neyser.work;

public class Empleado {
    private String dni;
    private Turno turno;
    private Jornada jornada;
    private Categoria categoria;
    private Planetas planetas;

    public Empleado(String dni, Turno turno, Jornada jornada, Planetas planetas, Categoria categoria){
        this.dni = dni;
        this.turno = turno;
        this.jornada = jornada;
        this.planetas = planetas;
        this.categoria = categoria;
    }

    public void getEmpleado(){
        System.out.println("DNI: "+dni);
        System.out.println("TURNO: "+turno);
        System.out.println("JORNADA: "+jornada);
        System.out.println("Planeta diametro: "+planetas.getDiametro());
        System.out.println("Planeta masa: "+planetas.getMasa());
        System.out.println("CATEGORIA: "+categoria.getDenominacion());
        System.out.println("SALARIO: " + categoria.getSalario());
    }
}
