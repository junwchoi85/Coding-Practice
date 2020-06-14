package com.hackerrank.thirtydays;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Sample Input 0
3

Sample Output 0
3

Sample Input 1
za

Sample Output 1
Bad String

 */
public class Exceptions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try {
            System.out.println(Integer.parseInt(S));
        } catch(NumberFormatException numberFormatException) {
            System.out.println("Bad String");
        }

    }
}
