package company.models;

import company.abstracts.Employee;

public class Manager extends Employee {

    public Manager(String employeeName, double annualSalary, int employeeId, String hireDate, String position) {
        super(employeeName, annualSalary, employeeId, hireDate, position);
    }

    public void manage() {
        System.out.println("Manager " + getName() + " is managing...");
    }

    public String getName() {
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }
}