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
public class InstanceOfPractice {
    public static void main(String[] args) {
        HeavyAnimal hippo = new Hippo();
        boolean b1 = hippo instanceof Hippo;
        boolean b2 = hippo instanceof HeavyAnimal;
        boolean b3 = hippo instanceof Elephant;
        
        boolean b4 = hippo instanceof Object;
        Hippo nullHippo = null;
        boolean b5 = nullHippo instanceof Object;   //false. nulll is not an object.
        
        Hippo anotherHippo = new Hippo();
        b5 = anotherHippo instanceof Elephant;  //Does not compile!
        /*
        The compilation check only applies when instanceof is called on a class.
        For interface, Java waits until runtime to do the check. The reason is that
        a subclass could implement that interface and the compiler wouldn't know it.
        There is not way for Hippo to be a subclass of Elephant.
        */
        boolean b6 = hippo instanceof Mother;   //Thie one complies.
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
    }
}

class HeavyAnimal{}
class Hippo extends HeavyAnimal{}
class Elephant extends HeavyAnimal{}

interface Mother{}
class MotherHippo extends Hippo implements Mother{}














