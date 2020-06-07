package com.hackerrank.thirtydays;

import java.util.*;
import java.io.*;

public class DictionariesAndMaps {


    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Integer> dictionaries = new HashMap<>();

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            dictionaries.put(name, phone);
        }
        System.out.println();
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            Integer number = dictionaries.get(s);
            if(null!=number) {
                System.out.println(s + "=" + number);
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
