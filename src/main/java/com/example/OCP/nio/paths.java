package com.example.OCP.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class paths {

    public static void main(String[] args) {
        Path path = Paths.get("/user/../asd//./root","../../ko.txt");
        System.out.println(path.normalize());
    }
}
