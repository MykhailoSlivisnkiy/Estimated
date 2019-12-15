package Saver;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnusualVehicleTest {
    UnusualVehicle unusualVehicle = new UnusualVehicle(3);

    @Test
    public void getPrice() {
        Assert.assertEquals(60, unusualVehicle.getPrice());
    }
}