package com.hackerrank.thirtydays;

import java.util.*;
import java.io.*;

/*
Sample input
4
3 5
2 4
-1 -2
-1 3

Sample output
243
16
n and p should be non-negative
n and p should be non-negative
 */
class Calculator {
    Calculator() {

    }

    int power(int n, int p) throws Exception {
        if(n<0 || p<0) {
            throw new Exception("n and p should be non-negative");
        }
        int result = 1;
        for(int i=0; i<p; i++) {
            result *= n;
        }
        return result;
    }
}

public class MoreExceptions {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
