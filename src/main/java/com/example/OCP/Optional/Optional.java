package com.example.OCP.Optional;

public class Optional {
    public static java.util.Optional<String> getGrade(int marks) {
        java.util.Optional<String> grade = java.util.Optional.empty();
        if (marks > 50) {
            grade = java.util.Optional.of("PASS");
        } else {
            grade.of("FAIL");
        }
        return grade;
    }

    public static void main(String[] args) {
        java.util.Optional<String> empty = java.util.Optional.ofNullable(null);
        System.out.println("asd" + empty.orElse("bla"));
        java.util.Optional<String> grade1 = getGrade(50);
        java.util.Optional<String> grade2 = getGrade(55);
        System.out.println(grade1.orElse("UNKNOWN"));
        if (grade2.isPresent()) {
            grade2.ifPresent(x -> System.out.println(x));
        } else {
            System.out.println(grade2.orElse("Empty"));
        }
        System.out.println(grade1.of("FFFAAAAILL"));
        System.out.println(grade1.of("FFFAAAAILL").get());
    }
}