package Saver;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HealthAndSickTest {

    HealthAndSick healthAndSick = new HealthAndSick(2);

    @Test
    public void getPrice() {
        Assert.assertEquals(80, healthAndSick.getPrice());
    }
}