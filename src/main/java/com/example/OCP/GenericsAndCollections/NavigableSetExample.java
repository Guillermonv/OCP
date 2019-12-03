package com.example.OCP.GenericsAndCollections;

import javax.annotation.processing.SupportedSourceVersion;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class NavigableSetExample {
    public static void main(String[] args) {
        NavigableSet<Integer> ns = new TreeSet<>();
        ns.add(1); ns.add(2); ns.add(3); ns.add(4); ns.add(5);
        List<String> as = new ArrayList<String>();
        Map<String, String> map = new HashMap<>();
        map.put("a","a");
        map.put("b","b");
        System.out.println("Entry Set " + map.entrySet());
        System.out.println(ns.ceiling(5));
        System.out.println(ns.higher(5));
        System.out.println(ns.floor(1));
        System.out.println(ns.lower(1));
        LocalDateTime ld1 = LocalDateTime.of(2015, Month.NOVEMBER, 1, 2, 0);
        ZonedDateTime zd1 = ZonedDateTime.of(ld1, ZoneId.of("US/Eastern"));
        LocalDateTime ld2 = LocalDateTime.of(2015, Month.NOVEMBER, 1, 1, 0);
        ZonedDateTime zd2 = ZonedDateTime.of(ld2, ZoneId.of("US/Eastern"));
        long x = ChronoUnit.HOURS.between(zd1, zd2); System.out.println(x);
    }
}
