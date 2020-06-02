package com.hackerrank.problemsolving.warmup;

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

    //2744467344
    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);

        long miniSum = (long)arr[0]+(long)arr[1]+(long)arr[2]+(long)arr[3];
        long maxSum = (long)arr[1]+(long)arr[2]+(long)arr[3]+(long)arr[4];
        for(int i=1; i<arr.length; i++) {
            System.out.print((long)arr[i] + " ");
        }
        float maxSum2 = (float)arr[1]+(float)arr[2]+(float)arr[3]+(float)arr[4];
        for(int i=1; i<arr.length; i++) {
            System.out.print((float)arr[i] + " ");
            //4.67905216E8 6.239584E8 7.145321E8 9.3807162E8 2063136757 2744467344 2744467200.000000
            /**
             * Casting a int value into a float results in different results. why?
             */
        }
        System.out.printf("%d" + " " + "%d" + " " + "%f", miniSum, maxSum, maxSum2);
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
