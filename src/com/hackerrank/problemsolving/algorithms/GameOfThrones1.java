package com.hackerrank.problemsolving.Algorithms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * PROBLEM
 * Dothraki are planning an attack to usurp King Robert's throne.
 * King Robert learns of this conspiracy from Raven and plans to lock the single door through which the enemy can enter his kingdom.
 * But, to lock the door he needs a key that is an anagram of a palindrome.
 * He starts to go through his box of strings, checking to see if they can be rearranged into a palindrome.
 *
 * For example, given the string s=[aabbccdd], one way it can be arranged into a palindrome is abcddcba.
 *
 * FUNCTION DESCRIPTION
 * Complete the gameOfThrones function below to determine whether a given string can be rearranged into a palindrome. If it is possible, return YES, otherwise return NO.
 *
 * gameOfThrones has the following parameter(s):
 *
 * s: a string to analyze
 * */
public class GameOfThrones1 {
    // Complete the gameOfThrones function below.
    static String gameOfThrones(String s) {
        String result = "YES";

        char[] arr = s.toCharArray();

        //HashMap to store characters and its occurrences.
        HashMap<Character, Integer> m = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            if( m.containsKey(arr[i]) ) {
                m.put(arr[i], m.get(arr[i])+1);
            } else {
                m.put(arr[i], 1);
            }
        }
        final int maxOddCnt=1;
        int oddCnt=0;
        for(Map.Entry<Character, Integer> entry : m.entrySet()) {
            if(entry.getValue()%2==0) {

            } else {
                if(maxOddCnt>oddCnt) {
                    ++oddCnt;
                } else {
                    result = "NO";
                    break;
                }
            }
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = gameOfThrones(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
