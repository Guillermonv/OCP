package com.example.OCP.advancedClassDesing.StringBuilder;

import java.util.*;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder as = new StringBuilder("A");
        StringBuilder aa = new StringBuilder("A");

        System.out.println(as.equals(aa));

        Map<Integer,Integer> a = new HashMap<>();
        System.out.println("-- " + a.put(1,2));
        System.out.println("-- " + a.put(1,2));

        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(4);
        myList.add(10);

        Collections.sort(myList,Collections.reverseOrder());
        myList.stream().forEach(System.out::println);
    }
}
