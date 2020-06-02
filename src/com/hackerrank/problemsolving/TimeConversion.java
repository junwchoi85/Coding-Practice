package com.hackerrank.problemsolving;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion {
    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        //Retrieve last 2 character to check PM|AM
        int length = s.length();
        String format = s.trim().substring(length-2);

        String time = s.trim().substring(0, length-2);
        String[] arr = time.split(":");
        if("PM".equals(format)) {
            if(Integer.valueOf(arr[0])<12) {
                arr[0] = String.valueOf(Integer.valueOf(arr[0]) + 12);
            }
        } else if("AM".equals(format)) {
            if(Integer.valueOf(arr[0])==12) {
                arr[0] = "00";
            }
        }
        return arr[0] + ":"+ arr[1] + ":" + arr[2];
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
