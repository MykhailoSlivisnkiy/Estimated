package Saver;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InvenstutionTest {

    Invenstution invenstution = new Invenstution(10);

    @Test
    public void getPrice() {
        Assert.assertEquals(300, invenstution.getPrice());
    }
}