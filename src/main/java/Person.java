package main.java;

// Model class of a person
public class Person {

//    This is the attributes of a person
    private String name;
    private int age;

//    Constructor
    public Person(String name, int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
        this.name = name;
    }

//    returns the persons name
    public String getName() {
        return name;
    }

//    Sets a new name for the person
    public void setName(String name) {
        this.name = name;
    }

//    returns the persons age
    public int getAge() {
        return age;
    }

//    Sets a new age for the person
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

//    Returns the persons name in reverse order
    public String reverseName(String name) {
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder.append(name).reverse().toString();
    }
}
