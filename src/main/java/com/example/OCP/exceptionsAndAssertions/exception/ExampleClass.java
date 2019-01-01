package com.example.OCP.exceptionsAndAssertions.exception;

public class ExampleClass implements Iexception {
    public void throwsSomething() {
        System.out.println("In this exaplme Happen two things");
        System.out.println("I can choose not throws any Exeption");
        System.out.println("i can throws lower exceptions but not higher");
    }

    public static void main(){
        ExampleClass exampleClass= new ExampleClass();
        exampleClass.throwsSomething();
    }
}
