package com.example.OCP.advancedClassDesing.nestedClasses.variablesInNestedClass;

/**
 * Created by guille on 10/14/18.
 */
public class A {
    private int x =  30;

    private class B {
        private int x = 20;

        private class C {
            private int x = 10;

            public void getAllTheX(){
                System.out.println(x); // 10
                System.out.println(this.x); //10
                System.out.println(B.this.x); //20
                System.out.println(A.this.x); //30
                System.out.println(C.this.x); //10
            }
        }
    }
    public static void main (String...args){
        A a = new A();
        B b = new A().new B();
        B.C c = b.new C();
        c.getAllTheX();
    }
}

