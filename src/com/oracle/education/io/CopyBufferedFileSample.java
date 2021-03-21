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
public class CopyBufferedFileSample {
    public static void copy(File source, File destination)
            throws IOException {
        
        try(InputStream in = new BufferedInputStream(new FileInputStream(source));
            OutputStream out = new BufferedOutputStream(new FileOutputStream(destination))) {
            
            byte[] buffer = new byte[1024];
            int lengthRead;
            while((lengthRead = in.read(buffer))>0) {
                out.write(buffer, 0, lengthRead);
                out.flush();
            }
        }
    }
}








