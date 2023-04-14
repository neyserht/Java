package neyser;

public class Main {
    public static void main(String[] args)
    {
        // Alta del estudiante
        Estudiante estudiante1 = new Estudiante(1, "Javi");

        // Obtención y muestra del identificador del estudiante
        int id1 = estudiante1.getId();
        System.out.println("Ide del estudiante: " + id1);

        // Obtención y muestra del nombre del estudiante
        String nombre1 = estudiante1.getNombre();
        System.out.println("Nombre del estudiante: " + nombre1);

        // Asginación de calificación al estudiante
        estudiante1.setCalificacion2(7.0);
        estudiante1.setCalificacion2(5.5);
        estudiante1.setCalificacion2(8.0);

        // La cuarta calificación no se asigna

        // La matríz solo admite hasta tres notas
        estudiante1.setCalificacion2(10.0);

        // Muestra las calificaciones del estudiante
        System.out.println(estudiante1.getCalificaciones2());

        // Muestra el promedio del estudiante
        double promedio1 = estudiante1.calcularPromedio2();
        System.out.println("Promedio del estudiante: " + promedio1);


    }
}