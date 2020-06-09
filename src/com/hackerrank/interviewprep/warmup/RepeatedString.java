package com.hackerrank.interviewprep.warmup;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * url : https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */
public class RepeatedString {
    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        final char a = 'a';
        //instead of concatenating every String, let's just count the 'a's.
        long aCount = 0;
        for(int i=0; i<s.length(); i++) {
            if(a==s.charAt(i)) {
                ++aCount;
            }
        }
        long quotient=n/s.length();
        aCount*=quotient;
        long remainder=n%s.length();
        for(int i=0; i<remainder; i++) {
            if(a==s.charAt(i)) {
                ++aCount;
            }
        }
        return aCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
