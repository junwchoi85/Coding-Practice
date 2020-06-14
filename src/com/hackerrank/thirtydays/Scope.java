package com.hackerrank.thirtydays;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Difference {
    private int[] elements;
    public int maximumDifference;

    // Add your code here
    public Difference(int[] a) {
        this.elements = a;
    }
    public void computeDifference() {
        //how about we sort the list first, than take the smallest and the biggest element.
        //here, we'll do bubble sort.
        for(int i=0; i<this.elements.length-1; i++) {
            for(int j=0; j<this.elements.length-1-i; j++) {
                if (elements[j] > elements[j+1]) {
                    //swap two element.
                    int temp = elements[j];
                    elements[j] = elements[j+1];
                    elements[j+1] = temp;
                }
            }
        }
        //End of Bubble sort.

        this.maximumDifference = elements[elements.length-1] - elements[0];
    }
} // End of Difference class

public class Scope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
