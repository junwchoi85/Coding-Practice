package com.hackerrank.problemsolving.algorithms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/*
Sample Input
2 3
2 4
16 32 96

Sample Output
3
 */
public class BetweenTwoSets {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);
        /* Stream Example */
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int total = Result2.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Result2 {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        Collections.sort(a);
        Collections.sort(b);

        //get all the divisor for the smallest element of b.
        Integer smallestOfB = b.get(0);
        List<Integer> divisors = new ArrayList<>();
        for(int i=1 ; i<=smallestOfB; i++) {
            if(smallestOfB%i==0) {
                divisors.add(i);
            }
        }
        //get the common divisors, which will divide every target in b.
        HashSet<Integer> commonDivisors = new HashSet<>();
//        List<Integer> commonDivisors = new ArrayList<>();
        for(Integer divisor : divisors) {
            for(Integer dividend : b) {
                if(dividend % divisor==0) {
                    commonDivisors.add(divisor);
                }
            }
        }
        HashSet<Integer> commonDividend = new HashSet<>();
        for(Integer dividend : commonDivisors) {
            for(Integer divisor : a) {
                if(dividend % divisor==0) {
                    commonDividend.add(dividend);
                }
            }
        }
        return 0;
    }

}