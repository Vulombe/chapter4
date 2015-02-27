package zm.hashcode.design.softwaredesignprinciples.ocp.correction;

/**
 * Created by student on 2015/02/27.
 */
public class NormalHours extends Salary
{
    private int normalHours;
    @Override
    public  double calculateSalary(){
        return normalHours * 0.2;
    }
}
