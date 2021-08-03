package com;

import java.util.Stack;

public class StackCollection {
    public static void main(String[] args) {
        /*
        * A = [2, 3, 1, 2, 1, 4, 5, 2]
        * [3, 4, 2, 4, 4, 5, -1, -1]
        * In the stack we will only keep elements whose next greater element is not found
        * yet
        *
        * [5, 3, 2, 1]  3
        * */

        /*
        *
        * Find the previous lesser element
        * [2, 3, 1, 4, 5, 2, 1, 4]
        * [-1, 2, -1, 1, 4, 1, -1, 1]
        * */
        int [] arr = {2, 3, 1, 2, 1, 4, 5, 2};
        Stack<Integer> s = new Stack<>();
        int n = arr.length;
        int []nge = new int [n];

        for(int i=0; i<n; i++){
            while(!s.empty() && arr[s.peek()] < arr[i]){
                nge[s.pop()] = arr[i];
            }
            s.push(i);
            /*arr[7] = 2
            5<2
            * s = [6]
            * i = 7
            * nge = [3, 4, 2, 4, 4, 5, -1, -1]
            * */
        }

        while(!s.empty()){
            nge[s.pop()] = -1;
        }

        int [] previousLesser = new int[n];
        for(int i=n-1; i>=0; i--){
            while(!s.empty() && arr[s.peek()] > arr[i]){
                previousLesser[s.pop()] = arr[i];
            }
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

class StackImpl{
    private Node head;
    private int size;
    StackImpl(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        if(head == null) return true;
        return false;
    }

    //push an element into the top of stack
    public void push(int val){
        size += 1;
        if(head == null){
            head = new Node(val, null);
            return;
        }
        // 3->1->2
        Node temp = new Node(val, head);
        head = temp;
    }

    public void pop(){
        //LIFO
        size -= 1;
        if(head == null)
            return;
        //2->3
        head = head.next;
    }

    public int poll(){
        //Access the top element and remove it
        int val = peek();
        pop();
        return val;
    }

    public int peek(){
        if(head == null) return -1;
        return head.val;
    }

    public int getSize(){
        return size;
    }
}