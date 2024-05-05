package company.models;
import company.abstracts.Employee;

public class Manager extends Employee {

    public Manager(String employeeName, double annualSalary, int employeeId) {
        super(employeeName, annualSalary, employeeId);
    }

    @Override
    public void work() {
        System.out.println("Manager " + getName() + " is managing...");
    }
}
