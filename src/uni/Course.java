package uni;

import java.util.ArrayList;

public class Course {
    public int id;
    public String title;
    public int units;
    public static ArrayList<Course> courseList = new ArrayList<>();

    public Course(int id, String title, int units) {
        this.id = id;
        this.title = title;
        this.units = units;
        courseList.add(this);
    }

    public static Course findById(int ID) {
        for (Course course : courseList) {
            if (course.id == ID)
                return course;
        }
        return null;
    }

    public void displayCourseInfo() {
        System.out.println("ID: " + id + ", Title: " + title + ", Units: " + units);
    }
}
