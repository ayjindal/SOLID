package com.directi.training.isp.example;

import java.util.List;

public class MessHall
{
    private List<Worker> _workers;

    public MessHall(List<Worker> workers)
    {
        _workers = workers;
    }

    public void manage()
    {
        for (Worker worker : _workers) {
            worker.eat();
        }
    }

}
