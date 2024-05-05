package company.abstracts;

import company.interfaces.Employable;

public abstract class Employee implements Employable {

    private final String name;
    private final double salary;
    public Employee(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
