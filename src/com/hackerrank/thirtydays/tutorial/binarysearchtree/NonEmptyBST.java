package com.hackerrank.thirtydays.tutorial.binarysearchtree;

public class NonEmptyBST<T extends Comparable> implements Tree<T> {
    T data;
    Tree<T> left;
    Tree<T> right;

    public NonEmptyBST(T element) {
        data = element;
        left = new EmptyBST<T>();
        right = new EmptyBST<T>();
    }

    public NonEmptyBST(T element, Tree<T> left, Tree<T> right) {
        this.data = element;
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int cardinality() {
        return 1 + left.cardinality() + right.cardinality();
    }

    @Override
    public boolean member(T element) {
        if(data == element) {
            return true;
        } else {
            if(element.compareTo(data) < 0) {
                return left.member(element);
            } else {
                return right.member(element);
            }
        }
    }

    @Override
    public NonEmptyBST<T> add(T element) {
        if(data == element) {
            return this;
        } else {
            if(element.compareTo(data) < 0) {
                return new NonEmptyBST<T>(data, left.add(element), right);
            } else {
                return new NonEmptyBST<T>(data, left, right.add(element));
            }
        }
    }
}
