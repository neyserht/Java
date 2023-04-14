package pe.neyser.work;

public class Personas {

    private String nombre = null;
    private String dni = null;
    private String domicilio = null;

    // Constructor
    public Personas(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    @Override
    public String toString() {
        return "Personas{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", domicilio='" + domicilio + '\'' +
                '}';
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
}
