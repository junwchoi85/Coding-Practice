/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.education.generics;

/**
 *
 * @author junwh
 * Practicing Functional Interface and Lambda expressions
 */
@FunctionalInterface interface Climb {
    boolean isTooHigh(int height, int limit);
}

public class Climber {
    public static void main(String [] args) {
        check( (h, l) -> h.toString(), 5 );
    }
    
    private static void check(Climb climb, int height) {
        if(climb.isTooHigh(height, 10)) {
            System.out.println("too heigh");
        } else {
            System.out.println("Ok");
        }
    }
}




