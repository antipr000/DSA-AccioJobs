package com;

import com.whatsapp.services.InheritenceA;


class A{
    private int x; // 0 - 9
    private char grade; //A-F
    void setX(int newX){
        if(newX>=10) return;
        x = newX;
    }

    int getX(){
        return x;
    }

    void setGrade(char newGrade){
        if(newGrade >= 'A' && newGrade <= 'F'){
            grade = newGrade;
        }
    }

    char getGrade(){
        return grade;
    }
}

public class InheritenceD extends InheritenceA {


    public static void main(String[] args) {
        InheritenceD d = new InheritenceD();
        d.work1();
        d.work2();
        
        A a = new A();
        a.setX(5);
        System.out.println(a.getX());
        a.setX(20);
        System.out.println(a.getX());
        

        a.setGrade('B');
        a.setGrade('Z');
        System.out.println(a.getGrade());

    }
}
