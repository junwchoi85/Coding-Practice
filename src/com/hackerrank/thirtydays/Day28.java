package com.hackerrank.thirtydays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.Arrays;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day28 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        List<String> firstNames = new ArrayList<>();
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];

            if(emailID.endsWith("@gmail.com")) {
                firstNames.add(firstName);
            }

        }
        Collections.sort(firstNames);

        firstNames.forEach(System.out :: println);

        scanner.close();
    }
}
