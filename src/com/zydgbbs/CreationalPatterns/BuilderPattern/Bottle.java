package com.zydgbbs.CreationalPatterns.BuilderPattern;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
