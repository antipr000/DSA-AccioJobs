package com;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapImpl {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("Soham", 10);
        tm.put("Abhishek", 20);
        tm.put("Vaibhav", 30);
        tm.put("Aniket", 15);

        tm.put("Shubham", 25);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name of student");
        String name = sc.next();
        sc.nextLine();
        System.out.println("Marks of " + name + " is: " + tm.get(name));

        for(Map.Entry<String, Integer> e: tm.entrySet()){
            System.out.println("Key is: " + e.getKey() + " and value is: " + e.getValue());
        }

        System.out.println(tm.subMap("Abhishek", "Soham"));
    }
}

/*
*
* A[], N, K. You have to find number of sub arrays that have a sum divisible by K.
* K = 5
* A[] = [2, 1, 3, 2, 5, 2]
* P  =  [2, 3, 6, 8, 13, 15] -> 4
*  (l, r] -> (pre[r] - pre[l])%K = 0
*
* pre[r]%K - pre[l]%K = 0 or pre[r]%K = pre[l]%K
* */

class DivisibleByK{
    public int countSubarraysDivisibleByK(int []arr, int k){
        int n = arr.length;
        int []p = new int[n];
        p[0] = arr[0];
        for(int i=1;i<n;i++){
            p[i] = p[i-1] +  arr[i];
        }

        int ans = 0;
        /*
        * A[] = [2, 1, 3, 2, 5, 2]
        * P   = [2, 3, 6, 8, 13, 15]
        * freq = {
        *   0: 1
        *   1: 1
        *   2: 1
        *   3: 3
        * }
        *
        * ans = 4;
        * */

        TreeMap<Integer, Integer> freq = new TreeMap<>();

        for(int i=0; i<n; i++){
            if(p[i]%k == 0) ans++;
            ans += freq.getOrDefault(p[i]%k, 0);

            freq.put(p[i]%k, freq.getOrDefault(p[i]%k, 0) + 1);
        }

        return ans;
    }
}

class ExaminationPortal{
    ArrayList<Student> students;
    TreeMap<String, Student> studentTreeMap;

    ExaminationPortal(){
        students = new ArrayList<>();
        studentTreeMap = new TreeMap<>();
    }

    int getMarks(String studentId){
        if(studentTreeMap.containsKey(studentId)){
            return studentTreeMap.get(studentId).marks;
        }
        return -1;
    }
}

class Student{
    String id;
    String name;
    int marks;
}
