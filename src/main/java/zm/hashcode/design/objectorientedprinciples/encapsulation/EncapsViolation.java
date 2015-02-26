package zm.hashcode.design.objectorientedprinciples.encapsulation;

/**
 * Created by student on 2015/02/26.
 */
public class EncapsViolation
{
    public String name;
    public String surname;
    public String addres;
    public int age;

    public EncapsViolation(String surname, String addres, String name, int age) {
        this.surname = surname;
        this.addres = addres;
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddres() {
        return addres;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "EncapsViolation{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", addres='" + addres + '\'' +
                ", age=" + age +
                '}';
    }
}
