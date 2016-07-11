package com.directi.training.ocp.example;

import java.util.List;

public class AreaCalculator
{
    public void calculateArea(List<Shape> shapes)
    {
        double area = 0;
        for (Shape shape : shapes) {
            if (shape.getType() == ShapeType.SQUARE) {
                area += calculateSquareArea((Square) shape);
            } else if (shape.getType() == ShapeType.CIRCLE) {
                area += calculateCircleArea((Circle) shape);
            }
        }
        System.out.println("total area = " + area);
    }

    public double calculateSquareArea(Square square)
    {
        return square.getSide() * square.getSide();
    }

    public double calculateCircleArea(Circle circle)
    {
        return Math.PI * circle.getRadius() * circle.getRadius();
    }
}
