package zm.hashcode.design;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import zm.hashcode.design.objectorientedprinciples.polymorhism.DiliveryTruck;
import zm.hashcode.design.objectorientedprinciples.polymorhism.TowTruck;
import zm.hashcode.design.objectorientedprinciples.polymorhism.Truck;

/**
 * Created by student on 2015/02/27.
 */
public class TestPolymorphism
{
    private Truck t1;
    private Truck t2;
    @Before
    public void setUp() throws Exception {
        t1 = new TowTruck();
        t2 = new DiliveryTruck();

    }

    @Test
    public void testName() throws Exception {
        System.out.println("Tow Truck Speed is " + t1.getSpeed());
        System.out.println("Delivery truck speed is "+t2.getSpeed());
    }

    @After
    public void tearDown() throws Exception {

    }
}
