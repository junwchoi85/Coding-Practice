package com.hackerrank.problemsolving.warmup;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PlusMinus {
    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int n = arr.length;
        double positive=0, negative=0, zeros=0;
        for(int i=0; i<n; i++) {
            if(arr[i]>0) {
                ++positive;
            } else if(arr[i]<0) {
                ++negative;
            } else if(arr[i]==0) {
                ++zeros;
            }
        }
        System.out.printf("%f%n", positive/n);
        System.out.printf("%f%n", negative/n);
        System.out.printf("%f%n", zeros/n);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
