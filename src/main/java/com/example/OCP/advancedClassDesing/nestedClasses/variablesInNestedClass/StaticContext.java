package com.example.OCP.advancedClassDesing.nestedClasses.variablesInNestedClass;

/**
 * Created by guille on 10/20/18.
 */
public class StaticContext {

    static {
        System.out.print("STATIC 1");
    }

    static {
        System.out.print("Static 2");
    }
    class Test{
        int value=0;
    }
    public static void main(String ...args){

        StaticContext st;
        st = new StaticContext();

       // System.out.println(t.value);

    }
}
