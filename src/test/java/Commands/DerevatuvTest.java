package Commands;

import Saver.*;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DerevatuvTest {

    @Test
    public void add() {
        Derevatuv.add(new UsualVehicle(5));

        Assert.assertEquals(new UsualVehicle(5), Derevatuv.getSaver().get(0));
    }

    @Test
    public void delete() {
        Derevatuv.add(new UsualVehicle(5));
        Derevatuv.add(new LifeSaver(2));

        Derevatuv.delete(1);

        Derevatuv.add(new UsualVehicle(2));

        Assert.assertNotNull(Derevatuv.getSaver().get(1));
    }

    @Test
    public void deleteAll() {
        Derevatuv.add(new UsualVehicle(5));
        Derevatuv.add(new LifeSaver(2));

        Derevatuv.deleteAll();

        Assert.assertEquals(0, Derevatuv.getSaver().size());
    }

}