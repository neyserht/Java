package neyser;

public class Main {
    public static void main(String[] args) {

        Libros lib1 = new Libros("Juan Boscán",GeneroLiterario.POESIA,TipoEncuadernacion.RUSTICA_GRAPADA);
        Libros lib2 = new Libros("Garcilaso de la Vega",GeneroLiterario.ENSAYO,TipoEncuadernacion.CARTONE);
        Libros lib3 = new Libros("Pedro Calderón de la Barca",GeneroLiterario.BIOGRAFIA,TipoEncuadernacion.RUSTICA_FRENADA);
        Libros lib4 = new Libros("Francisco de Quevedo",GeneroLiterario.NOVELA,TipoEncuadernacion.RUSTICA_COSIDA);

        lib1.getLibro();
        lib2.getLibro();
        lib3.getLibro();
        lib4.getLibro();

    }
}