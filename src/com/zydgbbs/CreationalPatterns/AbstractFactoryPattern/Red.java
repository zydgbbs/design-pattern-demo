package com.zydgbbs.CreationalPatterns.AbstractFactoryPattern;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Fill Red");
    }
}
