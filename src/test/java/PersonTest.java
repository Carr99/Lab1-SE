import main.java.Person;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class PersonTest {

    private String name;
    private int age;
    private main.java.Person person;

    @Before
    public void setup() {
        name = "john";
        age = 34;
        person = new Person(name, age);
    }

    @Test
    public void constructor() {
        age = -1;
        int expectedAge = 0;
        person = new main.java.Person(name, age);
        assertEquals(expectedAge, person.getAge());
    }

    @Test
    public void getName() {
        String returnedName = person.getName();
        assertEquals(name, returnedName);
    }

    @Test
    public void setName() {
        String newName = "Conny";
        person.setName(newName);
        assertEquals(newName, person.getName());
    }

    @Test
    public void getAge() {
        int returnedAge = person.getAge();
        assertEquals(age, returnedAge);
    }

    @Test
    public void setAge() {
        int newAge = 63;
        person.setAge(newAge);
        assertEquals(newAge, person.getAge());
    }

    @Test
    public void setAgeNegative() {
        int newAge = -1;
        int expectedAge = 0;
        person.setAge(newAge);
        assertEquals(expectedAge, person.getAge());
    }

    @Test
    public void reverseName() {
        StringBuilder stringBuilder = new StringBuilder();
        String reversed = stringBuilder.append(name).reverse().toString();
        assertEquals(reversed, person.reverseName(name));

    }
}