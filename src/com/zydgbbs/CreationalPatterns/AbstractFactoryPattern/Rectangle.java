package com.zydgbbs.CreationalPatterns.AbstractFactoryPattern;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle Draw");
    }
}
