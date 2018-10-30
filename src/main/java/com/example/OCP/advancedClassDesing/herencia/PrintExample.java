package com.example.OCP.advancedClassDesing.herencia;

/**
 * Created by guille on 10/27/18.
 */
class A{

    A() { System.out.print("paso con exampleA");  print();   }
    int i=1;
    void print() { System.out.println("exampleA"); }

}

class B extends A
{
    B(){
        System.out.print("paso con exampleB");
    }
    int i =   Math.round(3.5f);
    public static void main(String[] args)
    {
        B a = new B();
        a.print();
        System.out.print(a.i);


    }
    void print() { System.out.println(i); }
}

