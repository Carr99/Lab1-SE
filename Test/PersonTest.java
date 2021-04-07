import main.java.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class PersonTest {
    private String name;
    private int age;
    private Person person;

    @BeforeEach
    void setup(){
        name = "John";
        age = 34;
        person = new Person(name, age);
    }
    @Test
    void constructor(){
        age = -1;
        int expectedAge = 0;
        person = new Person(name, age);
        Assertions.assertEquals(expectedAge, person.getAge());
    }
    @Test
    void getName() {
        String returnedName = person.getName();
        Assertions.assertEquals(name, returnedName);
    }

    @Test
    void setName() {
        String newName = "Conny";
        person.setName(newName);
        Assertions.assertEquals(newName, person.getName());
    }

    @Test
    void getAge() {
        int returnedAge = person.getAge();
        Assertions.assertEquals(age, returnedAge);
    }

    @Test
    void setAge() {
        int newAge = 63;
        person.setAge(newAge);
        Assertions.assertEquals(newAge, person.getAge());
    }
    @Test
    void setAgeNegative(){
        int newAge = -1;
        int expectedAge = 0;
        person.setAge(newAge);
        Assertions.assertEquals(expectedAge, person.getAge());
    }

    @Test
    void reverseName() {
        StringBuilder stringBuilder = new StringBuilder();
        String reversed = stringBuilder.append(name).reverse().toString();
        Assertions.assertEquals(reversed, person.reverseName(name));

    }
}