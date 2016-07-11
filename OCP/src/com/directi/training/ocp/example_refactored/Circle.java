package com.directi.training.ocp.example_refactored;

public class Circle extends Shape
{
    private final double _radius;

    public Circle(double radius)
    {
        _radius = radius;
    }

    public double getRadius()
    {
        return _radius;
    }

    @Override
    public double getArea()
    {
        return Math.PI * _radius * _radius;
    }
}
