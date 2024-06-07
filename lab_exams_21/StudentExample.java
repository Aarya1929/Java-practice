package lab_exams_21;

import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int grade;
    private List<String> courses;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }

    public void displayCourses() {
        System.out.println("Courses for " + name + ":");
        for (String course : courses) {
            System.out.println(course);
        }
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Grade: " + grade);
    }
}

public class StudentExample {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 10);
        student.displayStudentInfo();

        System.out.println("\nAdding courses...");
        student.addCourse("Mathematics");
        student.addCourse("English");
        student.addCourse("Science");
        student.displayCourses();

        System.out.println("\nRemoving course...");
        student.removeCourse("English");
        student.displayCourses();
    }
}
