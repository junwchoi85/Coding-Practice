package com.hackerrank.thirtydays;

import java.io.*;
import java.util.*;

public class RunningTimeAndComplexity {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){
            boolean isPrime = true;
            int ele = sc.nextInt();
            if(ele==1) {
                isPrime = false;
            } else {
                for(long i=2 ; i<=Math.sqrt(ele) ; i++) {
                    if(ele%i==0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            /**
             * Conjecture: Every composite number has a proper factor less than or equal to its square root.
             *
             * Proof: We use proof by contradiction.
             * Suppose n is composite. Then, we can write n = ab, where a and b are both between 1 and n.  If both a > \sqrt{n} and b> \sqrt{n}, then (a)(b) > (\sqrt{n})(\sqrt{n}) which means that ab > n. This contradicts our assumption that ab = n. Hence, at least one of a, b is less than or equal to \sqrt{n}. That is, if n is composite,  , then n has a prime factor p \le \sqrt{n}.
             */

            System.out.println(isPrime ? "Prime" : "Not prime");
        }
        sc.close();
    }
}
