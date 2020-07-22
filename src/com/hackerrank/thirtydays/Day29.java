package com.hackerrank.thirtydays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day29 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            //TODO:
            int maxBitwise=0;
            LOOP:for(int i=1; i<n; i++) {
                for(int j=i+1; j<=n; j++) {
                    int bitwiseAnd = i & j;
                    if((bitwiseAnd<k) && (bitwiseAnd>maxBitwise)) {
                        maxBitwise = bitwiseAnd;
                    }
                    //If the result is the maximum possible value, break.
                    if(bitwiseAnd==(k-1)) {
                        maxBitwise = bitwiseAnd;
                        break LOOP;
                    }
                }
            }
            System.out.println(maxBitwise);
        }

        scanner.close();
    }
}
