package com.example.OCP.threads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapAndCouncurrencMap {

    public static void main(String[] args) {
        Map<String , Integer> map =new HashMap<>();
        map.put("1",1);
        map.put("2",2);
       /* for (String key : map.keySet()){
            map.remove(key);
        }Exception in thread "main" java.util.ConcurrentModificationException*/
        Map<String , Integer> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put("1",1);
        concurrentMap.put("2",2);
          for (String key : concurrentMap.keySet()){
              concurrentMap.remove(key);
        }
        System.out.println(map.keySet());
        MapAndCouncurrencMap  a = new MapAndCouncurrencMap();
        System.out.println(a.factorial(4));
    }
    public int factorial(int n){
        if(n<1) return 1;
        else return n * factorial(n-1);
    }

}
