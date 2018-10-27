package com.example.OCP.advancedClassDesing.herencia;

/**
 * Created by guille on 10/27/18.
 */
class A{

    A() { System.out.print("paso con A");  print();   }
    int i=1;
    void print() { System.out.println("A"); }
}

class B extends A
{
    B(){
        System.out.print("paso con B");
    }
    int i =   Math.round(3.5f);
    public static void main(String[] args)
    {
        A a = new B();
        a.print();


    }
    void print() { System.out.println(i); }
}

