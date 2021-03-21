/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.education.generics;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 *
 * @author junwh
 */
public class CollectorExcercise {
    public static void main(String[] args) {
        Consumer<Object> resultPrinter = System.out::println;
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        //String result1 = ohMy.collect(Collectors.joining(", "));
        //Double result2 = ohMy.collect(Collectors.averagingInt(String::length));
        //resultPrinter.accept(String.valueOf(result2));
//        TreeSet<String> result3 = ohMy.filter(s -> s.startsWith("t"))
//                .collect(Collectors.toCollection(TreeSet::new));
        
//        Map<String, Integer> map = ohMy.collect(Collectors.toMap(s -> s, String::length));
//        Map<Integer, String> map = ohMy.collect(Collectors.toMap(String::length, k->k));    //Run time exception thrown!
/*        Map<Integer, String> map = ohMy.collect(Collectors.toMap(String::length,    //keyMapper
                                                                 k -> k,            //valueMapper
                                                                 (s1, s2) -> s1 + " " + s2,     //mergeFunction
                                                                 TreeMap::new));    //mapSupplier
        resultPrinter.accept(map.getClass());*/
        //Map<Integer, String> map = ohMy.collect(Collectors.toMap(String::length, k -> k, (s1, s2) -> s1 + " " + s2));
        //resultPrinter.accept(map.getClass());
        
        //----------------------------------------------------------------------
        // Collecting Using Grouping, Partitioning, and Mapping
        //Map<Integer, List<String>> map = ohMy.collect(Collectors.groupingBy(String::length));
        //Map<Integer, Set<String>> map = ohMy.collect(Collectors.groupingBy(String::length, Collectors.toSet()));
        //TreeMap<Integer, Set<String>> map = ohMy.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toSet()));
        //TreeMap<Integer, List<String>> map = ohMy.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));
        //Map<Boolean, List<String>> map = ohMy.collect(Collectors.partitioningBy(s -> s.length() <= 5));
        //Map<Boolean, Set<String>> map = ohMy.collect(Collectors.partitioningBy(s -> s.length() <= 7, Collectors.toSet()));
        //Map<Integer, Long> map = ohMy.collect(Collectors.groupingBy(String::length, Collectors.counting()));
        /*Map<Integer, Optional<Character>> map = ohMy.collect(
                Collectors.groupingBy(
                        String::length,
                        Collectors.mapping(s -> s.charAt(0), 
                                Collectors.minBy(Comparator.naturalOrder()))));*/
        resultPrinter.accept(map);
        
    }
}































