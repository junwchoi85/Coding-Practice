/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.education.concurrency;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

/**
 *
 * @author junwh
 */
public class WeighAnimalAction extends RecursiveAction{
    private int start;
    private int end;
    private Double[] weights;
    public WeighAnimalAction(Double[] weights, int start, int end) {
        this.start = start;
        this.end = end;
        this.weights = weights;
    }

    @Override
    protected void compute() {
        if(end-start <= 3) {
            for(int i=start; i<end; i++) {
                weights[i] = (double)new Random().nextInt(100);
                System.out.println("Animal Weighed: " + i);
            }
        } else {
            int middle = start+((end-start)/2);
            System.out.println("[start="+start+",middle="+middle+",end="+end+"]");
            invokeAll(new WeighAnimalAction(weights, start, middle), 
                    new WeighAnimalAction(weights, middle, end));
        }
    }
    
    public static void main(String[] args) {
        Double[] weights = new Double[10];
        
        ForkJoinTask<?> task = 
                new WeighAnimalAction(weights, 0, weights.length);  //Create a ForkJoinTask.
        ForkJoinPool pool = new ForkJoinPool();     //Create the ForkJoinPool
        pool.invoke(task);      //Start the ForkJoinTask.
        
        System.out.println();
        System.out.println("Weights: ");
        Arrays.asList(weights)
                .stream()
                .forEach(d -> System.out.print(d.intValue() + " "));
        
    }
}






