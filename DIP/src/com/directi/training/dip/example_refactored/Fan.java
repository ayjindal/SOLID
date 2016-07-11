package com.directi.training.dip.example_refactored;

public class Fan implements Equipment
{
    private int _speed;

    @Override
    public void turnOn()
    {
        System.out.println("Fan turned on");
    }

    @Override
    public void turnOff()
    {
        System.out.println("Fan turned off");
    }

    public int getSpeed()
    {
        return _speed;
    }

    public void setSpeed(int speed)
    {
        _speed = speed;
    }
}
