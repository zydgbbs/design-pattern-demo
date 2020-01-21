package com.zydgbbs.CreationalPatterns.PrototypePattern;

public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Circle draw");
    }
}
