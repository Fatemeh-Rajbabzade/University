package base;

import java.util.ArrayList;

public class Person {
    public int id;
    public String name;
    public String nationalID;
    public static ArrayList<Person> personList = new ArrayList<>();

    public Person(int id, String name, String nationalID) {
        this.id = id;
        this.name = name;
        this.nationalID = nationalID;
        personList.add(this);
    }

    public static Person findById(int id) {
        for (Person person : personList) {
            if (person.id == id) {
                return person;
            }
        }
        return null;
    }

    public void displayPersonInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", National ID: " + nationalID);
    }
}
