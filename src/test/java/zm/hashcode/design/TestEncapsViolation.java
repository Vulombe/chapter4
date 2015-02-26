package zm.hashcode.design;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import zm.hashcode.design.objectorientedprinciples.encapsulation.EncapsViolation;

/**
 * Created by student on 2015/02/26.
 */
public class TestEncapsViolation
{
    protected EncapsViolation person;
    @Before
    public void setUp() throws Exception {
        person = new EncapsViolation("Musa","Mabunda","Soweto",21);

    }

    @Test
    public void testName() throws Exception {
        System.out.print(person.toString());
    }

    @After
    public void tearDown() throws Exception {


    }
}
