package company.models;

import company.abstracts.Employee;

public final class Worker extends Employee {

    public Worker(String employeeName, double annualSalary, int employeeId, String hireDate, String position) {
        super(employeeName, annualSalary, employeeId, hireDate, position);
    }

    @Override
    public void work() {
        System.out.println("Worker " + getName() + " is working...");
    }
}