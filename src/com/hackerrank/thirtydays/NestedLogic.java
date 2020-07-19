package com.hackerrank.thirtydays;

import java.io.*;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
/*
*Sample Input
31 8 2004
20 1 2004
 */
public class NestedLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input1 = scanner.nextLine().split(" ");
        LocalDate dateReturned = LocalDate.of(Integer.parseInt(input1[2]), Integer.parseInt(input1[1]), Integer.parseInt(input1[0]));

        String[] input2 = scanner.nextLine().split(" ");
        LocalDate dateExpected = LocalDate.of(Integer.parseInt(input2[2]), Integer.parseInt(input2[1]), Integer.parseInt(input2[0]));

        Period period = Period.between(dateExpected, dateReturned);
        int days = period.getDays();
        int fine=0;
        if(days>0) {
            if(dateExpected.getYear() != dateReturned.getYear()) {
                fine = 10000;
            } else if(dateExpected.getMonthValue() != dateReturned.getMonthValue()) {
                fine = 500*( dateReturned.getMonthValue()-dateExpected.getMonthValue());
            } else {
                fine = 15 * days;
            }
        }
        System.out.println(fine);
        scanner.close();
    }

}
