package com.directi.training.isp.example_refactored;

import java.util.List;

public class FloorManager
{
    private List<IWorker> _workers;

    public FloorManager(List<IWorker> workers)
    {
        _workers = workers;
    }

    public void manage()
    {
        for (IWorker worker : _workers) {
            worker.work();
        }
    }
}
