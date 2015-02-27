package zm.hashcode.design.objectorientedprinciples.inheritance;

/**
 * Created by student on 2015/02/26.
 */
public class StudentViolation extends Lecture
{
    private String sNumber;
    public StudentViolation(String name, String surname, String addres, int age, int empNum, String subject, String sNumber) {
        super(name, surname, addres, age, empNum, subject);
        this.sNumber = sNumber;
    }

    public String getsNumber() {
        return sNumber;
    }

    public void setsNumber(String sNumber) {
        this.sNumber = sNumber;
    }

    @Override
    public String toString() {
        return "StudentViolation{" +
                "sNumber='" + sNumber + '\'' +
                "} " + super.toString();
    }
}
