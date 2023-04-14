package pe.neyser.work;


public class Main {
    public static void main(String[] args) {
        // Instancia de clase (Crear Objeto)

        Algebra obj01 = new Algebra();
        obj01.num1 = 10;
        obj01.num2 = 10;

        obj01.sumaVoid();
        obj01.restaVoid();

        int sum1 = obj01.sumaReturn();
        System.out.println(sum1);

        int res1 = obj01.restaReturn();
        System.out.println(res1);

        System.out.println(sum1+res1);


    }
}