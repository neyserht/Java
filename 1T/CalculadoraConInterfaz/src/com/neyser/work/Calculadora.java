package com.neyser.work;

public class Calculadora implements Calculadoras{
    @Override
    public void sumar(int n1, int n2) {
        n1+=n2;
        System.out.println(n1);
    }

    @Override
    public void restar(int n1, int n2) {
        n1-=n2;
        System.out.println(n1);
    }
}
