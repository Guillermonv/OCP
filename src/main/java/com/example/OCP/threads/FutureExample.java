package com.example.OCP.threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample {

    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();

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
