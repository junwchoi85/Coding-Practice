/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.education.concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author junwh
 */
public class LionPenManager {
    
    private void removeAnimals() {
        System.out.println("Removing animals.");
    }
    private void cleanPen() {
        System.out.println("Cleaning the pen.");
    }
    private void addAnimals() {
        System.out.println("Adding animals.");
    }
    
//    public void performTask(CyclicBarrier c1, CyclicBarrier c2) {
    public void performTask(CyclicBarrier c1){
        try {
            removeAnimals();
            c1.await();
            cleanPen();
            c1.await();
            addAnimals();
        } catch(InterruptedException | BrokenBarrierException e) {
            //Handle checked exceptions here...
        }
        
    }
    
    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(4);
            
            LionPenManager manager = new LionPenManager();
            CyclicBarrier c1 = new CyclicBarrier(4);
            CyclicBarrier c2 = new CyclicBarrier(4,
                    () -> System.out.println("*** pen cleaned!"));
            for(int i=0; i<4; i++) {
//                service.submit(() -> manager.performTask(c1, c2));
                service.submit(() -> manager.performTask(c1));
            }
        } finally {
            if(service != null) 
                service.shutdown();
        }
    }
}










