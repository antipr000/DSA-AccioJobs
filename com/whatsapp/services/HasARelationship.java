package com.whatsapp.services;

class Engine{
    int horsePower;
    int fuelCapacity;
    int torque;
}

class DieselTypeEngine{

}

class Car{
    Engine engine;
}

class Bike{
    Engine bike;
}

class GeneralCourses{
    int englishMarks;
    int mechanicsMarks;
}

class ComputerScienceDept{
    GeneralCourses course;
}

class MechanicalDept{
    GeneralCourses course;
}



public class HasARelationship {
    public static void main(String[] args) {
        Car a = new Car();
    }
}
