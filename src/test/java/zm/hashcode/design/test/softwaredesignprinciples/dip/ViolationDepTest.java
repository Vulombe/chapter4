package zm.hashcode.design.test.softwaredesignprinciples.dip;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import zm.hashcode.design.softwaredesignprinciples.dip.Employee;
import zm.hashcode.design.softwaredesignprinciples.dip.Student;

/**
 * Created by student on 2015/02/27.
 */
public class ViolationDepTest
{
    private Student emp;
    @Before
    public void setUp() throws Exception {
        emp = new Student();

    }

    @Test
    public void testName() throws Exception {
        System.out.print("Emp name is " + emp.getname());

    }

    @After
    public void tearDown() throws Exception {


    }
}
