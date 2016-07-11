package com.directi.training.ocp.example_refactored;

import java.util.List;

public class AreaCalculator
{
    public void calculateArea(List<Shape> shapes)
    {
        double area = 0;
        for (Shape shape : shapes) {
            area += shape.getArea();
        }
        System.out.println("total area = " + area);
    }
}
