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
public class Lemur extends Primate implements HasTail{
    public int age = 10;
    public boolean isTailStriped() {
        return false;
    }
    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);
        
        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStriped());
        
        Primate primate = lemur;
        System.out.println(primate.hasHair());
        
        Primate primateClassCastException = new Primate();
        Lemur lemurClassCastException = (Lemur)primateClassCastException;
    }
}

class Primate {
    public boolean hasHair() {
        return true;
    }
}

interface HasTail {
    public boolean isTailStriped();
}


