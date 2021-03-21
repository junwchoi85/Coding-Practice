/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.education.generics;

import java.time.LocalDate;
import java.util.function.Supplier;

/**
 *
 * @author junwh
 */
public class ImplementSupplier {
    Supplier<LocalDate> s1 = LocalDate::now;
    Supplier<LocalDate> s2 = () -> LocalDate.now();
    
    LocalDate d1 = s1.get();
    LocalDate d2 = s2.get();
    
    public static void main(String [] args) {
        
    }
}




