package com.directi.training.isp.example;

public class Human implements Worker
{
    @Override
    public String work()
    {
        return "Human works";
    }

    @Override
    public String eat()
    {
        return "Human eats";
    }
}
