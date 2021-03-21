/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.education.generics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author junwh
 */
public class GenericSupertypes {
    
    public static void main(String[] args) {
        
//        List<? super IOException> exceptions = new ArrayList<Exception>();
        List<? extends IOException> exceptions = new ArrayList<>();
        //exceptions.add(new Exception());    
        //exceptions.add(new IOException());
        //exceptions.add(new FileNotFoundException());
        /*Set<Number> numbers = new HashSet<>();
        numbers.add(new Integer(86));
        numbers.add(75);
        numbers.add(null);
        numbers.add(809L);
        Set<Integer> integers = new HashSet<Integer>();
        integers.add(new Integer(86));
        integers.add(75);
        integers.add(null);
        integers.add(809L);
        integers.add(new Double(23));
        integers.add(new Long(23));*/
//        Integer te = new Long(123);
        Map<String, Double> map = new HashMap<>();
        map.put('x', new Double(123));
    }
}






















