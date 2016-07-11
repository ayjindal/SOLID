package com.directi.training.isp.example;

public class Robot implements Worker
{
    @Override
    public String work()
    {
        return "Robot works";
    }

    @Override
    public String eat()
    {
        throw new RuntimeException("Robot can't eat");
    }
}
