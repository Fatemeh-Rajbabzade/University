package uni;

import java.util.HashMap;

public class Transcript {
    public int studentID;
    public HashMap<Integer, Double> transcript;

    public Transcript(int studentID) {
        this.studentID = studentID;
        this.transcript = new HashMap<>();
    }

    public void setGrade(int presentedCourseID, double grade) {
        transcript.put(presentedCourseID, grade);
    }

    public void printTranscript() {
        System.out.println("Transcript for student ID: " + studentID);
        for (Integer courseID : transcript.keySet()) {
            System.out.println("Course ID: " + courseID + ", Grade: " + transcript.get(courseID));
        }
    }

    public double getGPA() {
        double total = 0;
        int count = 0;
        for (double grade : transcript.values()) {
            total += grade;
            count++;
        }
        return (count == 0) ? 0 : total / count;
    }
}
