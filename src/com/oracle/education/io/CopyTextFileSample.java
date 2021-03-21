/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.education.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author junwh
 */
public class CopyTextFileSample {
    
    public static List<String> readFile(File source)
            throws IOException {
        
        List<String> data = new ArrayList<>();
        
        try(BufferedReader reader = new BufferedReader(new FileReader(source))) {
            String s;
            while((s = reader.readLine())!=null) {
                data.add(s);
            }
        }
        return data;
    }
    
    public static void writeFile(List<String> data, File destination) 
            throws IOException {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(destination))) {
            for(String s: data) {
                writer.write(s);
                writer.newLine();
            }
        }
    }
    
    public static void main(String[] args)
            throws IOException {
        File source = new File("zoo.csv");
        File destination = new File("zooCopy.csv");
        List<String> data = readFile(source);
        for(String record: data) {
            System.out.println(record);
        }
//        data.forEach((record) -> {
//            System.out.println(record);
//        });
        writeFile(data, destination);
    }
}




















