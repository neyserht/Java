package neyser;

public class Persona
{
    private String nombre, apellidos, direccion;

    // Sobrecarga del constructor v1
    public Persona()
    {
        nombre = null;
        apellidos = null;
        direccion = null;
    }

    // Sobrecarga del constructor v2
    public Persona(String nombre, String apellidos, String direccion)
    {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
    }

    // Sobrecarga del constructor v3
    public Persona(Persona usu)
    {
        this.nombre = usu.getNombre();
        this.apellidos = usu.getApellidos();
        this.direccion = usu.getDireccion();
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }

    public void setApellidos(String apellidos){
        this.nombre = apellidos;
    }
    public String getApellidos(){
        return apellidos;
    }
    public void setDireccion(String direccion){
        this.nombre = direccion;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setNombreApellidosDireccion(Persona usu)
    {
        nombre = usu.getNombre();
        apellidos = usu.getApellidos();
        direccion = usu.getDireccion();
    }


}
