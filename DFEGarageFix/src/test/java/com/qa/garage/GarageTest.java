package com.qa.garage;

import com.qa.vehicles.Car;
import com.qa.vehicles.Vehicle;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GarageTest {
    private Car testCar = new Car(4, "CR22 TST", false);
    private List<Vehicle> expected = new ArrayList<Vehicle>();

    @Before
    public void before() {
        Garage.getInstance().addVehicle(testCar);
    }

    @After
    public void after() {
        Garage.getInstance().emptyGarage();
        Vehicle.setCount(0);
        expected.clear();
    }

    @Test
    public void addVehicleTest() {
        expected.add(testCar);
        assertEquals(expected, Garage.getInstance().getStorage());
    }

    @Test
    public void getByIDTest() {
        assertEquals(testCar, Garage.getInstance().getByID(1));
    }

    @Test
    public void removeByIDTest() {
        Garage.getInstance().removeByID(1);
        assertEquals(expected, Garage.getInstance().getStorage());
    }

    @Test
    public void fixByIDTest() {
        assertEquals("Vehicle ID 1 Costs $250", Garage.getInstance().fixByID(1));
    }

    @Test
    public void emptyGarageTest() {
        Garage.getInstance().addVehicle(testCar);
        Garage.getInstance().emptyGarage();
        assertEquals(expected, Garage.getInstance().getStorage());
    }
}
