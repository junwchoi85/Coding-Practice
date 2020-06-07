/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hackerrank.basicstatistics;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author junwh
 */
public class MeanMedianMode {    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        int[] arr = new int[n];
        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        Arrays.sort(arr);
        //1. calculate Mean
        double totSum = 0;
        for(int i=0; i<n; i++) {
            totSum+=arr[i];
        }
        System.out.println(totSum/n);
        //2. Calculate Median
        double middle = arr[4] + arr[5];
        System.out.println(middle/2);
        //3. Calculate Mode
        int mode = arr[0];
        for(int i=1; i<n; i++) {
            if(arr[i-1]==arr[i]) {
                mode = arr[i];
            }
        }
        
    }
}













