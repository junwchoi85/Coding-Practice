package com.hackerrank.interviewprep.warmup;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * url : https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup&h_r=next-challenge&h_v=zen
 */
public class JumpingOnTheClouds {
    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        /* We must make the most jump whenever possible.
         * My approach is to check next-next cloud and jump 2 if possible. */
        //set initial jump count and next index.
        int jumpCnt = 0;
        final int shortJump = 0;
        final int longJump = 1;
        int nextIndex = 1;

        do{
            //must jump.
            if(c[nextIndex]==1) {
                nextIndex = nextIndex + longJump;
                ++jumpCnt;
            } else if(c[nextIndex]==0) {
                if((nextIndex+1<c.length) && (c[nextIndex+1]==0)) {
                    //ok, then make long jump
                    nextIndex = nextIndex + longJump;
                } else {
                    nextIndex = nextIndex + shortJump;
                }
                ++jumpCnt;
            }
        } while(++nextIndex<c.length);
        return jumpCnt;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
