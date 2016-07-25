package com.directi.training.srp.exercise_refactored;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarManagerTest
{
    private CarManager _carManager;

    @Before
    public void setUp() throws Exception
    {
        _carManager = new CarManager(new CarDao(), new CarFormatter(), new CarRater());
    }

    @Test
    public void testGetCarById() throws Exception
    {
        Car car = _carManager.getCarById("1");
        assertEquals("Volkswagen", car.getBrand());
        assertEquals("Golf III", car.getModel());
    }

    @Test
    public void testGetCarsNames() throws Exception
    {
        String carsNames = _carManager.getCarsNames();
        assertEquals("Volkswagen Golf III, Fiat Multipla, Renault Megane", carsNames);
    }

    @Test
    public void testGetBestCar() throws Exception
    {
        Car bestCar = _carManager.getBestCar();
        assertEquals("Fiat", bestCar.getBrand());
        assertEquals("Multipla", bestCar.getModel());
    }
}
