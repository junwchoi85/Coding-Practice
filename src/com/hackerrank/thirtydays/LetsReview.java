package com.hackerrank.thirtydays;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class LetsReview {
    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        List<String> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            list.add(scanner.nextLine());
        }

        for(String str : list) {
            int length = str.length()/2;
            char[] odd, even;
            int oddIndx=0, evenIndx=0;
            if(str.length()%2==0) {
                odd = new char[length];
                even = new char[length];
            } else {
                odd = new char[length+1];
                even = new char[length];
            }
            for(int i=1; i<=str.length(); i++) {
                if(i%2==1) {
                    odd[oddIndx++] = str.charAt(i-1);
                } else {
                    even[evenIndx++] = str.charAt(i-1);
                }
            }

            for(int i=0; i<oddIndx; i++) {
                System.out.print(odd[i]);
            }
            System.out.print(" ");
            for(int i=0; i<evenIndx; i++) {
                System.out.print(even[i]);
            }
            System.out.printf("%n");
        }
    }
}
