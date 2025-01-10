import java.util.ArrayList;
import java.util.Collections;

public class MyApplication {

    public static void main(String[] args) {
        // Creating Employees and Students
        Employee e1 = new Employee("John", "Star", "Manager", 27045.78);
        Employee e2 = new Employee("George", "Harrison", "Engineer", 50000.00);
        Student s1 = new Student("Ringo", "McCartney", 2.5);
        Student s2 = new Student("Paul", "Harrison", 3.8);

        
        ArrayList<Payable> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(s1);
        list.add(s2);

        Collections.sort((ArrayList<Person>) (ArrayList<?>) list);

        
        printData(list);
    }

    
    public static void printData(Iterable<Payable> items) {
        for (Payable item : items) {
            Person person = (Person) item;
            System.out.println(person.toString() + " earns " + item.getPaymentAmount() + " tenge");
        }
    }
}
