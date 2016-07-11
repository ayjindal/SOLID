package com.directi.training.isp.example_refactored;

import java.util.List;

public class MessHall
{
    private List<IEater> _eaters;

    public MessHall(List<IEater> eaters)
    {
        _eaters = eaters;
    }

    public void manage()
    {
        for (IEater eater : _eaters) {
            eater.eat();
        }
    }
}
