package com;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueImpl {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq1 = new PriorityQueue<>(); //Min heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // Max heap
        pq.add(2);
        pq.add(5);
        pq.add(3);
        pq.add(7);
        pq.add(4);

        System.out.println(pq.poll());


    }
}
