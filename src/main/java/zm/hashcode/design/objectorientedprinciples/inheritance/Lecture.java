package zm.hashcode.design.objectorientedprinciples.inheritance;

/**
 * Created by student on 2015/02/26.
 */
public class Lecture extends InheritanceExample
{
    private int empNum;
    private String subject;

    public Lecture() {
    }

    public Lecture(String name, String surname, String addres, int age, int empNum, String subject) {
        super(name, surname, addres, age);
        this.empNum = empNum;
        this.subject = subject;
    }

    public void setEmpNum(int empNum) {
        this.empNum = empNum;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getEmpNum() {
        return empNum;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Lecture" +super.toString()+
                "empNum=" + empNum +
                ", subject='" + subject + '\'';
    }
}
