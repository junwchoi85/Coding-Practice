/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.education.generics;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author junwh
 */
public class UpperBounds {
    static class Sparrow extends Bird{}
    static class Bird{}
    
    public static void main(String[] args) {
        /*Java doesn't know what List<? extends Bird> really is. 
        It could be List<Bird> or List<Sparrow> or some other generic type that hasn't even been written yet.*/
        List<? extends Bird> birds = new ArrayList<Bird>(); 
        
        //birds.add(new Sparrow());   //can't add Sparrow to List<Bird>
        /*
        incompatible types: Sparrow cannot be converted to CAP#1
        where CAP#1 is a fresh type-variable:
            CAP#1 extends Bird from capture of ? extends Bird
        ----
        (Alt-Enter shows hints)
        */
        //birds.add(new Bird());      //can't add a Bird to List<Sparrow>
    }
}




