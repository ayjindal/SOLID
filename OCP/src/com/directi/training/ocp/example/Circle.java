package com.directi.training.ocp.example;

public class Circle extends Shape
{
    private final double _radius;

    public Circle(double radius)
    {
        _shapeType = ShapeType.CIRCLE;
        _radius = radius;
    }

    public double getRadius()
    {
        return _radius;
    }
}
