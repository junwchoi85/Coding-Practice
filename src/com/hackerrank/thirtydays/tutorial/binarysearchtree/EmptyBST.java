package com.hackerrank.thirtydays.tutorial.binarysearchtree;

public class EmptyBST<T extends Comparable> implements Tree<T>{
    public EmptyBST() {

    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public int cardinality() {
        return 0;
    }

    @Override
    public boolean member(T element) {
        return false;
    }

    @Override
    public NonEmptyBST<T> add(T element) {
        return new NonEmptyBST<T>(element);
    }
}
