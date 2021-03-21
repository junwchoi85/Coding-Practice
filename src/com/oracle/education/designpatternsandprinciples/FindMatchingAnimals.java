/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.education.designpatternsandprinciples;

/**
 *
 * @author junwh
 */
public class FindMatchingAnimals {
    private static void print(Animal animal, CheckTrait trait) {
        if(trait.test(animal)) {
            System.out.println(animal);
        }
    }
    
    public static void main(String[] args) {
        print(new Animal("fish", false, true), a -> a.canHop());
        print(new Animal("kangaroo", true, false), a -> a.canHop());
    }
}


@FunctionalInterface interface CheckTrait {
    public boolean test(Animal a);
}

class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;
    Animal(String speciesName, boolean hopper, boolean swimmer) {
        this.species = speciesName;
        this.canHop = hopper;
        this.canSwim = swimmer;
    }

    @Override public String toString() {
        return species;
    }

    public boolean canHop() {
        return canHop;
    }

    public boolean canSwim() {
        return canSwim;
    }

    
}






