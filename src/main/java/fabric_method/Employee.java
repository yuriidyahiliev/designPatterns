package fabric_method;

public class Employee {

    private int salary;

    private Employee() {
        salary = 10000;
        System.out.println("Security employee with salary: " + salary);
    }

    public static Employee create() {
        return new Employee();
    }
}
