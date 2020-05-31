package com.hackerrank.thirtydays;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DataTypes {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int i2 = 0;
        double d2 = 0.0;
        String s2 = "";

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        i2 = Integer.valueOf(scan.next());
        d2 = Double.valueOf(scan.next());
        //JW: this reads the white space at the end.
        scan.nextLine();
        s2 = scan.nextLine();
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+i2);
        /* Print the sum of the double variables on a new line. */
        System.out.println(d+d2);
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s+s2);
        scan.close();
    }
}
