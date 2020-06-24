package com.hackerrank.thirtydays;

import java.io.*;
import java.util.*;

/*
sample input
4
2
3
4
1

SAMPLE OUTPUT
2 3 4 1
 */
public class LinkedList {

    public static  NodeLinkedList insert(NodeLinkedList head,int data) {
        //Complete this method
        //If the list is empty, create a new node.
        if(head==null) {
            head = new NodeLinkedList(data);
        } else {
            NodeLinkedList start = head;
            while(start.next!=null) {
                start = start.next;
            }
            start.next = new NodeLinkedList(data);
        }
        return head;
    }

    public static void display(NodeLinkedList head) {
        NodeLinkedList start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        NodeLinkedList head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}

class NodeLinkedList {
    int data;
    NodeLinkedList next;
    NodeLinkedList(int d) {
        data = d;
        next = null;
    }
}