package company.models;

import company.abstracts.Employee;

public final class Worker extends Employee {

    public Worker(String employeeName, double annualSalary, int employeeId) {
        super(employeeName, annualSalary, employeeId);
    }

    @Override
    public void performTask() {
        System.out.println("Worker " + getName() + " is working...");
    }

    public void work() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'work'");
    }
}