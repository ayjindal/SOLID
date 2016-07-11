package com.directi.training.dip.example;

public class Button
{
    private Lamp _lamp;
    private boolean _state;

    public Button(Lamp lamp)
    {
        _lamp = lamp;
    }

    public void toggle()
    {
        _state = !_state;
        boolean buttonOn = _state;
        if (buttonOn) {
            _lamp.turnOn();
        } else {
            _lamp.turnOff();
        }
    }

}
