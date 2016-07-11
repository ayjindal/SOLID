package com.directi.training.dip.example_refactored;

public class Button
{
    private boolean _state;
    private Equipment _equipment;

    public Button(Equipment equipment)
    {
        _equipment = equipment;
    }

    public void toggle()
    {
        _state = !_state;
        boolean buttonOn = _state;
        if (buttonOn) {
            _equipment.turnOn();
        } else {
            _equipment.turnOff();
        }
    }

}
