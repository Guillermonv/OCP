package com.example.OCP.advancedClassDesing.nestedClasses.localInnerClass;

/**
 * Created by guille on 10/14/18.
 */

/* LocalInnerClasses
They do not have an access specifier
They cannot be declare static and cannot have static methods or fields
They have access to all fields and methods of the enclosing class
They do not have access to local variables of a method unless those variables are final
*/
public class Outer {

    private  int length = 5;

    public void calculate (){
        final int width =20;

        class Inner{
           public void multiply () {
               System.out.println(length * width);
           }

        }
        System.out.println(width);
        Inner inner = new Inner();
        inner.multiply();
    }

    public static void main (String...args){
        Outer outer = new Outer();
        outer.calculate();
    }
}
