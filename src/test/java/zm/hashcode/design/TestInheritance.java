package zm.hashcode.design;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import zm.hashcode.design.objectorientedprinciples.inheritance.InheritanceExample;
import zm.hashcode.design.objectorientedprinciples.inheritance.Lecture;
import zm.hashcode.design.objectorientedprinciples.inheritance.Student;

/**
 * Created by student on 2015/02/26.
 */
public class TestInheritance
{
    private InheritanceExample s1, l1;
    @Before
    public void setUp() throws Exception {
        l1 = new Lecture("Bruce","Makhubele","Midrand",30,101,"Technical Programming");
        s1 = new Student("Vulombe","Makhubele","WoodStock",21,"212068075","IT");

    }

    @Test
    public void testName() throws Exception {
        System.out.print(l1.toString());
        System.out.print("\n");
        System.out.print(s1.toString());
    }

    @After
    public void tearDown() throws Exception {


    }
}
