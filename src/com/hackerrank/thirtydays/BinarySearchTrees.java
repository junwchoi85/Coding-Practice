package com.hackerrank.thirtydays;

import java.util.*;

class Node3 {
    Node3 left,right;
    int data;
    Node3(int data){
        this.data=data;
        left=right=null;
    }
}

public class BinarySearchTrees {
    public static int getHeight(Node3 root){
        //Write your code here
        int lHeight, rHeight;
        if(root.left==null) {
            lHeight = -1;
        } else {
            lHeight = getHeight(root.left);
        }
        if(root.right==null) {
            rHeight = -1;
        } else {
            rHeight = getHeight(root.right);
        }

        return 1 + (lHeight>rHeight ? lHeight : rHeight);
    }

    public static Node3 insert(Node3 root, int data){
        if(root==null){
            return new Node3(data);
        }
        else{
            Node3 cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node3 root=null;
        while(T-- > 0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}
