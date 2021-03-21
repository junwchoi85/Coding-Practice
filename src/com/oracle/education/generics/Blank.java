/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.education.generics;

import java.util.*;

class CheetahManager {
    public static final CheetahManager cheetahManager = new CheetahManager();
    private CheetahManager() {}
//    public static CheetahManager getCheetahManager() {
//        if(cheetahManager==null) {
//            cheetahManager = new CheetahManager();
//        }
//        return cheetahManager;
//    }
}

/**
 *
 * @author junwh
 */
public class Blank {
    public static void main(String[] args) {
        Helper.<Exception>printException(new Exception("Test"));
        
        List<? extends Exception> list = new LinkedList<java.io.IOException>();
        
        Map m = new HashMap();
        m.put(123, "456");
        m.put("abc", "def");
        System.out.println(m.containsKey("123"));
    }
}

class Helper {
    public static <U extends Exception> void printException(U u) {
        System.out.println(u.getMessage());
    }
}

interface CanWalk {
    default void walk() {
        System.out.println("Walking");
    }
}

interface CanRun {
    public default void walk() {
        System.out.println("Walking");
    }
}

interface CanSprint extends CanWalk, CanRun {
    void sprint();
    
//    @Override
//    public default void walk() {
//        System.out.println("Walking");
//    }
}












