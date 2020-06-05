/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackerrank.thirtydays;
import java.util.*;
/**
 *Task
    Given an integer, n, perform the following conditional actions:

    If  is odd, print Weird
    If  is even and in the inclusive range of  to , print Not Weird
    If  is even and in the inclusive range of  to , print Weird
    If  is even and greater than , print Not Weird
 * @author junwh
 */
public class IntroToConditionalStatements {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(n%2!=0) {
            System.out.println("Weird");
        } else {
            if(2<=n && n<=5) {
                System.out.println("Not Weird");
            } else if(6<=n && n<=20) {
                System.out.println("Weird");
            } else if(20<n) {
                System.out.println("Not Weird");
            }
        }
        scanner.close();
    }
}


