package com.example.OCP.streams;

import java.util.Arrays;
import java.util.List;

public class AllMatch {
    public static void main(String[] args) {
        //all match go printing and when no match retturn false
        List<String> values = Arrays.asList("Java", "C#", "Python");
        boolean flag = values.stream().allMatch(str->{ System.out.println("Testing: "+str);
        return str.equals("Java");
        }); System.out.println(flag);
    }
}
