package lab51.task1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {
    private Person per1;
    private Person per2;
    private Person per3;

    @Before
    public void setUp() {
        System.out.println("BeforeEach is executed before each test");
        per1 = new Person(1, "Huda Ayoub", 25, "Software Engineer");
        per2 = new Person(2, "Rawan Ayoub", 30, "Designer");
        per3 = new Person(3, "Reema Ayoub", 23, "Markting");
    }
    @Test
    public void testSetAgeValid() {
        per1.setAge(25);
        assertEquals(25, per1.getAge());
        System.out.println(per1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetAgeInvalid() {
        per1.setAge(-5);
        System.out.println(per2);
    }
    @Test
    public void testFindByNameFound() {
        Person[] people = { per1, per2, per3 };
        Person foundPerson = Person.findByName("Huda Ayoub", people);
        assertNotNull(foundPerson);
        assertEquals("Huda Ayoub", foundPerson.getName());
        System.out.println(per1);
    }

    @Test
    public void testFindByNameNotFound() {
        Person[] people = { per1, per2, per3 };
        Person foundPerson = Person.findByName("Ruba Ayoub", people);
        assertNull(foundPerson);
    }
}
