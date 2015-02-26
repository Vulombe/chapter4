package zm.hashcode.design.objectorientedprinciples.encapsulation;

/**
 * Created by student on 2015/02/26.
 */
public class EncapsulationExample {
    private String name;
    private String surname;
    private String addres;
    private int age;

    public EncapsulationExample(String name, String surname, String addres, int age) {
        this.name = name;
        this.surname = surname;
        this.addres = addres;
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
        return "EncapsulationExample{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", addres='" + addres + '\'' +
                ", age=" + age +
                '}';
    }
}
