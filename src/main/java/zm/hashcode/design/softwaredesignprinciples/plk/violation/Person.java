package zm.hashcode.design.softwaredesignprinciples.plk.violation;

/**
 * Created by student on 2015/02/27.
 */
public class Person
{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
