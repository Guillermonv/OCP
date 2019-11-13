package com.example.OCP.GenericsAndCollections;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetExample {
    public static void main(String[] args) {
        NavigableSet<Integer> ns = new TreeSet<>();
        ns.add(1); ns.add(2); ns.add(3); ns.add(4); ns.add(5);

        System.out.println(ns.ceiling(5));
        System.out.println(ns.higher(5));
        System.out.println(ns.floor(1));
        System.out.println(ns.lower(1));
    }
}
