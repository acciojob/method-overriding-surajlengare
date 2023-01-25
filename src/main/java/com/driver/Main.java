package com.driver;

import org.w3c.dom.ls.LSOutput;

public class Main
{
    public static void main(String[] args)
    {
        B obj1 = new B();
        System.out.println(obj1.meth());
    }
}

class A
{
    public String meth()
    {
        return ("Invoking method from class A");
    }
}

class B extends A
{
    @Override
    public String meth()
    {
        return ("Method is overridden in Extendend class B");
    }
}



