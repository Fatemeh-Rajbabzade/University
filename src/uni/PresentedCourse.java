package uni;

import java.util.ArrayList;

public class PresentedCourse {
    public int id;
    public int courseID;
    public int professorID;
    public int capacity;
    public static ArrayList<PresentedCourse> presentedCourseList = new ArrayList<>();
    public ArrayList<Integer> studentIds = new ArrayList<>();

    public PresentedCourse(int id, int courseID, int professorID, int maxCapacity) {
        this.id = id;
        this.courseID = courseID;
        this.professorID = professorID;
        this.capacity = maxCapacity;
    }

    public static PresentedCourse findById(int ID) {
        for (PresentedCourse presentedCourse : presentedCourseList) {
            if (presentedCourse.id == ID)
                return presentedCourse;
        }
        return null;
    }

    public void addStudent(int studentID) throws Exception {
        if (studentIds.size() < capacity) {
            studentIds.add(studentID);
        } else {
            throw new Exception("Cannot add more students. Capacity reached.");
        }
    }

    public void displayCourseInfo() {
        System.out.println("Course ID: " + courseID + ", Professor ID: " + professorID + ", Capacity: " + capacity + ", Enrolled Students: " + studentIds.size());
    }
}
