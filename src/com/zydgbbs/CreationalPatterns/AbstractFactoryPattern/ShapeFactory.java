package com.zydgbbs.CreationalPatterns.AbstractFactoryPattern;

public class ShapeFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        return null;
    }

    public Shape getShape(String shapeType){
        if(shapeType==null)
            return null;
        if(shapeType.equalsIgnoreCase("circle"))
            return new Circle();
        else if(shapeType.equalsIgnoreCase("rectangle"))
            return new Rectangle();
        else if(shapeType.equalsIgnoreCase("square"))
            return new Square();
        else
            return null;
    }
}
