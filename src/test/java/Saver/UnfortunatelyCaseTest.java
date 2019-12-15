package Saver;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnfortunatelyCaseTest {

    UnfortunatelyCase unfortunatelyCase = new UnfortunatelyCase(5);

    @Test
    public void getPrice() {
        Assert.assertEquals(250,unfortunatelyCase.getPrice());
    }
}