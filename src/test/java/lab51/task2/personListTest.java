package lab51.task2;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class personListTest {
    private personList person1;
    private personList person2;
    private personList person3;
    private ArrayList<personList> people;

    @Before
    public void setUp() {
        System.out.println("BeforeEach is executed before each test");
        person1 = new personList("111", "Elian", "White");
        person2 = new personList("222", "Arwa", "Trad");
        person3 = new personList("333", "Huda", "Ayoub");

        people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
    }

    @Test
    public void testFindByNameValid() {
        personList foundPerson = personList.findByName("Arwa Trad", people);
        assertNull(foundPerson);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindByNameInvalidFormat() {
        personList.findByName("Huda ", people);
    }

    @Test
    public void testClone() {
        personList clonedPerson = person1.clone();


        assertEquals(person1.getFirstName(), clonedPerson.getFirstName());
        assertEquals(person1.getLastName(), clonedPerson.getLastName());
        assertNotEquals(person1.getId(), clonedPerson.getId());
    }
}