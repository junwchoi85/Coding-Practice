package com.hackerrank.problemsolving;

import java.io.*;
import java.lang.reflect.Array;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class MiniMaxSum {
    // Complete the miniMaxSum function below.
    // test case: 256741038 623958417 467905213 714532089 938071625
    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        double miniSum = arr[0]+arr[1]+arr[2]+arr[3];
        double maxSum = arr[1]+arr[2]+arr[3]+arr[4];

        System.out.printf("%.0f" + " " + "%.0f", miniSum, maxSum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
