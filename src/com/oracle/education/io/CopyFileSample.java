/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.education.io;

import java.io.*;

/**
 *
 * @author junwh
 */
public class CopyFileSample {
    public static void copy(File source, File destination)
            throws IOException {
        
        try(InputStream in = new FileInputStream(source);
            OutputStream out = new FileOutputStream(destination)) {
            
            int b;
            while((b=in.read())!=-1) {
                out.write(b);
            }
        }
    }
    
    public static void main(String[] args) 
        throws IOException {
        
        File source = new File("Zoo.class");
        File destination = new File("ZooCopy.class");
        copy(source, destination);
    }
}






