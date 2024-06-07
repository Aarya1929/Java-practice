package lab_exams_19;

interface Account {
    void set(String accNo, double balance);
    void display();
}

interface Person {
    void store(String name);
    void disp();
}

class Customer implements Account, Person {
    private String name;
    private String accountNumber;
    private double balance;

    public void set(String accNo, double balance) {
        this.accountNumber = accNo;
        this.balance = balance;
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("Interest: $" + calculateInterest());
    }

    public void store(String name) {
        this.name = name;
    }

    public void disp() {
        System.out.println("Name: " + name);
    }

    private double calculateInterest() {
        // Perform interest calculation logic here
        // For demonstration purposes, let's assume a fixed interest rate of 5%
        return balance * 0.05;
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Customer customer = new Customer();

        // Accept customer details
        customer.store("John Doe");
        customer.set("1234567890", 5000.0);

        // Display account information
        customer.disp();
        customer.display();
    }
}
