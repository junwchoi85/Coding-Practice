/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.education.generics;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author junwh
 */
public class MyComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o1.toLowerCase().compareTo(o2.toLowerCase());
    }
    public static void main(String [] args) {
        String[] vals = {"123", "Abb", "aab"};
        Arrays.sort(vals, new MyComparator());
        
        Comparator<String> inUpperCase = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        Comparable<String> test = new Comparable<String>() {
            @Override
            public int compareTo(String o) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        };
    }
    
}

class MyComparable implements Comparable<String> {

    @Override
    public int compareTo(String o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}




