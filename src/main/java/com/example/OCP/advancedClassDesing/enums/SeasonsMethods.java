package com.example.OCP.advancedClassDesing.enums;

/**
 * Created by guille on 10/13/18.
 */
public enum SeasonsMethods {

    WINTER{
        public void printHours() {
            System.out.println("9am -17pm");
        }
    },
    SUMMER {
        public void printHours() {
            System.out.println("07am - 19om");
        }
    },
     SPRING {
       public void printHours(){
           System.out.println("08am - 18pm");
       }
    };
    public abstract void printHours();

}
