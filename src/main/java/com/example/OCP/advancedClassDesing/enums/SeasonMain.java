package com.example.OCP.advancedClassDesing.enums;

/**
 * Created by guille on 10/13/18.
 */
public class SeasonMain {

public static void main (String ... args){

    Seasons s = Seasons.SUMMER;
    System.out.println(Seasons.SUMMER);
    System.out.println(s ==Seasons.SUMMER);

    // Iterate seasons to get the name and ordinal return the order (start 0) with ordinal
    System.out.print("All season for season Enum");
    for (Seasons seasons : Seasons.values()){
        System.out.println(seasons.name() + " " + seasons.ordinal());
    }

    Seasons season = Seasons.valueOf("SUMMER");
   // Seasons seasons = Seasons.valueOf("summer"); its keySensitve it will throw exception

    //Enums in switch Statement
    switch (season){

        case FALL: System.out.print(" cold");
        case SPRING: System.out.print("nice days");
        case SUMMER: System.out.println("best days to go to beach");
    }

    //ENUMS with constructor
    SeasonsArgs.SUMMER.printExpetedVistors();

    SeasonsMethods.SPRING.printHours();
   // System.out.print();

    }
}
