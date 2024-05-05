package company.models;

import company.abstracts.Employee;

public final class Worker extends Employee {

    private String task;

    public Worker(String employeeName, double annualSalary, int employeeId, String hireDate, String position, String task) {
        super(employeeName, annualSalary, employeeId, hireDate, position);
        this.task = task;
    }

    public void worker() { 
        System.out.println("Worker " + getName() + " is working on " + task);
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}
