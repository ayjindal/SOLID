package com.directi.training.dip.example;

public class Lamp
{
    private int _color;

    public void turnOn()
    {
        System.out.println("Lamp turned on");
    }

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
