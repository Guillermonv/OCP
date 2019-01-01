package com.example.OCP.dateTime;

import java.time.Duration;
import java.time.Period;

public class PeriodAndDuration {
    public static void main(String...args){
        Period period = Period.ofDays(1);
        Duration duration = Duration.ofHours(25);

        System.out.println(period);
        System.out.println(duration);
    }
}
