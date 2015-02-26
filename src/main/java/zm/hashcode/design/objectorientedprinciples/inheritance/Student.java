package zm.hashcode.design.objectorientedprinciples.inheritance;

/**
 * Created by student on 2015/02/26.
 */
public class Student extends InheritanceExample
{
    private String studentNumber;
    private String course;

    public Student(String name, String surname, String addres, int age, String studentNumber, String course)
    {
        super(name, surname, addres, age);
        this.studentNumber = studentNumber;
        this.course = course;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student "+ super.toString() +
                "studentNumber='" + studentNumber + '\'' +
                ", course='" + course + '\'';
    }
}
