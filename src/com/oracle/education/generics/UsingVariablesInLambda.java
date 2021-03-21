/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.education.generics;

/**
 *
 * @author junwh
 */
public class UsingVariablesInLambda {
    public static void main(String[] args) {
        GorilaFamily g = new GorilaFamily();
        g.everyonePley(true);
        
    }
}

interface Gorilla {
    String move();
}

class GorilaFamily {
    String walk = "walk";
    
    void everyonePley(boolean baby) {
        String approach = "amble";  //effectively final. Since there are no reassignments to the variable
        //approach = "run"; //if uncommented, this will not be effectively final.
        
        play(() -> "walk");     //uses an instance variable in the lambda
        play(() -> baby ? "hitch a ride" : "run");  //uses a method parameter
        play(() -> approach);   //
    }
    
    void play(Gorilla g) {
        System.out.println(g.move());
    }
}



