package zm.hashcode.design.softwaredesignprinciples.ocp.correction;

import zm.hashcode.design.softwaredesignprinciples.srp.violation.Employee;

/**
 * Created by student on 2015/02/27.
 */
public class Overtime extends Salary
{
    private int overtimeHours;
    private int normalHours;

    @Override
    public double calculateSalary(){
        return (overtimeHours + normalHours) * 0.2;
    }
}
