import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("John", 50000, 1, "2022-01-01", "Junior Worker");
        Worker worker2 = new Worker("Alice", 45000, 2, "2022-02-15", "Senior Worker");
        Worker worker3 = new Worker("Bob", 40000, 1, "2022-03-10", "Junior Worker");
        Worker worker4 = new Worker("Eva", 42000, 4, "2022-04-20", "Senior Worker");
        Worker worker5 = new Worker("Kate", 48000, 6, "2022-05-25", "Junior Worker");
        Worker worker6 = new Worker("Tom", 52000, 7, "2022-06-30", "Senior Worker");

        Manager manager1 = new Manager("Mike", 75000, 5, "2021-12-01", "Project Manager");
        Manager manager2 = new Manager("Sophie", 80000, 8, "2021-11-15", "Senior Manager");

        // Adding all employees to the list
        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(worker5);
        employees.add(worker6);
        employees.add(manager1);
        employees.add(manager2);

        // Calculating total salaries
        double totalSalaryAll = 0;
        double totalSalaryManagers = 0;
        double totalSalaryWorkers = 0;

        // Creating a map to store employees by their id
        Map<Integer, Employee> idToEmployeeMap = new HashMap<>();
        for (Employee emp : employees) {
            idToEmployeeMap.put(emp.hashCode(), emp);
            totalSalaryAll += emp.getSalary();
            if (emp instanceof Manager) {
                totalSalaryManagers += emp.getSalary();
            } else {
                totalSalaryWorkers += emp.getSalary();
            }
        }

        // Displaying total salaries
        System.out.println("Total salary of all employees: " + totalSalaryAll);
        System.out.println("Total salary of all managers: " + totalSalaryManagers);
        System.out.println("Total salary of all workers: " + totalSalaryWorkers);

        // Searching for employees with matching ids
        for (Employee emp : employees) {
            Employee matchingEmployee = idToEmployeeMap.get(emp.hashCode());
            if (matchingEmployee != null && !matchingEmployee.equals(emp)) {
                System.out.println(emp.getName() + " has a matching employee with id: " + emp.hashCode());
            }
        }
    }
}
