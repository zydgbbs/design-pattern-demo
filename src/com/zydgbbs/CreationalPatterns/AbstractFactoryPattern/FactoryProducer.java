package com.zydgbbs.CreationalPatterns.AbstractFactoryPattern;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice==null)
            return null;
        if(choice.equalsIgnoreCase("shape"))
            return new ShapeFactory();
        else if(choice.equalsIgnoreCase("color"))
            return new ColorFactory();
        else
            return null;
    }
}
