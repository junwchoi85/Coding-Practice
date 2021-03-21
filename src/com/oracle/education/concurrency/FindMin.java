/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.education.concurrency;

import java.util.concurrent.ForkJoinPool;

/**
 *
 * @author junwh
 */
public class FindMin extends MyTask {
    private Integer[] elements;
    private int a;
    private int b;
    public FindMin(Integer[] elements, int a, int b) {
        this.elements = elements;
        this.a = a;
        this.b = b;
    }
    
    @Override
    protected Integer compute() {
        if(b-a < 2) {
            return Math.min(elements[a], elements[b]);
        } else {
            int m = a + (b-a)/2;
            System.out.println(a + "," + m + "," + b);
            MyTask t1 = new FindMin(elements, a, m);
            int result = t1.fork().join();
            return Math.min(new FindMin(elements, m, b).compute(), result);
        }
    }
    
    public static void main(String[] args) {
        Integer[] elements = new Integer[]{8, -3, 2, -54};
        MyTask task = new FindMin(elements, 0, elements.length-1);
        ForkJoinPool pool = new ForkJoinPool(1);
        Integer sum = pool.invoke(task);
        System.out.println("Min: " + sum);
    }
}




