package com.hackerrank.thirtydays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*
    url : https://www.hackerrank.com/challenges/30-binary-numbers/problem
 */
public class BinaryNumbers {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        //convert an 10-base integer into binary
        Integer remainder;
        List<Integer> binaryQueue = new ArrayList<>();
        do {
            remainder = n%2;
            n/=2;
            binaryQueue.add(0, remainder);
        } while(n>0);
        int maxConsecutiveCnt=0,
                consecutiveCnt=0;
        for(Integer b : binaryQueue) {
            //count consecutive 1s.

            if(b.intValue()==1) {
                ++consecutiveCnt;
                if(maxConsecutiveCnt<consecutiveCnt) {
                    maxConsecutiveCnt = consecutiveCnt;
                }
            } else if(b.intValue()==0) {
                //reset counter
                if(maxConsecutiveCnt<consecutiveCnt) {
                    maxConsecutiveCnt = consecutiveCnt;
                }
                consecutiveCnt=0;
            }
        }
        System.out.println(maxConsecutiveCnt);
        scanner.close();
    }
}
