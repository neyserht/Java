package ejemplo;

public class CuentaCorriente extends Cuenta{

    public CuentaCorriente(int numeroCuenta, double saldoCuenta) {
        super(numeroCuenta, saldoCuenta);
    }

    public void setRetirada(double retiradaCuenta){
        saldoCuenta-= retiradaCuenta;
    }

}
