/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.education.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author junwh
 * Excercies Comparator VS. Comparable
 */
public class Duck implements Comparable<Duck>{
    private String name;
    private int weight;
    
    public Duck(String name) {
        this.name = name;
    }
    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    
    @Override
    public String toString() {      //use readable output
        return name;
    }
    
    @Override
    public int compareTo(Duck o) {
        return name.compareTo(o.name);
    }
    
    public static void main(String [] args) {
        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("Quack"));
        ducks.add(new Duck("Puddles"));
        Collections.sort(ducks);
        System.out.println(ducks);
        
        //
        Comparator<Duck> byWeight = new Comparator<Duck>() {
            @Override
            public int compare(Duck o1, Duck o2) {
                return o1.weight - o2.weight;
            }
        };
        List<Duck> ducks2 = new ArrayList<>();
        ducks2.add(new Duck("Quack", 7));
        ducks2.add(new Duck("Puddles", 10));
        Collections.sort(ducks2, byWeight);
        System.out.println(ducks2);
        
        //
        Comparator<Duck> byWeight2 = DuckHelper::compareByWeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
}













