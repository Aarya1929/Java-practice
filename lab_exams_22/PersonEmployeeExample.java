package lab_exams_22;

class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Employee extends Person {
    private int employeeId;
    private String jobTitle;

    public Employee(String firstName, String lastName, int employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public String getLastName() {
        return super.getLastName() + " (" + jobTitle + ")";
    }
}

public class PersonEmployeeExample {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe");
        System.out.println("Person's First Name: " + person.getFirstName());
        System.out.println("Person's Last Name: " + person.getLastName());

        System.out.println();

        Employee employee = new Employee("Jane", "Smith", 12345, "Manager");
        System.out.println("Employee's First Name: " + employee.getFirstName());
        System.out.println("Employee's Last Name (with Job Title): " + employee.getLastName());
        System.out.println("Employee's ID: " + employee.getEmployeeId());
    }
}
