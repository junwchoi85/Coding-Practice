package com.hackerrank.problemsolving.algorithms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*
Sample Input 0
0 3 4 2

Sample Output 0
YES

Sample Input 1
0 2 5 3

Sample Output 1
NO
 */
public class Kangaroo {
    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        boolean isSuccess = false;
        String result = "NO";
        int x1StartingPoint=x1;
        int x2StartingPoint=x2;
        while(true) {
            x1+=v1;
            x2+=v2;
            if(x1==x2) {
                isSuccess = true;
                break;
            } else if(x1StartingPoint<x2StartingPoint && x1>x2) {
                break;
            } else if(x1StartingPoint>x2StartingPoint && x1<x2) {
                break;
            }
        }
        if(isSuccess) {
            result = "YES";
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        String result = kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
