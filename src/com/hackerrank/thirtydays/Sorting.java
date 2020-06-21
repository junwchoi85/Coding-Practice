package com.hackerrank.thirtydays;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here
        // Sort the array in ascending order using the Bubble Sort algorithm
        int numberOfSwaps=0;
        boolean swapped;
        do {
            swapped = false;
            for(int i=1; i<n; i++) {
                if(a[i-1]>a[i]) {
                    //swap
                    int temp = a[i];
                    a[i] = a[i-1];
                    a[i-1] = temp;
                    swapped = true;
                    ++numberOfSwaps;
                }
            }
        } while(swapped);
        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n-1]);
    }

}
