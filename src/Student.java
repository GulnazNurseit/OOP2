public class Student extends Person {
    private double gpa;

    // Default Constructor
    public Student() {
        super();
    }

    // Parameterized Constructor
    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    // Getters and Setters
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // toString Method
    @Override
    public String toString() {
        return "Student: " + super.toString();
    }

    // Payable Method
    @Override
    public double getPaymentAmount() {
        return gpa > 2.67 ? 36660.00 : 0.00;
    }

    // Position Method
    @Override
    public String getPosition() {
        return "Student";
    }
}
