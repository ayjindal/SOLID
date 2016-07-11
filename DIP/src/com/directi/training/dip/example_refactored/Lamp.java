package com.directi.training.dip.example_refactored;

public class Lamp implements Equipment
{
    private int _color;

    @Override
    public void turnOn()
    {
        System.out.println("Lamp turned on");
    }

    @Override
    public void turnOff()
    {
        System.out.println("Lamp turned off");
    }

    public int getColor()
    {
        return _color;
    }

    public void setColor(int color)
    {
        _color = color;
    }
}
