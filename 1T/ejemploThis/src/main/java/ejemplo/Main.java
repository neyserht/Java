package ejemplo;

public class Main {
    public static void main(String[] args) {

        Cuenta cu1 = new Cuenta(123, 1000.00);
        cu1.setIngreso(500);
        cu1.getSaldo();

        CuentaAhorro ca01 = new CuentaAhorro(456,500);
        ca01.setIngreso(200);
        ca01.getSaldo();

        CuentaCorriente cc01 = new CuentaCorriente(789,1200);
        cc01.setRetirada(700);
        cc01.getSaldo();


        Integer a1 = 0;
        System.out.println(a1.toString());

    }
}