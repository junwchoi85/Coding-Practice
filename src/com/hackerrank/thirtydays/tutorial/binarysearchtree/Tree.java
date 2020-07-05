package com.hackerrank.thirtydays.tutorial.binarysearchtree;

public interface Tree<T extends Comparable> {
    public boolean isEmpty();
    public int cardinality();
    public boolean member(T element);
    public NonEmptyBST<T> add(T element);
}
