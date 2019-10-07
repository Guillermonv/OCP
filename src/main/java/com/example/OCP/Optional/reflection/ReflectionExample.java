package com.example.OCP.Optional.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args)
            throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {


        SampleClass sampleObject = new SampleClass();
        Method[] methods = SampleClass.class.getMethods();

        methods[1].invoke(sampleObject, "data");
        System.out.println(methods[0].invoke(sampleObject));
        methods[2].invoke(sampleObject,"String");
        System.out.println(methods[0].invoke(sampleObject));
    }
}

class SampleClass {
    private String sampleField;

    public String getSampleField() {
        return sampleField;
    }

    public void setSampleField(String sampleField) {
        this.sampleField = sampleField;
    }
    public void setSampleField2(String sampleField) {
        this.sampleField = sampleField;
    }

}