package com.directi.training.isp.exercise_refactored;

import java.util.Random;

public class Sensor
{
    public void register(SensorClient sensorClient)
    {
        while (true) {
            if (isPersonClose()) {
                sensorClient.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose()
    {
        return new Random().nextBoolean();
    }
}
