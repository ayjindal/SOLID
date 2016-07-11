package com.directi.training.lsp.example;

public class Rectangle
{
    protected int _width;
    protected int _height;

    public int getWidth()
    {
        return _width;
    }

    public void setWidth(int width)
    {
        _width = width;
    }

    public int getHeight()
    {
        return _height;
    }

    public void setHeight(int height)
    {
        _height = height;
    }

    public int getArea()
    {
        return _width * _height;
    }
}
