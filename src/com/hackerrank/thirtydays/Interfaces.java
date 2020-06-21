package com.hackerrank.thirtydays;

import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
    int divisorSum(int n);
}

class Calculator2 implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int divisorSum = 0;
        for(int i=1; i<=n; i++) {
            if(n%i==0) {
                divisorSum += i;
            }
        }
        return divisorSum;
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator2();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
        System.out.println(sum);
    }
}
