package zm.hashcode.design.softwaredesignprinciples.plk.violation;

/**
 * Created by student on 2015/02/27.
 */
public class Employee
{
    private String name;
    private Person emp;

    {
        emp = new Person();
    }

    public Person getEmp() {
        return emp;
    }

    public void setEmp(Person emp) {
        this.emp = emp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
