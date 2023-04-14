package pe.neyser.work;

public class Elector {

    private String nombre = null;
    private int edad = 0;

    public Elector(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void evaluarEdad(){
        String mensaje = "";
        if (getEdad() > 17) {
            mensaje = "El votante es mayor de edad";
        } else {
            mensaje = "El votante es menor de edad";
        }

        System.out.println(mensaje);
    }

    public void presentar(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Edad: "+getEdad());
    }

}
