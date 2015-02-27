package zm.hashcode.design.softwaredesignprinciples.isp.correction;

/**
 * Created by student on 2015/02/27.
 */
public class Truck implements Ideliver, Imove
{
    private int spd;
    @Override
    public String getGoods(){
        return "Clothes";
    }

    @Override
    public int move(int speed)
    {
        return spd * 5;
    }

    public void setSpd(int spd) {
        this.spd = spd;
    }

    public int getSpd() {
        return spd;
    }
}
