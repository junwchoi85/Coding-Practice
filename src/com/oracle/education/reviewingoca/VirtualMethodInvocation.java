/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.education.reviewingoca;

/**
 *
 * @author junwh
 */
public class VirtualMethodInvocation {
    public static void main(String[] args) {
        Animal animal = new Lion();
        animal.printName();
    }
        

}

abstract class Animal {
    String name = "???";
    public void printName() {
        System.out.println(name);
    }
    public abstract void feed();
}

class Lion extends Animal {
    String name = "Leo";
//    @Override
//    public void printName() {
//        System.out.println(name);
//    }
    @Override
    public void feed() {
    }
}

class Cow extends Animal {
    @Override
    public void feed() {
        addHay();
    }
    public void addHay() {
    }
}













