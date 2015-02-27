package zm.hashcode.design.test.softwaredesignprinciples.isp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import zm.hashcode.design.softwaredesignprinciples.isp.correction.Car;
import zm.hashcode.design.softwaredesignprinciples.isp.correction.Ideliver;
import zm.hashcode.design.softwaredesignprinciples.isp.correction.Imove;
import zm.hashcode.design.softwaredesignprinciples.isp.correction.Truck;

/**
 * Created by student on 2015/02/27.
 */
public class IspTest
{
    private Truck truck;
    private Car car;
    @Before
    public void setUp() throws Exception {
        truck = new Truck();
        car = new Car();
    }

    @Test
    public void testName() throws Exception {
        truck.setSpd(10);
        car.setSpd(50);


    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Truck Speed is "+truck.move(truck.getSpd())+"\n"+"Delivering " + truck.getGoods());
        System.out.println("Car Speed is "+car.move(car.getSpd()));

    }

}
