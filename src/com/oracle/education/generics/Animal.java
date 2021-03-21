/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.education.generics;

/**
 *
 * @author junwh
 * Exercise CompareTo
 */
public class Animal implements Comparable<Animal>{
    public int id;
    public Animal(int id) {
        this.id = id;
    }
    @Override
    public int compareTo(Animal o) {
        return id - o.id;
    }
    public static void main(String[] args) {
        Animal a1 = new Animal(5);
        Animal a2 = new Animal(7);
        
        System.out.println(a1.compareTo(a2));       //number less than zero when the current object is smaller ...
        System.out.println(a1.compareTo(a1));       //0 if the current object is equal to the argument to compareTo
        System.out.println(a2.compareTo(a1));       //number greater than zero when the current object is larger ...
    }
    
}



