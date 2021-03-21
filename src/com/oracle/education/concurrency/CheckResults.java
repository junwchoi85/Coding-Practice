/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.education.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 *
 * @author junwh
 */
public class CheckResults {
    private static int counter = 0;
    public static void main(String[] args) 
            throws InterruptedException, ExecutionException {
        
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            Future<?> result = service.submit(() -> {
                for(int i=0; i<5000; i++) CheckResults.counter++;
            });
            
            result.get(10, TimeUnit.SECONDS);
            System.out.println("Reached");
        } catch(TimeoutException e) {
            System.out.println("Not reached in time");
        } finally {
            if(service != null) service.shutdown();
        }
        
        /*new Thread(() -> {
            for(int i=0; i<5000; i++) CheckResults.counter++;
        }).start();
        
        while(CheckResults.counter<100) {
            System.out.println("Not reached yet");
            Thread.sleep(1000);
        }
        System.out.println("Reached");*/
    }
}




