package pe.neyser.work;

public enum Planetas {
    MERCURIO(4878, 0.06),
    VENUS(12100, 0.82),
    TIERRA(12756, 1.00);

    private final int diametro;
    private final double masa;

    private Planetas(int diametro, double masa){
        this.diametro = diametro;
        this.masa = masa;
    }

    public int getDiametro(){
        return diametro;
    }
    public double getMasa(){
        return masa;
    }



}
