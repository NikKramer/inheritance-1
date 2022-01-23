package com.company;

public class SolidOfRevolution extends Shape {
    static double radius;

    public SolidOfRevolution(double volume, double radius) {
        super(volume);
        this.radius = radius;
    }

    public static double GetRadius(){
        return radius;
    }
}
