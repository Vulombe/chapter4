package zm.hashcode.design.softwaredesignprinciples.isp.correction;

/**
 * Created by student on 2015/02/27.
 */
public class Car implements Imove
{
    private int spd;
    @Override
    public int move(int speed)
    {
        return 5 * spd;
    }

    public void setSpd(int spd) {
        this.spd = spd;
    }

    public int getSpd() {
        return spd;
    }
}
