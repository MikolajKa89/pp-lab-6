import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        List<Employee> employees = createEmployees();
        calculateSalaries(employees);
        searchForDuplicateIds(employees);

        // Add more employees with duplicate IDs
        employees.add(new Worker("Grzegorz Wiśniewski", 3500, 1, "2022-08-01", "Software Developer", null));
        employees.add(new Manager("Anna Kowalska", 6000, 5, "2021-01-01", "CEO"));

        searchForDuplicateIds(employees);
    }

    private static List<Employee> createEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Worker("Jan Kowalski", 2500, 1, "2023-01-01", "Software Engineer", null));
        employees.add(new Worker("Anna Nowak", 3000, 1, "2022-06-01", "Data Analyst", null));
        employees.add(new Worker("Piotr Zieliński", 2200, 3, "2024-03-01", "Junior Developer", null));
        employees.add(new Worker("Marta Wiśniewska", 2800, 4, "2023-05-01", "UX/UI Designer", null));
        employees.add(new Manager("Krzysztof Baran", 5000, 5, "2020-02-01", "CTO"));
        return employees;
    }

    private static void calculateSalaries(List<Employee> employees) {
        double totalSalary = 0;
        double totalManagerSalary = 0;
        double totalWorkerSalary = 0;

        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
            if (employee instanceof Manager) {
                totalManagerSalary += employee.getSalary();
            } else if (employee instanceof Worker) {
                totalWorkerSalary += employee.getSalary();
            }
        }

        System.out.println("\nCałkowita suma pensji wszystkich pracowników: " + totalSalary);
        System.out.println("Całkowita suma pensji wszystkich managerów: " + totalManagerSalary);
        System.out.println("Całkowita suma pensji wszystkich pracowników fizycznych: " + totalWorkerSalary);
    }

    private static void searchForDuplicateIds(List<Employee> employees) {
        Map<Integer, Employee> employeeMap = new HashMap<>();
        for (Employee employee : employees) {
            if (employeeMap.containsKey(employee.getId())) {
                System.out.println("Znaleziono powtarzające się ID: " + employee.getId());
                System.out.println("Obiekt 1: " + employeeMap.get(employee.getId()));
                System.out.println("Obiekt 2: " + employee);
                System.out.println();
            } else {
                employeeMap.put((Integer) employee.getId(), employee);
            }
        }
    }
}