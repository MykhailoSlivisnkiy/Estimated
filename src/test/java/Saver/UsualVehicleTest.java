package Saver;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UsualVehicleTest {

    UsualVehicle usualVehicle = new UsualVehicle(10);

    @Test
    public void getPrice() {
        Assert.assertEquals(100, usualVehicle.getPrice());
    }
}