package uni;

import java.util.ArrayList;

public class Student {
    public int id;
    public int personID;
    public final int entranceYear;
    public int majorID;
    public String studentCode;
    public static ArrayList<Student> studentList = new ArrayList<>();

    public Student(int personID, int entranceYear, int majorID) {
        this.personID = personID;
        this.entranceYear = entranceYear;
        this.majorID = majorID;
        studentList.add(this);
    }

    public static Student findById(int id) {
        for (Student student : studentList) {
            if (student.id == id)
                return student;
        }
        return null;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }
}
