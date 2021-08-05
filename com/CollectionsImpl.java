package com;
import com.sun.source.tree.Tree;
import com.sun.source.util.Trees;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.HashSet;

public class CollectionsImpl{
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(3);
        ts.add(1);
        ts.add(2);
        for(Integer e: ts){
            System.out.print(e + " ");
        }

        System.out.println("");

        ts.remove(2);
        System.out.println(ts);

        ts.add(1);
        System.out.println(ts);

        System.out.println("Is 2 in treeset: " + ts.contains(2));
        System.out.println("Is 1 in treeset: " + ts.contains(1));

        ts.add(2);
        ts.add(4);
        ts.add(5);
        ts.add(6);

        System.out.println(ts); //[1, 2, 3, 4, 5, 6] -> [1, 2]
        Iterator tailItr = ts.tailSet(3).iterator();
        while (tailItr.hasNext()){
            System.out.print(tailItr.next() + " ");
        }
        System.out.println("");
        Iterator itr = ts.headSet(3).iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
        System.out.println("");
        //Iterate from 3 to 5
        Iterator randomItr = ts.tailSet(3).headSet(6).iterator();
        while (randomItr.hasNext()){
            System.out.print(randomItr.next() + " ");
        }
        System.out.println("");
        for(Iterator it = ts.iterator(); it.hasNext();){
            System.out.print(it.next() + " ");
        }
    }
}

/*
* Given an array of elements find if two elements are same
*
* [4, 1, 2, 3, 1, 5] Ai<=10^9
* */

class DuplicateElements{
    public boolean hasDuplicate(int []arr){
        TreeSet<Integer> ts = new TreeSet<>();

        for(int i=0; i<arr.length; i++){
//            if(ts.contains(arr[i])){
//                return false;
//            }
            ts.add(arr[i]);
        }

        return ts.size() != arr.length;
    }
}

class ContainsDuplicateII{
    public boolean hasDuplicate(int []arr, int k, int t){
        /*
        * Find if there are 2 indices i and j such that abs(arr[i] - arr[j]) = t and
        * abs(i-j)<=k. All elements are unique in array. A[i]<=10^9
        * */

        TreeSet<Integer> ts = new TreeSet<>();

        for(int i = 0; i<arr.length; i++){
            if(i>=k){
                ts.remove(arr[i-k]);
            }

            /*
            * abs(A[i] - A[j]) = t
            * A[i]>=A[j] : A[i] - A[j] = t => or A[i] = t + A[j]
            * A[i]<A[j] : A[j] - A[i] = t => or A[i] = A[j] - t
            * */

            int val1 = arr[i] + t;
            int val2 = arr[i] - t;

            if(ts.contains(val1) || ts.contains(val2)){
                return true;
            }
        }

        return false;
    }
}

class MedianOfDataStream{

    void balance(TreeSet<Integer>lo, TreeSet<Integer> hi){
        if(lo.size() > hi.size() + 1){
            hi.add(lo.pollLast());
        } else if(hi.size() > lo.size()){
            lo.add(hi.pollFirst());
        }
    }

    void medianOfDataStream(int []arr){
        TreeSet<Integer> lo = new TreeSet<>();
        TreeSet<Integer> hi = new TreeSet<>();

        double []medians = new double [arr.length];
        /*
        * [2, 1, 3, 4, 2]
        *
        * lo = [1, 2, 2]
        * hi = [3, 4]
        * medians = [2.0, 1.5, 2.0, 2.5, 2.0]
        * */
        for(int i=0; i<arr.length; i++){
            if(lo.isEmpty()) lo.add(arr[i]);
            else if(hi.isEmpty()) {
                if(arr[i] >= lo.last()) hi.add(arr[i]);
                lo.add(arr[i]);
                balance(lo, hi);
            }
            else{
                if(hi.first() <= arr[i]){
                    hi.add(arr[i]);
                } else{
                    lo.add(arr[i]);
                }
                balance(lo, hi);
            }
            if((lo.size() + hi.size())%2 == 0){
                medians[i] = (1.0 * ((lo.last() + hi.first()))/2.0);
            } else{
                medians[i] = lo.last();
            }
        }
    }
}