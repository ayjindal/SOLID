package com.directi.training.lsp.example_refactored;

public class Square
{
    private int _side;

    public int getSide()
    {
        return _side;
    }

    public void setSide(int side)
    {
        _side = side;
    }

    public int getArea()
    {
        return _side * _side;
    }
}
