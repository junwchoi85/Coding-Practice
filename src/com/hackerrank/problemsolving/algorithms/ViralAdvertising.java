package com.hackerrank.problemsolving.algorithms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*
**Function Description**
Complete the viralAdvertising function in the editor below.
It should return the cumulative number of people who have liked the ad at a given time.
* Sample Input
3
*Sample Output
9
 */
public class ViralAdvertising {
    // Complete the viralAdvertising function below.
    /*
    abs	    Returns the absolute value of the argument.         	Double, float, int, long
    round	Returns the closed int or long (as per the argument)	double or float
    ceil	Returns the smallest integer that is greater than
            or equal to the argument	                            Double
    floor	Returns the largest integer that is less than
            or equal to the argument	                            Double
    min	    Returns the smallest of the two arguments	            Double, float, int, long
    max	    Returns the largest of the two arguments	            Double, float, int, long
     */
    static int viralAdvertising(int n) {
        int numShared = 5;
        int numLiked = 0;
        for( int i=0; i<n; i++) {
            int liked = (int)Math.floor(numShared/2);
            numLiked += liked;
            numShared = liked*3;
        }
        return numLiked;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = viralAdvertising(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
