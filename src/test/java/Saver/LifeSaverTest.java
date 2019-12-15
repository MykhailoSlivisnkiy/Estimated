package Saver;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LifeSaverTest {

    LifeSaver lifeSaver = new LifeSaver(5);

    @Test
    public void getPrice() {
        Assert.assertEquals(300, lifeSaver.getPrice());
    }
}