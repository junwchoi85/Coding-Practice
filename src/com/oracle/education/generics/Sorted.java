/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.education.generics;

import java.util.*;

/**
 *
 * @author junwh
 */
public class Sorted implements Comparable<Sorted>, Comparator<Sorted>{

    private int num;
    private String text;
    
    Sorted(int n, String t) {
        this.num = n;
        this.text = t;
    }
    
    public String toString() {
        return "" + num;
    }
    
    @Override
    public int compareTo(Sorted o) {
        return text.compareTo(o.text);
    }

    @Override
    public int compare(Sorted o1, Sorted o2) {
        return o1.num - o2.num;
    }
    
    public static void main(String[] args) {
        Sorted s1 = new Sorted(88, "a");
        Sorted s2 = new Sorted(55, "b");
        TreeSet<Sorted> t1 = new TreeSet<>();
        t1.add(s1);
        t1.add(s2);
        
        TreeSet<Sorted> t2 = new TreeSet<>(s1);
        t2.add(s1);
        t2.add(s2);
        
        System.out.println(t1 + " " + t2);
    }
    
}


