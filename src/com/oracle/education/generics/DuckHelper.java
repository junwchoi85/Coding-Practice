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
public class DuckHelper {
    public static int compareByWeight(Duck d1, Duck d2) {
        return d1.getWeight() - d2.getWeight();
    }
    
    public static int compareByName(Duck d1, Duck d2) {
        return d1.getName().compareTo(d2.getName());
    }
}
