package example;

public class Cuenta
{
    private int numeroCuenta;
    private double saldoCuenta;
    private String titular;

    public Cuenta(int numeroCuenta, double saldoCuenta, String titular)
    {
        this.numeroCuenta = numeroCuenta;
        this.saldoCuenta = saldoCuenta;
        this.titular = titular;
    }

    public Cuenta(int numeroCuenta)
    {
        this.numeroCuenta = numeroCuenta;
    }

    public Cuenta(int numeroCuenta, double saldoCuenta)
    {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numeroCuenta=" + numeroCuenta +
                ", saldoCuenta=" + saldoCuenta +
                ", titular='" + titular + '\'' +
                '}';
    }
}
