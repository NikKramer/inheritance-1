package com.company;

import java.util.ArrayList;

public class Box extends Shape {
    double Ok;
    public ArrayList<Shape> Shapes = new ArrayList<>();

    public Box(double ok) {
        super(ok);
        this.Ok = ok;
    }

    public boolean Add(Shape shape){
        if(Ok>=shape.GetVolume()){
            Shapes.add(shape);
            Ok-=shape.GetVolume();
        return true;}
        return false;
    }
}
