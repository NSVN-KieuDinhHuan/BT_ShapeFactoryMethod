package com.company;

public class FactoryPatten {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("Circle");
        shape1.Draw();
        Shape shape2=shapeFactory.getShape("Square");
        shape2.Draw();
        Shape shape3=shapeFactory.getShape("Rectangle");
        shape3.Draw();
    }
}
