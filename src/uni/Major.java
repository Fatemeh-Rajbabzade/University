package uni;

import java.util.ArrayList;

public class Major {
    public int id;
    public String name;
    public int capacity;
    public int numberOfStudents;
    public static ArrayList<Major> majorList = new ArrayList<>();

    public Major(int id, String name, int capacity) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.numberOfStudents = 0;
        majorList.add(this);
    }

    public static Major findById(int id) {
        for (Major major : majorList) {
            if (major.id == id)
                return major;
        }
        return null;
    }

    public void addStudent() {
        if (numberOfStudents < capacity)
            numberOfStudents++;
        else
            System.out.println("Cannot accept more students!");
    }

    public void displayMajorInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Capacity: " + capacity + ", Students: " + numberOfStudents);
    }
}
