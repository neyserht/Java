package neyser;

public class Main
{
    static void verPersona(Persona usu)
    {
        System.out.println("Nombre: "+usu.getNombre());
        System.out.println("Apellidos: "+usu.getApellidos());
        System.out.println("Dirección: "+usu.getDireccion() + "\n");
    }

    public static void main(String[] args) {
        //V1 del constructor
        Persona p1 = new Persona();
        p1.setApellidos("Gil Martin");

        // V2 del constructor
        Persona p2 = new Persona("Jose","Garcia","Madrid");

        // V3 del constructor
        Persona p3 = new Persona(p2);
        p3.setNombre("Carlos");





        verPersona(p1);
        verPersona(p2);
        verPersona(p3);
        p1.setNombreApellidosDireccion(p3);
        verPersona(p1);

    }
}