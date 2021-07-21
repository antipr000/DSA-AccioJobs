import java.lang.Math;

interface Shape1{
    String color = "blue";
    double area(); //abstract method
}

abstract class Shape2{
    abstract void printArea();

    void printInConsole(){
        System.out.println("Hello world");
    }
}

class Circle1 extends Shape2 implements Shape1{
    int radius;

    Circle1(int r){
        radius = r;
    }

    void printArea(){

    }

    int getRadius(){
        return radius;
    }

    public double area(){
        return Math.PI * radius * radius;
    }



}

class Triangle1 implements Shape1{
    int base, height;

    Triangle1(int b, int h){
        base = b;
        height = h;
    }
    public double area(){
        return 0.5 * base * height;
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Circle1 circle = new Circle1(7);
        Triangle1 triangle1 = new Triangle1(10, 12);

        System.out.println(circle.area());
        System.out.println(triangle1.area());

        System.out.println(circle.color);
        System.out.println(triangle1.color);
    }
}
