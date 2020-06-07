package com.hackerrank.interviewprep.warmup;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/**
 * url : https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */
public class CountingValleys {
    /* Function Description
        Complete the countingValleys function in the editor below. It must return an integer that denotes the number of valleys Gary traversed.

        countingValleys has the following parameter(s):

        n: the number of steps Gary takes
        s: a string describing his path
     */
    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int height=0;
        boolean flagValley = false;
        int valleyCnt=0;
        char up = 'U';
        char down = 'D';

        for(int i=0; i<n; i++) {
            if(s.charAt(i)==up) {
                height++;
                if(flagValley && height>=0) {
                    flagValley = false;
                    valleyCnt++;
                }
            } else if(s.charAt(i)==down) {
                height--;
                if(!flagValley && height<0) {
                    flagValley = true;
                }
            }
        }
        return valleyCnt;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
