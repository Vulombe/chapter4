package zm.hashcode.design.softwaredesignprinciples.isp.violation;

/**
 * Created by student on 2015/02/27.
 */
public class Car implements Vehicle
{
    private int spd;
    @Override
    public int move(int speed)
    {
        return 5 * spd;
    }
}
