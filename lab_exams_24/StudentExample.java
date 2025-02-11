package lab_exams_24;

class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age should be between 15 and 21.");
        }

        if (!name.matches("^[a-zA-Z ]+$")) {
            throw new NameNotValidException("Name should only contain alphabets and spaces.");
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void displayStudentInfo() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class StudentExample {
    public static void main(String[] args) {
        try {
            Student student1 = new Student(101, "John Doe", 20, "Computer Science");
            student1.displayStudentInfo();
            System.out.println();

            // Invalid age
            Student student2 = new Student(102, "Jane Smith", 14, "Mathematics");
            student2.displayStudentInfo();
            System.out.println();

            // Invalid name
            Student student3 = new Student(103, "Robert123", 18, "Physics");
            student3.displayStudentInfo();
        } catch (AgeNotWithinRangeException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (NameNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
