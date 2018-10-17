package com.example.OCP.advancedClassDesing.nestedClasses.variablesInNestedClass;

/**
 * Created by guille on 10/14/18.
 */
public class privateInterface {
    private interface Secret {
        public void ssh();
    }

    class DontTell implements Secret{

        @Override
        public void ssh() {
            System.out.print("EXAMPLE OF PRIVATE INTERFACE");
        }
    }
}
