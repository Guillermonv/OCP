package com.example.OCP.GenericsAndCollections;

import java.util.*;

public class ComparableSample {

    static class Person implements Comparable<Person>{
        Integer age = 0;
        int salaray = 0;
        String name= "";
        String surnmae ="";

        public Person(int age, int salaray, String name, String surname) {
            this.age = age;
            this.salaray = salaray;
            this.name = name;
            this.surnmae = surname;
        }

        @Override
        public int compareTo(Person o) {

            return surnmae.compareTo(o.surnmae);
        }

    }

    public static void main(String[] args) {
        ComparableSample.Person a = new ComparableSample.Person(1,20000,"Jhon" ,"Ang") ;
        ComparableSample.Person b = new ComparableSample.Person(18,2000,"Albert", "zz");
        List<Person> persons = new ArrayList<>();
        persons.add(a);
        persons.add(b);
        // if no Comparable its implemented will brake
        Comparator<Person> c = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.surnmae.compareTo(o1.surnmae);
            }
        };
        // Use comaprte
        Collections.sort(persons);
        //Use Comparator
        Collections.sort(persons , c);
        persons.forEach(x->System.out.println(x.name));
    }
}
