package Commands;

import Saver.*;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {

    @Test
    public void execute() {
        Derevatuv.deleteAll();

        Derevatuv.add(new Invenstution(10));
        Derevatuv.add(new UnfortunatelyCase(2));
        Derevatuv.add(new UsualVehicle(3));
        Derevatuv.add(new LifeSaver(1));
        Derevatuv.add(new HealthAndSick(3));

        Sort sort = new Sort();

        sort.execute();

        Assert.assertEquals(new UsualVehicle(3), Derevatuv.getSaver().get(0));
    }
}