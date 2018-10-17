package com.example.OCP.advancedClassDesing.nestedClasses.annonimusInnerClass;

/**
 * Created by guille on 10/14/18.
 */


/*
Anonymus Inner class is a local class that do no have a name
Its declared and instanciated using the keyword new
Anonymus inner class required to extends or implement and exisiting interface

*/

public class MyAnnonimusInnerClass {

    abstract class SaleTodayOnly{
        abstract int dollarOff();
    }
    public int admission(int basePrice){
        SaleTodayOnly saleTodayOnly = new SaleTodayOnly() {
            @Override
            int dollarOff() {
                return 3;
            }
        };
        return basePrice - saleTodayOnly.dollarOff();
    }
}
