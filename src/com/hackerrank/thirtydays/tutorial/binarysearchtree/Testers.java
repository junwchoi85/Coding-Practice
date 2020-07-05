package com.hackerrank.thirtydays.tutorial.binarysearchtree;

public class Testers {

    public static void checkIsEmpty(Tree tree) throws Exception{
        if(tree instanceof EmptyBST) {
            if(!tree.isEmpty()) {
                throw new Exception("All is not good. The tree is an EmptyBST and it is non-empty");
            }
        } else if(tree instanceof NonEmptyBST) {
            if(!tree.isEmpty()) {
                throw new Exception("All is not good. The tree is an NonEmptyBST and it is empty");
            }
        }
    }
}
