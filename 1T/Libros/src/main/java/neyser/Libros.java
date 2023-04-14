package neyser;

public class Libros {

    private String autor;
    private GeneroLiterario generoLiterario;
    private TipoEncuadernacion tipoEncuadernacion;

    public Libros(String autor, GeneroLiterario generoLiterario, TipoEncuadernacion tipoEncuadernacion){
        this.autor = autor;
        this.generoLiterario = generoLiterario;
        this.tipoEncuadernacion = tipoEncuadernacion;
    }

    public void getLibro(){
        System.out.println("Autor: "+autor);
        System.out.println("Genero literario: "+generoLiterario);
        System.out.println("Tipo de ecuadernacion: "+tipoEncuadernacion);
        System.out.println("----------------------------------------------");
    }

}
