public class Employee extends Person {
    private String position;
    private double salary;

    // Default Constructor
    public Employee() {
        super();
    }

    // Parameterized Constructor
    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }

    // Getters and Setters
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString Method
    @Override
    public String toString() {
        return "Employee: " + super.toString();
    }

    // Payable Method
    @Override
    public double getPaymentAmount() {
        return salary;
    }
}
