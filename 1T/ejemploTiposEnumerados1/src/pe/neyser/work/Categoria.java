package pe.neyser.work;

public enum Categoria {

    JP("Jefe de Proyecto", 50000),
    AF("Analista Funcional",40000),
    AT("Analista Tecnico", 30000),
    AP("Analisa Programador",30000),
    PR("Pogamador",20000);

    private final String denominacion;
    private final int salario;
    // Constructor Tipo Enumerado
    private Categoria(String denominacion, int salario){
        this.denominacion = denominacion;
        this.salario = salario;
    }

    public String getDenominacion(){
        return denominacion;
    }
    public int getSalario(){
        return salario;
    }


}
