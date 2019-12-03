package com.example.OCP.dateTime;

import java.time.*;
import java.util.ArrayList;
import java.util.List;

public class PeriodAndDuration {
    int a ;
    public static void main(String...args){

        Period period = Period.ofDays(1);
        Duration duration = Duration.ofHours(25);

        System.out.println(period);
        System.out.println(duration);

        Period p = Period.between(LocalDate.now(), LocalDate.of(2015, Month.SEPTEMBER, 1));
        System.out.println(p);
        Duration d = Duration.between(LocalDateTime.now(), LocalDateTime.of(2015, Month.SEPTEMBER, 2, 10, 10));
        System.out.println(d);
    }
}
