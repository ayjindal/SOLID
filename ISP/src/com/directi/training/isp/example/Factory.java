package com.directi.training.isp.example;

import java.util.List;

public class Factory
{
    private List<Worker> _workers;

    public Factory(List<Worker> workers)
    {
        _workers = workers;
    }

    public void manage()
    {
        for (Worker worker : _workers) {
            worker.work();
        }
    }

}
