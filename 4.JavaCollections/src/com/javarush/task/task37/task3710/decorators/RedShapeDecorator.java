package com.javarush.task.task37.task3710.decorators;

import com.javarush.task.task37.task3710.shapes.Shape;

public class RedShapeDecorator extends ShapeDecorator {
    private Shape shape;

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
        shape = decoratedShape;
    }

    @Override
    public void draw() {
        setBorderColor(shape);
        super.draw();
    }

    private void setBorderColor(Shape shapeDecorator) {
        System.out.println(String.format("Setting the border color for %s to red.", shapeDecorator.getClass().getSimpleName()));
    }
}
