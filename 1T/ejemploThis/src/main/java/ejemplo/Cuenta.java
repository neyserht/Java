package ejemplo;

public class Cuenta
{
    protected int numeroCuenta;
    protected double saldoCuenta;

    public Cuenta(int numeroCuenta, double saldoCuenta){
        this.numeroCuenta = numeroCuenta;
        this.saldoCuenta = saldoCuenta;
    }


    public void presentar() {
        System.out.println("Cuenta{" +
                "numeroCuenta=" + numeroCuenta + '\'' +
                ", saldoCuenta=" + saldoCuenta +
                '}');
    }

    public void setIngreso(double ingresoCuenta)
    {
        saldoCuenta+=ingresoCuenta;
    }

    public void getSaldo(){
        System.out.println("Saldo de cuenta genérica: "+saldoCuenta);
    }


}
