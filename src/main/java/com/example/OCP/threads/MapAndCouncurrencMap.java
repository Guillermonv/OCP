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
    }

}
