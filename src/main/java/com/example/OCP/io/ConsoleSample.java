package com.example.OCP.io;

import java.io.Console;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConsoleSample {

    public static void main(String[] args) {
        Stream<String> ss = Stream.of("a", "b", "c","d","e");
        String str = ss.collect(Collectors.joining(",", "-", "+")); System.out.println(str);
    }
}

