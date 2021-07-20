
import java.util.Scanner;


class A{
    public void work1(){
        System.out.println("I am inside work 1");
    }

    private void work2(){
        System.out.println("I am inside work 2");
    }

    protected void work3(){
        System.out.println("I am inside work 3");
    }
}

class B extends A{
    private void work4(){
        work1();
        work3();
    }
}

class Students{
    String name;
    int age;
    static String collegeName;
    
    static void fetchCoursesFromDatabase(){

    }

    void generateReportCard(){
        return;
    }
}

public class OopConcepts {
    //Body of the class  
    public static void main(String[] args) {
        A obj = new A();
        obj.work3();

    }
}

