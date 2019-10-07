package com.example.OCP.advancedClassDesing.herencia.exampleB;

import com.example.OCP.advancedClassDesing.herencia.exampleA.A;

/**
 * Created by guille on 10/27/18.
 */

public class B extends A
{
    int b;
    //Si pongo A a falla a pesar de que sea protected i
    A as = new A();

    public void process(A a)
    {

        a.i = a.getI() *2;
    }
    private class test{
      private test(int a){

      }
    }
    public static void main(String[] args)
    {
        B.test test =new B().new test(1);
        A a = new B();
        A as = new A();
        B b = new B();
        b.process(b);
        System.out.println( a.getI() );

    }
}
