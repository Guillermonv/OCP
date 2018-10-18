package com.example.OCP.designPatterns.FunctionalInterfaces;

/**
 * Created by guille on 10/18/18.
 */


public class Animal {

    private String species;
    private boolean canSwinm;
    private boolean canFly;

    public Animal(String species, boolean canSwinm, boolean canFly) {
        this.species = species;
        this.canSwinm = canSwinm;
        this.canFly = canFly;
    }

    public String toString() {
        return species;
    }

    public boolean isCanSwinm() {
        return canSwinm;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public interface MakeDeal {
        public boolean test(Animal animal);
    }


}
