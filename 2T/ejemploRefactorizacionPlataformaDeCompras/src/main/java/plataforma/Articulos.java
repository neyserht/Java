package plataforma;

public class Articulos
{
    private int idArt = 0;
    private String nomArt = "";
    private Double pvpArt = 0.0;
    private int uniArt = 0;

    public Articulos(int idArt, String nomArt, Double pvpArt, int uniArt) {
        this.idArt = idArt;
        this.nomArt = nomArt;
        this.pvpArt = pvpArt;
        this.uniArt = uniArt;
    }

    public int getIdArt() {
        return idArt;
    }

    public void setIdArt(int idArt) {
        this.idArt = idArt;
    }

    public String getNomArt() {
        return nomArt;
    }

    public void setNomArt(String nomArt) {
        this.nomArt = nomArt;
    }

    public Double getPvpArt() {
        return pvpArt;
    }

    public void setPvpArt(Double pvpArt) {
        this.pvpArt = pvpArt;
    }

    public int getUniArt() {
        return uniArt;
    }

    public void setUniArt(int uniArt) {
        this.uniArt = uniArt;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "idArt=" + idArt +
                ", nomArt='" + nomArt + '\'' +
                ", pvpArt=" + pvpArt +
                ", uniArt=" + uniArt +
                '}';
    }
}
