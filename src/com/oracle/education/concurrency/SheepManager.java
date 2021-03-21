/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.education.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author junwh
 * p.355
 */
public class SheepManager {
    private int sheepCount = 0;
    private void incrementAndReport() {
        synchronized(this) {
            System.out.println((++sheepCount)+" ");
        }
    }
    
    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(20);
            
            SheepManager manager = new SheepManager();
            for(int i = 0; i<10; i++) {
                service.submit(() -> manager.incrementAndReport());
            }
        } finally {
            if(service!=null) service.shutdown();
        }
    }
}



