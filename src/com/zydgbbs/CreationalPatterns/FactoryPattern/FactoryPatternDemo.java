package com.zydgbbs.CreationalPatterns.FactoryPattern;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("circle");
        circle.draw();
        Shape square = shapeFactory.getShape("square");
        square.draw();
    }
}
