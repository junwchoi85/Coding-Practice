/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.education.generics;

import java.io.IOException;
import java.util.List;
import java.util.function.Supplier;

/**
 *
 * @author junwh
 */
public class Pipeline {
    public static void main(String[] args) {
        // Before Java 8
        /*List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "alex");
        List<String> filtered = new ArrayList<>();
        for(String name : list) {
            if(name.length()==4) filtered.add(name);
        }
        Collections.sort(filtered);
        Iterator<String> iter = filtered.iterator();
        if(iter.hasNext()) System.out.println(iter.next());
        if(iter.hasNext()) System.out.println(iter.next());
        */
        /*List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
        list.stream().filter(n->n.length()==4)
                .sorted()
                .limit(2)
                .forEach(System.out::println);
        System.out.println("----------------------------");
        Stream.generate(() -> "Elsa")
                .filter(n -> n.length()==4)
                .limit(2)
                .forEach(System.out::println);
        Consumer<String> lineBreaker = System.out::println;
        lineBreaker.accept("----------------------------");
        */
        Pipeline pipeLine = new Pipeline();
        /*
        exceptionCaseStudy.create().stream().count();   //Exception must be caught!
        Supplier<List<String>> s = exceptionCaseStudy::create;  //incompatible thrown types!
        */
        /* Catch the exception and turn it into an unchecked exception. 
        *  Ugly, but works. Alternative is to create a wrapper method with the try/catch */
        Supplier<List<String>> s = () -> {
            try {
                return exceptionCaseStudy.create();
            } catch(IOException w) {
                throw new RuntimeException();
            }
        };
        Supplier<List<String>> s2 = exceptionCaseStudy::createSafe;
    }
    /* OCP p.215~216 */
    public static ExceptionCaseStudy exceptionCaseStudy = new ExceptionCaseStudy(); 
    public static class ExceptionCaseStudy {
        private List<String> create() throws IOException {
            throw new IOException();
        }
        //Wrapper method
        private List<String> createSafe() {
            try {
                return exceptionCaseStudy.create();
            } catch(IOException e) {
                throw new RuntimeException();
            }
        }
    }
    
    
}



































