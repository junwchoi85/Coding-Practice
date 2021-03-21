/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.education.concurrency;

import java.util.Arrays;

/**
 *
 * @author junwh
 * Excercise revivew questions from chapter 7 Concurrency
 */
public class ReviewQuestions {
    private class Eight{
        
    }
    public static void main(String[] args) {
        Integer i1 = Arrays.asList(1, 2, 3, 4, 5)
                .stream()
                .findAny()
                .get();
        synchronized(i1) {
            Integer i2 = Arrays.asList(6, 7, 8, 9, 10)
                    .parallelStream()
                    .sorted()
                    .findAny()
                    .get();
            System.out.println(i1 + " " + i2);
        }
    }
}





