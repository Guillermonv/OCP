package com.example.OCP.designPatterns.FunctionalInterfaces;

/**
 * Created by guille on 10/18/18.
 */
public class FindMatchAnimals {

    public static void print(Animal animal, Animal.MakeDeal makeDeal) {
        if (makeDeal.test(animal))
            System.out.print(animal);
    }
    public static void main(String...args){
        print(new Animal("fish",true,false),a->a.isCanFly() && true);
        print(new Animal("bird",false,true),a->a.isCanSwinm());
        //print(new Animal("mamal",true,true),a->a.toString());
    }
}
