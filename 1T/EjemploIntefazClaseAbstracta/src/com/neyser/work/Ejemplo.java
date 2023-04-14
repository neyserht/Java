package com.neyser.work;

public class Ejemplo {
    public static void main(String[] args)
    {

        Class2 obj1 = new Class2();
        obj1.sumar1(5,5);
        int resultadoSummar2 = obj1.sumar2(10,10);
        System.out.println(resultadoSummar2);

        Class2 obj2 = new Class2();
        obj2.sumar1(100,100);
        resultadoSummar2 = obj2.sumar2(500,500);
        System.out.println(resultadoSummar2);
        obj2.sumar1(80,80);

    }
}
