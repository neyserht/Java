package neyser.examentrimestre2;

public class Helados {
    private String marca;
    private String sabor;
    private Integer tamanio;
    private Double precio;

    public Helados(String marca, String sabor, Integer tamanio, Double precio) {
        this.marca = marca;
        this.sabor = sabor;
        this.tamanio = tamanio;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public Integer getTamanio() {
        return tamanio;
    }

    public void setTamanio(Integer tamanio) {
        this.tamanio = tamanio;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
