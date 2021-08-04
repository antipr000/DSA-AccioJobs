package com;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Deque;

public class QueueCollection{
    public static void main() {
        Queue<Integer> q = new LinkedList<>();
        q.add(2);
        q.add(3);
        q.add(4);
        while (!q.isEmpty()){
            System.out.println(q.poll());
        }

        Deque<Integer> dq = new LinkedList<>();
        dq.offerFirst(2); //add at front
        dq.offerFirst(3);
        dq.offerLast(4);
        System.out.println(dq);

        System.out.println(dq.pollFirst());

        System.out.println(dq.pollLast());

    }
}

class SlidingWindowMin{
    public void slidingWindowMinimum(int []a, int k){
        Deque<Integer> d = new LinkedList<>();
        int n = a.length;
        int [] ans = new int[n-k+1];

        for(int i=0; i<k; i++){
            while(!d.isEmpty() && d.peekLast() > a[i]){
                d.pollLast();
            }
            d.offerLast(a[i]);
        }

        ans[0] = d.peekFirst();
        for(int i=k; i<n; i++){
            if(a[i-k] == d.peekFirst()){
                d.pollFirst();
            }

            while(!d.isEmpty() && d.peekLast() > a[i]){
                d.pollLast();
            }

            d.offerLast(a[i]);
            ans[i-k+1] = d.peekFirst();
        }
    }
}

class Node{
    int val;
    Node next;

    Node(int v, Node n){
        val = v;
        next = n;
    }
}

class QueueImpl{
    Node head, tail;

    QueueImpl(){
        head = tail = null;
    }

    boolean isEmpty(){
        if(head == null) return true;

        return false;
    }

    void add(int val){
        //Add an element at the back of the queue

        if(head == null){
            head = new Node(val, null);
            tail = head;
            return;
        }

        //1->2->3->4

        tail.next = new Node(val, null);
        tail = tail.next;
    }

    int poll(){
        //Remove the front element and return its value
        if(head == null) return -1;
        int val = head.val;
        head = head.next;
        if(head == null) tail = null;
        return val;
    }

    int peek(){
        //Get access to the front element
        if(head == null) return -1;
        return head.val;
    }
}