package com.example.OCP.streams;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class ParalelsStreams {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(1, 2, 3, 5).parallelStream().findAny());
        Deque<Integer> d = new ArrayDeque<>();

        Map<String , String> map = new HashMap<>();
        map.put("a","b");
        System.out.println("i" + map.put("a","b"));

        List<String> vals = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "a", "b", "c", "d", "e", "f", "g", "a", "b", "c", "d", "e", "f", "g", "a", "b", "c", "d", "e", "f", "g");

        vals.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                System.out.println("test");
                return s =="a";
            }
        }).forEach(System.out::println);

      }
      abstract class test{
        private String test (int a){
            return null;
        }
      }
}
