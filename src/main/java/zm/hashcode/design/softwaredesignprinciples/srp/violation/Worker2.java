package zm.hashcode.design.softwaredesignprinciples.srp.violation;

/**
 * Created by student on 2015/02/27.
 */
public class Worker2 implements Employee
{
    @Override
    public String getEmpName(){
        return "Vulombe";
    }

    @Override
    public String getPosition(){
        return "Programmer";
    }
    @Override
    public int calculateSalary(){
        return 10000 *8;
    }
}
