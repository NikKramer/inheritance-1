package com.company;

public class Pyramid extends Shape {
    double s;
    double h;

    public Pyramid(double height, double s) {
        super(height * s * 4 / 3);
        this.h = height;
        this.s = s;
    }
}
