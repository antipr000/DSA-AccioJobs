public class Inheritence {
    public static void main(String[] args) {
        // ComputerScienceStudents soham = new ComputerScienceStudents();

        // MechanicalStudents me = new MechanicalStudents();

        Circle circle = new Circle(7);

        Triangle triangle = new Triangle(12, 10);

        circle.printArea();

        triangle.printArea();

    }
}

class StudentClass{
    String name;
    char cgpa;
    String rollNo;
    int age;

    StudentClass(){
        System.out.println("Hello I am inside constructor of Students");
    }

    void cgpaBasedPerformanceReport(){

    }
}


class ComputerScienceStudents extends StudentClass{

    int computerLabScore;

    ComputerScienceStudents(){
        computerLabScore = 0;
        System.out.println("Hello I am inside constructor of ComputerStudents");   
    }
    

    void attendComputerLabExam(){
    }

}

class MechanicalStudents extends StudentClass{
    int machinesLabScore;

    MechanicalStudents(){
        System.out.println("Hello I am inside constructor of MechanicalStudents"); 
    }

    void attendMachinesLab(){

    }
}

class Shape{
    double printArea(){
        System.out.println("Inside base class printArea");
        return 0.0;
    }
}

class Circle extends Shape{
    int radius;

    Circle(int r){
        radius = r;
    }
    
    double printArea(){
        System.out.println("Inside circle area");
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape{
    int base, height;

    Triangle(int b, int h){
        base = b;
        height = h;
    }

}