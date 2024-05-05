package company;

import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Worker worker1 = new Worker("Jan Kowalski", 2500, 1, "2023-01-01", "Software Engineer");
        Worker worker2 = new Worker("Anna Nowak", 3000, 2, "2022-06-01", "Data Analyst");
        Worker worker3 = new Worker("Piotr Zieliński", 2200, 3, "2024-03-01", "Junior Developer");
        Worker worker4 = new Worker("Marta Wiśniewska", 2800, 4, "2023-05-01", "UX/UI Designer");

        Manager manager = new Manager("Krzysztof Baran", 5000, 5, "2020-02-01", "CTO");

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee employee : employees) {
            System.out.println("- " + employee.getName() + " (ID: " + employee.getId() + ", Position: " + employee.getPosition() + ", Hire Date: " + employee.getHireDate() + ")");
            employee.work();
        }
    }
}