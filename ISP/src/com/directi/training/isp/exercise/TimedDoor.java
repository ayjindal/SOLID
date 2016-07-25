package com.directi.training.isp.exercise;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class TimedDoor implements Door
{
    private static final int TIME_OUT = 100;
    private boolean _locked;
    private boolean _opened;

    public TimedDoor(Timer timer)
    {
        timer.register(TIME_OUT, this);
    }

    @Override
    public void lock()
    {
        _locked = true;
    }

    @Override
    public void unlock()
    {
        _locked = false;
    }

    @Override
    public void open()
    {
        if (!_locked) {
            _opened = true;
        }
    }

    @Override
    public void close()
    {
        _opened = false;
    }

    @Override
    public void timeOutCallback()
    {
        _locked = true;
    }

    @Override
    public void proximityCallback()
    {
        throw new NotImplementedException();
    }
}
