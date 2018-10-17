package com.example.OCP.advancedClassDesing.nestedClasses.staticNestedClasses;

/**
 * Created by guille on 10/16/18.
 */

/*
*It can be made private or use other access modifiers to encapsulate it
* The nesting creates a namespace because the enclosing class must be used to refer it
* The enclosing class can refer to the fields and methods of static nested class
* se pueden usar en un contexto estatcio
* */

public class Enclosing {

    static class Nested{
        private int price = 10;
    }

    public static void main(String ...args){

        Nested nested = new Nested();
        System.out.println(nested.price);
    }

}
