package ejemplo;

public class CuentaAhorro extends Cuenta{

    public CuentaAhorro(int numeroCuenta, double saldoCuenta) {
        super(numeroCuenta, saldoCuenta);
    }

    public void getSaldo(){
        System.out.println("Saldo de CA: "+ saldoCuenta);
    }

}
