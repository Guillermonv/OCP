package com.example.OCP.GenericsAndCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortAndSearch {

    public static void main(String ... args ){
        List<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(1);listOfNumbers.add(11);listOfNumbers.add(4);listOfNumbers.add(9);
        listOfNumbers.add(3);
        Collections.sort(listOfNumbers);// Sort collection
        System.out.println(Collections.binarySearch(listOfNumbers,4)); // Return the index of the element

        System.out.println(Collections.binarySearch(listOfNumbers,2));
        // return -2 not on the list return -index that should be positioned and  -1 (-1 -1)
        System.out.println(Collections.binarySearch(listOfNumbers,10));
        // return -5 not on the list return -index that should be positioned and  -1 (-4 -1)
        System.out.println(listOfNumbers);
    }
}
