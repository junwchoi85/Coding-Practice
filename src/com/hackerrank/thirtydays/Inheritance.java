package com.hackerrank.thirtydays;

import java.util.*;

class Person2 {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person2(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}

class Student extends Person2{
    private int[] testScores;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here
    public Student(String firstName, String lastName, int identification, int[] scores){
        super(firstName, lastName, identification);
        this.testScores = scores;
    };

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here
    public char calculate() {
        int sum = 0, average=0;
        char grade='K';
        for(int i=0; i<testScores.length; i++) {
            sum += testScores[i];
        }
        average = sum/testScores.length;
        if(90<=average && average<=100) {
            grade='O';
        } else if(80<=average && average<90) {
            grade='E';
        } else if(70<=average && average<80) {
            grade='A';
        } else if(55<=average && average<70) {
            grade='P';
        } else if(40<=average && average<55) {
            grade='D';
        } else if(average<40) {
            grade='T';
        }
        return grade;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}
