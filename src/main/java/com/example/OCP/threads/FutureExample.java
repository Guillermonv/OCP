package com.example.OCP.threads;

import java.util.HashMap;
import java.util.SortedMap;
import java.util.concurrent.*;

public class FutureExample {

    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        ConcurrentHashMap <String , String> cm = new ConcurrentHashMap<>();

        Future<?> result = service.submit(()->{Thread.sleep(10000); return 1+4;});
                service.submit(()-> 3+8);

        try {
            System.out.println(result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }




}
