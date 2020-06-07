package com.hackerrank.interviewprep.warmup;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * Sock Merchant(https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup)
 sample input
 9
 10 20 20 10 10 30 50 10 20
 sample output
 3
 */
public class SockMerchant {
    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int matchingSockCnt = 0;
        HashMap<Integer, Integer> match = new HashMap<>();
        for(int i=0; i<ar.length; i++) {
            int sock = ar[i];
            if(match.get(sock)==null) {
                match.put(sock, 1);
            } else {
                match.replace(sock, match.get(sock)+1);
            }
            if(match.get(sock)%2==0) {
                matchingSockCnt++;
            }
        }
        return matchingSockCnt;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
