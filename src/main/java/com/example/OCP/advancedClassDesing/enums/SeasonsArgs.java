package com.example.OCP.advancedClassDesing.enums;

/**
 * Created by guille on 10/13/18.
 */
public enum SeasonsArgs {

    WINTER("HIGH"), SPRING("MEDIUM"), SUMMER("HIGH"), FALL("LOW");

    public String expetedVistors;

    private SeasonsArgs (String expetedVistors){
        this.expetedVistors = expetedVistors;
       //System.out.print(expetedVistors);
    }

    public void  printExpetedVistors(){
        System.out.println(expetedVistors);
    }

}
