package com.neyser.work;

public abstract class Class1 implements Interface1
{
    public void sumar1(){};

    // como la clase es abstracta, mantenemosun método bastracto
    public int sumar2(int n1, int n2)
    {
        n1+=n2;
        return n1;
    }
}
