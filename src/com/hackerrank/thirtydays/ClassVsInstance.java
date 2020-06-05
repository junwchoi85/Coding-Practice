package com.hackerrank.thirtydays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author junwh
 */
public class ClassVsInstance {
    
}

class Person {
    private int age;	
  
	public Person(int initialAge) {
  		// Add some more code to run some checks on initialAge
            if(initialAge>=0) {
                this.age = initialAge;
            } else {
                this.age = 0;
                System.out.println("Age is not valid, setting age to 0.");
            }
	}

	public void amIOld() {
            // Write code determining if this person's age is old and print the correct statement:
            if(this.age<13) {
                System.out.println("You are young.");
            } else if(13<=this.age && this.age<18) {
                System.out.println("You are a teenager.");
            } else {
                System.out.println("You are old.");
            }
            System.out.println(/*Insert correct print statement here*/);
	}

	public void yearPasses() {
            // Increment this person's age.
            this.age++;
	}
}

