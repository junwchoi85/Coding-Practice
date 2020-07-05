package com.hackerrank.thirtydays;

import java.io.*;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class NestedLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input1 = scanner.nextLine().split(" ");
        LocalDate dateReturned = LocalDate.of(Integer.parseInt(input1[2]), Integer.parseInt(input1[1]), Integer.parseInt(input1[0]));

        String[] input2 = scanner.nextLine().split(" ");
        LocalDate dateExpected = LocalDate.of(Integer.parseInt(input2[2]), Integer.parseInt(input2[1]), Integer.parseInt(input2[0]));

        Period period = Period.between(dateExpected, dateReturned);
        int days = period.getDays();
        if(days>0) {
            System.out.println(days * 15);
        }period.

        scanner.close();
    }

}
