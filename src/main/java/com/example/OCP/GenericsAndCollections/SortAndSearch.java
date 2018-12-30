package com.example.OCP.GenericsAndCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

public class SortAndSearch extends Thread {

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
        List<? super Object> genList = new ArrayList<>();
        genList.add(new Integer(1));

    }

    @Override
    public void run() {
        int i = 0;
        while (i < 10) {

            System.out.println(i);
            i++;
        }
    }
}
