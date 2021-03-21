/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.education.generics;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 *
 * @author junwh
 */
public class QueueExcercise {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<Integer>();
        queue.offer(10);
        queue.offer(4);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        /*
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.offer(10);
        stack.offer(4);
        stack.push(5);
        stack.peek();*/
        //
        ArrayDeque<String> greetings = new ArrayDeque<>();
        greetings.push("Hello");
        greetings.push("Hi");
        greetings.push("Ola");
        greetings.pop();
        greetings.peek();
        while(greetings.peek()!=null) {
            System.out.println(greetings.pop());
        }
    }
}





