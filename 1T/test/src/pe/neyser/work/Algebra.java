package pe.neyser.work;

public class Algebra {

    int num1 = 0;
    int num2 = 0;

    public void sumaVoid(){
        System.out.println(num1+num2);
    }

    public void restaVoid(){
        System.out.println(num1-num2);
    }

    public int sumaReturn(){
        int respuesta = num1+num2;
        return respuesta;
    }

    public int restaReturn(){
        int respuesta = num1-num2;
        return respuesta;
    }


}
