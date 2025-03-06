import base.Person;
import uni.*;

public class Main {
    public static void main(String[] args) {
        // رشته ها
        Major cs = new Major(1, "Computer Science", 3);
        Major ee = new Major(2, "Electrical Engineering", 2);

        //افراد
        Person person1 = new Person(1, "Fateme", "40212015");
        Person person2 = new Person(2, "Baran", "40312051");
        Person person3 = new Person(3, "Sina", "40412041");
        Person person4 = new Person(4, "Dr,Najafi", "2214150");
        Person person5 = new Person(5, "Dr.Yousefimehr", "22145150");

        // دانشجو ها و مشخصات
        Student student1 = new Student(1, 402, 1);
        student1.setStudentCode("123451");
        Student student2 = new Student(2, 401, 1);
        student2.setStudentCode("123452");
        Student student3 = new Student(3, 403, 2);
        student3.setStudentCode("123453");

        System.out.println(Person.findById(student1.personID).name + ": " + student1.studentCode);
        System.out.println(Person.findById(student2.personID).name + ": " + student2.studentCode);
        System.out.println(Person.findById(student3.personID).name + ": " + student3.studentCode);

        // اساتید
        Professor professor1 = new Professor(1, 4, 1);
        Professor professor2 = new Professor(2, 5, 2);
        System.out.println(Person.findById(professor1.personID).name + ": " + professor1.id);
        System.out.println(Person.findById(professor2.personID).name + ": " + professor2.id);

        //دروس
        Course course1 = new Course(1, "Topology", 3);
        Course course2 = new Course(2, "Matrix", 3);
        Course course3 = new Course(3, "Advanced PPrograming", 4);

        // دروسی که ارائه می شوند
        PresentedCourse presentedCourse1 = new PresentedCourse(1, 1, 1, 5);
        PresentedCourse presentedCourse2 = new PresentedCourse(2, 2, 1, 5);
        PresentedCourse presentedCourse3 = new PresentedCourse(3, 3, 2, 6);

        // اضافه کردن دانشجویان به کلاس های درسی
        try {
            presentedCourse1.addStudent(1);
            presentedCourse1.addStudent(2);
            presentedCourse2.addStudent(1);
            presentedCourse2.addStudent(2);
            presentedCourse2.addStudent(3);
            presentedCourse3.addStudent(3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // کارنامه دانشجویان
        Transcript transcript1 = new Transcript(1);
        Transcript transcript2 = new Transcript(2);
        Transcript transcript3 = new Transcript(3);

        // نمرات
        transcript1.setGrade(1, 20.0);
        transcript1.setGrade(2, 18.5);
        transcript2.setGrade(1, 20.0);
        transcript2.setGrade(2, 16.25);
        transcript3.setGrade(2, 19.5);
        transcript3.setGrade(3, 17.0);

        transcript1.printTranscript();
        System.out.println("GPA: " + transcript1.getGPA());

        transcript2.printTranscript();
        System.out.println("GPA: " + transcript2.getGPA());

        transcript3.printTranscript();
        System.out.println("GPA: " + transcript3.getGPA());
    }
}
